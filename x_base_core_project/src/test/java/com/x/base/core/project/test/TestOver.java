package com.x.base.core.project.test;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class TestOver {

	public void exe(Integer i) {
		System.out.println("exe integer:" + i);
	}

	public void exe(Number n) {
		System.out.println("exe number:" + n);
	}

	public void exe(Double d) {
		System.out.println("exe double:" + d);
	}

	@Test
	public void test2() {
		String str = "aaa{},bbb{},ccc.";
		System.out.println(StringUtils.replaceEachRepeatedly(str, new String[] { "{}" }, new String[] { "111" }));
	}

}
