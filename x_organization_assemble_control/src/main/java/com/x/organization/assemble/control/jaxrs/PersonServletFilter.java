package com.x.organization.assemble.control.jaxrs;

import javax.servlet.annotation.WebFilter;

import com.x.base.core.application.jaxrs.ManagerUserJaxrsFilter;

@WebFilter(urlPatterns = { "/servlet/input/person" })
public class PersonServletFilter extends ManagerUserJaxrsFilter {

}
