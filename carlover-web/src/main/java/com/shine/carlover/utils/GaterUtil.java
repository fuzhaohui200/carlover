/*
package com.shine.carlover.web.utils;

import com.mapabc.newland.exception.PushMessageException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GaterUtil {

	private static Log log=LogFactory.getLog(GaterUtil.class);


	public static void  send(String userId,String content) throws PushMessageException {
		HttpClient httpclient = HttpUtil.getHttpClient();
		HttpPost httpost =null;
		try {
			String gaterUrl = constructGaterUrl("createTask","convey");
			String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?><request><objectId>%s</objectId><spaceId>%s</spaceId><type>1</type><data>%s</data></request>";
			String contentXml = String.format(xml, userId,Constant.GATER_SPACEID, content);
			httpost= new HttpPost(gaterUrl);
			HttpEntity entity = new ByteArrayEntity(contentXml.getBytes());
			httpost.setEntity(entity);
			HttpResponse response=httpclient.execute(httpost);
			HttpEntity respEntity = response.getEntity();
			String charset = EntityUtils.getContentCharSet(respEntity);

	        try {
	        	String body = EntityUtils.toString(respEntity);
	        	if(log.isDebugEnabled()){
		        	log.debug("response status: " + response.getStatusLine());
		        	log.debug(charset);
		        	log.debug(body);
		        }

	        } catch (ParseException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}  catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new PushMessageException(e.getMessage());
		}finally{
			if(httpost!=null){
				httpost.abort();
			}
			//httpclient.getConnectionManager().shutdown();
		}
	}

	public static void  register(String userId) throws PushMessageException {
		HttpClient httpclient = HttpUtil.getHttpClient();
		HttpPost httpost =null;
		try {
			String gaterUrl = constructGaterUrl("monitorObjectService","addMonitorObject");
			String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?><request type=\"1\"><monitorObject><objectId>%s</objectId><spaceId>%s</spaceId><locateType>1</locateType><objectName>%s</objectName><usageFlag>1</usageFlag><typeCode>DEFAULT_PROTOCOL</typeCode><validTime></validTime></monitorObject></request>";
			String contentXml = String.format(xml, userId,Constant.GATER_SPACEID,userId);
			httpost= new HttpPost(gaterUrl);
			HttpEntity entity = new ByteArrayEntity(contentXml.getBytes());
			httpost.setEntity(entity);
			HttpResponse response=httpclient.execute(httpost);
			HttpEntity respEntity = response.getEntity();

	        log.info("response status: " + response.getStatusLine());
	        String charset = EntityUtils.getContentCharSet(respEntity);
	        log.info(charset);

	        try {
	        	String body = EntityUtils.toString(respEntity,"utf-8");
	            log.info(body);
	        } catch (ParseException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}  catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new PushMessageException(e.getMessage());
		}finally{
			if(httpost!=null){
				httpost.abort();
			}
			//httpclient.getConnectionManager().shutdown();
		}
	}

	private static String constructGaterUrl(String serviceKey,String method) throws UnsupportedEncodingException{
		String gaterUrl = Constant.GATER_MESSAGE_PULL;
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return gaterUrl+"?serviceKey="+serviceKey+"&method="+method+"&timestamp="+URLEncoder.encode(df.format(new Date()), "utf-8");
	}



	public static void main(String[] args) {
		try {
			GaterUtil.register("b5531bcde57721fc82cd024716708845d521c4cbb2273997617b2a7df6816e4f");
		} catch (PushMessageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
*/
