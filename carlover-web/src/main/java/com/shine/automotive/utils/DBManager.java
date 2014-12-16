package com.shine.automotive.utils;

import com.mongodb.*;
import com.mongodb.MongoClientOptions.Builder;
import com.shine.automotive.constant.Constant;

import java.net.UnknownHostException;

public class DBManager {
	
	private static DBManager INSTANCE;
	
	public static DBManager getInstance() {
		if(INSTANCE == null) {
			synchronized (DBManager.class) {
				if(INSTANCE == null) {
					try {
						Builder builder = MongoClientOptions.builder();
						builder.socketKeepAlive(true);
						builder.writeConcern(WriteConcern.ERRORS_IGNORED);
						builder.connectionsPerHost(Integer.parseInt(Constant.MONGODB_POOL_SIZE));
						builder.threadsAllowedToBlockForConnectionMultiplier(5);
						builder.readPreference(ReadPreference.SECONDARY);
						mongo = new MongoClient(new ServerAddress(Constant.MONGODB_HOST, Integer.parseInt(Constant.MONGODB_PORT)), builder.build());
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (UnknownHostException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				INSTANCE = new DBManager();
			}
		}
		return INSTANCE;
	}

	/**
	 * Creates a new <code>DBManager</code> instance.
	 * 
	 */
	private DBManager() {

	}


	public DB getDB() {
		return mongo.getDB(Constant.MONGODB_DB_NAME);
	}

	private static MongoClient mongo;


}
