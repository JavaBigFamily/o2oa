package com.x.okr.assemble.control.jaxrs.statistic;

import com.x.base.core.exception.PromptException;

class ReportStatisitcWrapOutException extends PromptException {

	private static final long serialVersionUID = 1859164370743532895L;

	ReportStatisitcWrapOutException( Throwable e ) {
		super("将查询结果转换为可以输出的数据信息时发生异常。", e );
	}
}
