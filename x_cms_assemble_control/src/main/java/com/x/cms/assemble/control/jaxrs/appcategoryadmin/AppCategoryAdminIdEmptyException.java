package com.x.cms.assemble.control.jaxrs.appcategoryadmin;

import com.x.base.core.exception.PromptException;

class AppCategoryAdminIdEmptyException extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	AppCategoryAdminIdEmptyException() {
		super("应用栏目分类管理员配置信息ID为空，无法继续查询数据。" );
	}
}
