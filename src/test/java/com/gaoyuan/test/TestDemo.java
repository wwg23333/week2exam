package com.gaoyuan.test;

import org.junit.Test;

import com.gaoyuan.utils.StringUtils;

public class TestDemo {
	//截取换行符，替换
	@Test
	public void testToHtml() {
		String html = StringUtils.toHtml("9月5日一大早，又有了新情况。<\r>上午9点多，传出中美经贸高级别磋商牵头人通话的消息。<\n\r>9月5日上午，中共中央政治局委员、国务院副总理、中美全面经济对话中方牵头人刘鹤应约与美国贸易代表莱特希泽、财政部长姆努钦通话。<\n>");
		System.out.println(html);
	}
	//测试手机号是否正确
	@Test
	public void testToPhone() {
		boolean phone = StringUtils.isPhone("18994562345");
		System.out.println(phone);
	}
	//测试邮箱是否正确
	@Test
	public void testToEmail() {
		boolean email = StringUtils.isEmail("895646@qq.com");
		System.out.println(email);
	}
}
