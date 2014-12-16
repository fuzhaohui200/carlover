/**
 * Copyright (c) 2013-2015 Autonavi.com. All rights reserved.  
 * newland-core - 2014-7-9
 * 
 * 相关描述： 
 * 
 */
package com.shine.automotive.base.controller;

import java.util.Date;

import com.shine.automotive.utils.JsonDateValueProcessor;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;


/**
 * <pre>
 * 相关描述：
 * 
 * 文件名：BaseController.java
 * 作者： AutoNavi 
 * 完成时间：2014-7-9 下午2:15:27 
 * 当前版本： v1.0
 * </pre>
 */
public abstract class BaseController {
	
	protected final static int PARAM_ISNULL = 1001;
	protected final static int PARAM_ISNOTEXIST = 1002;
	protected final static int PARAM_ISEXIST = 1003;
	protected final static int PARAM_TYPE_ERROR = 1004;

	public JSONObject writeResult(int code, String msg, Object data) {
		JsonConfig jsonConfig = new JsonConfig();  
		jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());
		JSONObject resultJson = new JSONObject();
		JSONObject statusJson = new JSONObject();
		statusJson.accumulate("code", code);
		statusJson.accumulate("msg", msg);
		resultJson.accumulate("status", statusJson);
		if(data == null) {
			data = new JSONObject();
		}
		resultJson.accumulate("data", data, jsonConfig);
		return resultJson;
	}

	public JSONObject writePageResult(int code, String msg, int pno, int psize, long total, int totalPage, Object data) {
		JsonConfig jsonConfig = new JsonConfig();  
		jsonConfig.registerJsonValueProcessor(Date.class, new JsonDateValueProcessor());  
		JSONObject resultJson = new JSONObject();
		JSONObject statusJson = new JSONObject();
		statusJson.accumulate("code", code);
		statusJson.accumulate("msg", msg);
		resultJson.accumulate("status", statusJson);
		if(data == null) {
			data = new JSONArray();
		}
		resultJson.accumulate("data", data, jsonConfig);
		JSONObject pageJson = new JSONObject();
		pageJson.accumulate("pno", pno);
		pageJson.accumulate("psize", psize);
		pageJson.accumulate("total", total);
		pageJson.accumulate("totalPage", totalPage);
		resultJson.accumulate("page", pageJson);
		return resultJson;
	}
	
	public JSONObject writeResult(Object data) {
		return writeResult(0, "success", data);
	}
	
	public JSONObject writePageResult(int pno, int psize, long total, int totalPage, Object data) {
		return writePageResult(0, "success", pno, psize, total, totalPage, data);
	}

}
