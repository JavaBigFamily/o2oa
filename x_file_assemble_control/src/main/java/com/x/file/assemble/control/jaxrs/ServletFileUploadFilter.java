package com.x.file.assemble.control.jaxrs;

import javax.servlet.annotation.WebFilter;

import com.x.base.core.application.jaxrs.CipherManagerUserJaxrsFilter;

@WebFilter(urlPatterns = "/servlet/file/upload/*")
public class ServletFileUploadFilter extends CipherManagerUserJaxrsFilter {

}
