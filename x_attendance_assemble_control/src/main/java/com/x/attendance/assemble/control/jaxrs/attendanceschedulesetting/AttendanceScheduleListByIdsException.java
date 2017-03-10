package com.x.attendance.assemble.control.jaxrs.attendanceschedulesetting;

import com.x.base.core.exception.PromptException;

class AttendanceScheduleListByIdsException extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	AttendanceScheduleListByIdsException( Throwable e ) {
		super("系统根据ID列表查询指定组织排班信息列表时发生异常.", e );
	}
}
