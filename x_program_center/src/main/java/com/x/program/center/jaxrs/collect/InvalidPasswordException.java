package com.x.program.center.jaxrs.collect;

import com.x.base.core.exception.PromptException;

class InvalidPasswordException extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	InvalidPasswordException() {
		super("密码过于简单.");
	}
}
