package com.x.bbs.assemble.control.jaxrs.subjectinfo;

import com.x.base.core.exception.PromptException;

class AttachmentNotExistsException extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	AttachmentNotExistsException( String id ) {
		super("指定ID的附件信息不存在.ID:" + id );
	}
}
