package com.x.cms.assemble.control.jaxrs.fileinfo;

import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.x.base.core.cache.ApplicationCache;
import com.x.base.core.container.EntityManagerContainer;
import com.x.base.core.container.factory.EntityManagerContainerFactory;
import com.x.base.core.http.ActionResult;
import com.x.base.core.http.EffectivePerson;
import com.x.cms.assemble.control.Business;
import com.x.cms.assemble.control.WrapTools;
import com.x.cms.assemble.control.factory.FileInfoFactory;
import com.x.cms.core.entity.FileInfo;

import net.sf.ehcache.Element;

public class ExcuteListByDocId extends ExcuteBase {
	
	@SuppressWarnings("unchecked")
	protected ActionResult<List<WrapOutFileInfo>> execute( HttpServletRequest request, EffectivePerson effectivePerson, String documentId ) throws Exception {
		ActionResult<List<WrapOutFileInfo>> result = new ActionResult<>();
		List<WrapOutFileInfo> wraps = null;
		String cacheKey = ApplicationCache.concreteCacheKey( "document", documentId );
		Element element = cache.get(cacheKey);
		
		if ((null != element) && ( null != element.getObjectValue()) ) {
			wraps = ( List<WrapOutFileInfo> ) element.getObjectValue();
			result.setData(wraps);
		} else {
			try (EntityManagerContainer emc = EntityManagerContainerFactory.instance().create()) {			
				Business business = new Business(emc);			
				//如判断用户是否有查看所有文件或者附件的权限，如果没权限不允许继续操作
				if (!business.fileInfoEditAvailable( request, effectivePerson )) {
					throw new Exception("[listFileInfoByDocumentId]person{name:" + effectivePerson.getName() + "} 用户没有查询全部文件或者附件的权限！");
				}			
				//如果有权限，继续操作
				FileInfoFactory fileInfoFactory  = business.getFileInfoFactory();
				List<String> ids = fileInfoFactory.listByDocument( documentId );//获取指定文档的所有附件列表
				List<FileInfo> fileInfoList = fileInfoFactory.list( ids );//查询ID IN ids 的所有文件或者附件信息列表
				wraps =  WrapTools.file_wrapout_copier.copy( fileInfoList );//将所有查询出来的有状态的对象转换为可以输出的过滤过属性的对象
				Collections.sort( wraps );
				cache.put(new Element( cacheKey, wraps ));	
				result.setData(wraps);
			} catch (Throwable th) {
				th.printStackTrace();
				result.error(th);
			}
		}
		
		return result;
	}

}