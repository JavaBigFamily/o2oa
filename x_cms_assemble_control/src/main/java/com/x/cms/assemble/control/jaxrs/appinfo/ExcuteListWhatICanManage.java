package com.x.cms.assemble.control.jaxrs.appinfo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.x.base.core.cache.ApplicationCache;
import com.x.base.core.http.ActionResult;
import com.x.base.core.http.EffectivePerson;
import com.x.base.core.logger.Logger;
import com.x.base.core.logger.LoggerFactory;
import com.x.base.core.utils.SortTools;
import com.x.cms.assemble.control.WrapTools;
import com.x.cms.assemble.control.jaxrs.categoryinfo.WrapOutCategoryInfo;
import com.x.cms.core.entity.AppInfo;
import com.x.cms.core.entity.CategoryInfo;

import net.sf.ehcache.Element;

public class ExcuteListWhatICanManage extends ExcuteBase {

	private Logger logger = LoggerFactory.getLogger( ExcuteListWhatICanManage.class );
	
	@SuppressWarnings("unchecked")
	protected ActionResult<List<WrapOutAppInfo>> execute( HttpServletRequest request, EffectivePerson effectivePerson ) throws Exception {
		ActionResult<List<WrapOutAppInfo>> result = new ActionResult<>();
		List<WrapOutAppInfo> wraps = null;
		List<AppInfo> appInfoList = null;
		List<CategoryInfo> catacoryList = null;
		List<WrapOutCategoryInfo> wrapOutCatacoryList = null;
		List<String> app_ids = null;
		Boolean isXAdmin = false;
		Boolean check = true;
		
		try {
			isXAdmin = effectivePerson.isManager();
		} catch (Exception e) {
			check = false;
			Exception exception = new UserManagerCheckException( e, effectivePerson.getName() );
			result.error( exception );
			logger.error( exception, effectivePerson, request, null);
		}
		
		String cacheKey = ApplicationCache.concreteCacheKey( "manage", effectivePerson.getName(), isXAdmin );
		Element element = cache.get(cacheKey);
		
		if ((null != element) && ( null != element.getObjectValue()) ) {
			wraps = ( List<WrapOutAppInfo> ) element.getObjectValue();
			result.setData(wraps);
		} else {
			if( check ){
				if ( isXAdmin ) {
					try {
						appInfoList = appInfoServiceAdv.listAll();
					} catch (Exception e) {
						check = false;
						Exception exception = new AppInfoListAllException( e );
						result.error( exception );
						logger.error( exception, effectivePerson, request, null);
					}
				}else{
					try {
						app_ids = appInfoServiceAdv.listAdminPermissionAppInfoByUser( effectivePerson.getName() );
						if( app_ids != null && !app_ids.isEmpty() ){
							try {
								appInfoList = appInfoServiceAdv.list( app_ids );
							} catch (Exception e) {
								check = false;
								Exception exception = new AppInfoListByIdsException( e );
								result.error( exception );
								logger.error( exception, effectivePerson, request, null);
							}
						}
					} catch (Exception e) {
						check = false;
						Exception exception = new AppInfoListManageableInPermissionException( e, effectivePerson.getName() );
						result.error( exception );
						logger.error( exception, effectivePerson, request, null);
					}
				}
			}
			if( check ){
				if( appInfoList != null && !appInfoList.isEmpty() ){
					try {
						wraps = WrapTools.appInfo_wrapout_copier.copy( appInfoList );
						SortTools.desc( wraps, "appInfoSeq");
						cache.put(new Element( cacheKey, wraps ));
						result.setData(wraps);
					} catch (Exception e) {
						check = false;
						Exception exception = new AppInfoWrapOutException( e );
						result.error( exception );
						logger.error( exception, effectivePerson, request, null);
					}
				}
			}
			if( check ){
				if (wraps != null && wraps.size() > 0) {
					for ( WrapOutAppInfo appInfo : wraps ) {
						try {
							catacoryList = categoryInfoServiceAdv.list( appInfo.getCategoryList() );
						} catch (Exception e ) {
							check = false;
							Exception exception = new CategoryInfoListByIdsException( e );
							result.error( exception );
							logger.error( exception, effectivePerson, request, null);
						}
						if( catacoryList != null && !catacoryList.isEmpty() ){
							try {
								wrapOutCatacoryList = WrapTools.category_wrapout_copier.copy( catacoryList );
								appInfo.setWrapOutCategoryList( wrapOutCatacoryList );
							} catch (Exception e) {
								check = false;
								Exception exception = new CategoryInfoWrapOutException( e );
								result.error( exception );
								logger.error( exception, effectivePerson, request, null);
							}
						}
					}		
				}
			}
		}		
		return result;
	}
	
}