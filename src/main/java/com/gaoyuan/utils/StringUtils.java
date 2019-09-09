package com.gaoyuan.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
	//����Html��<p>��ǩ�������ı��Ļ���,��ɻ��з����滻
	public static String toHtml(String text) {
		
		StringBuffer buffer = new StringBuffer();
		String[] split = text.split("\r\n");
		for (String string : split) {
			buffer.append("<p>");
			String replaceAll = string.replaceAll("\n\r", "\n");
			String replaceAll2 = string.replaceAll("\r", "<br/>");
			buffer.append(replaceAll);
			buffer.append(replaceAll2);
			buffer.append("</p>");
		}
		
		return buffer.toString();
		
	}
	//�ֻ����Ƿ���ȷ�Ĺ��߷���
	public static boolean isPhone(String str) {
		Pattern pattern = Pattern.compile("^1[3|4|5|7|8|9][0-9]\\d{8}$");
		Matcher matcher = pattern.matcher(str);
		if(matcher.matches()) {
			return true;
		}
		return false;
	}
	
	//�����Ƿ���ȷ
	public static boolean isEmail(String str) {
		Pattern pattern = Pattern.compile("^[a-z0-9A-Z]{5,}@qq\\.com$");
		Matcher matcher = pattern.matcher(str);
		if(matcher.matches()) {
			return true;
		}
		return false;
	}
}
