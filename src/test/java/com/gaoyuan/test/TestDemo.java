package com.gaoyuan.test;

import org.junit.Test;

import com.gaoyuan.utils.StringUtils;

public class TestDemo {
	//��ȡ���з����滻
	@Test
	public void testToHtml() {
		String html = StringUtils.toHtml("9��5��һ���磬�������������<\r>����9��࣬����������ó�߼������ǣͷ��ͨ������Ϣ��<\n\r>9��5�����磬�й��������ξ�ίԱ������Ժ����������ȫ�澭�öԻ��з�ǣͷ������ӦԼ������ó�״�������ϣ�󡢲�������ķŬ��ͨ����<\n>");
		System.out.println(html);
	}
	//�����ֻ����Ƿ���ȷ
	@Test
	public void testToPhone() {
		boolean phone = StringUtils.isPhone("18994562345");
		System.out.println(phone);
	}
	//���������Ƿ���ȷ
	@Test
	public void testToEmail() {
		boolean email = StringUtils.isEmail("895646@qq.com");
		System.out.println(email);
	}
}
