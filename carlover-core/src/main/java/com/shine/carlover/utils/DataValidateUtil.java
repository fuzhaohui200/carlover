/**
 * 
 */
package com.shine.carlover.utils;

import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.regex.Pattern;

/**
 * @Comment 数据验证工具，用于验证字符串，集合是否为空
 * @author kucheng.liao@autonavi.com
 * @date Nov 14, 2013
 */
public final class DataValidateUtil {

	/**
	 * 字符传是否为空，为空返回true，否则返回false；
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if (null == str || "".equals(str.trim())) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * 对象是否为空，为空返回true，否则返回false；
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isEmpty(Object obj) {
		if (null == obj ) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}

	/**
	 * 判断集合为空
	 * 
	 * @param collection
	 * @return
	 */
	public static boolean isEmpty(Collection<?> collection) {
		if (null == collection || collection.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 判断集合不是空
	 * 
	 * @param collection
	 * @return
	 */
	public static boolean isNotEmpty(Collection<?> collection) {
		return !isEmpty(collection);
	}

	/**
	 * 检查字符串是否小于规定长度
	 * 
	 * @param str
	 * @param length
	 * @return
	 */
	public static boolean checkStringLength(String str, int length) {
		if (null != str) {
			try {
				if (str.getBytes("UTF-8").length > length) {
					return false;
				}
			} catch (UnsupportedEncodingException e) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 判断字符串是否包含中文,如果是，返回true,否则返回false
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isChinese(String str) {
		if (isNotEmpty(str)) {
			char[] chars = str.toCharArray();
			for (char ch : chars) {
				if (isChinese(ch)) {
					return true;
				}
			}

		}
		return false;

	}

	private static final boolean isChinese(char c) {
		Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
		if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
				|| ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
				|| ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
				|| ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
				|| ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
				|| ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
			return true;
		}
		return false;
	}
	
	/**
	 * 检查是否为合法的邮箱地址<br>
	 * 检查邮箱是否合法，如果合法，返回true,否则返回false<br>
	 * 
	 * @param email
	 * @return
	 */
	public static boolean checkEmail(String email) {
		String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		Pattern regex = Pattern.compile(check);
		if (regex.matcher(email).matches()) {
			return true;
		}
		return false;
	}

	/**
	 * 检查手机号码是否合法，如果合法，返回true,否者返回false<br>
	 * 
	 * @param phone
	 * @return
	 */
	public static boolean checkPhone(String phone) {
		String check = "^0?(13[0-9]|15[012356789]|18[0-9]|14[57])[0-9]{8}$";
		Pattern regex = Pattern.compile(check);
		if (regex.matcher(phone).matches()) {
			return true;
		}
		return false;
	}
	
	public static boolean checkIDCard(String idCard) {
		String check = "(^\\d{15}$)|(^\\d{17}([0-9]|X)$)";
		Pattern regex = Pattern.compile(check);
		if (regex.matcher(idCard).matches()) {
			return true;
		}
		return false;
	}
}
