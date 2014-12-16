package com.shine.automotive.constant;


import com.shine.automotive.utils.PropertiesParse;
import org.apache.log4j.Logger;

public final class Constant {

	private static Logger log= Logger.getLogger(Constant.class);
	public static final String REQUEST_PATH_REG = "(/login/)|(/images/)|(/user/)|(/sms/)";
	public static String MONGODB_DB_NAME = "";
	public static String MONGODB_HOST = "";
	public static String MONGODB_PORT = "";
	public static String MONGODB_POOL_SIZE = "";

	public static void loadConfig(){
		if(PropertiesParse.getProperty("MONGODB_DB_NAME")!=null){
			Constant.MONGODB_DB_NAME= PropertiesParse.getProperty("MONGODB_DB_NAME");
			log.info("*******Constant.MONGODB_DB_NAME:"+Constant.MONGODB_DB_NAME);
		}
		if(PropertiesParse.getProperty("MONGODB_HOST")!=null){
			Constant.MONGODB_HOST=PropertiesParse.getProperty("MONGODB_HOST");
			log.info("*******Constant.MONGODB_HOST:"+Constant.MONGODB_HOST);
		}
		if(PropertiesParse.getProperty("MONGODB_PORT")!=null){
			Constant.MONGODB_PORT =PropertiesParse.getProperty("MONGODB_PORT");
			log.info("*******Constant.MONGODB_PORT:"+Constant.MONGODB_PORT);
		}
		if(PropertiesParse.getProperty("MONGODB_POOL_SIZE")!=null){
			Constant.MONGODB_POOL_SIZE =PropertiesParse.getProperty("MONGODB_POOL_SIZE");
			log.info("*******Constant.MONGODB_POOL_SIZE:"+Constant.MONGODB_POOL_SIZE);
		}
		
	}
	
	
}

