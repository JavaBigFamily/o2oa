package com.x.cms.assemble.control.servlet.file.download;

import com.x.base.core.exception.PromptException;

class ResponseHeaderSetException extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;
	
	public ResponseHeaderSetException(Throwable e ) {
		super("系统下载文件时设置responseHeader时发生异常.", e);
	}
}
