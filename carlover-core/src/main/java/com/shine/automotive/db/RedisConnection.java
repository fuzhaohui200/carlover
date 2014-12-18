package com.shine.automotive.db;

import java.util.ArrayList;
import java.util.List;

import com.shine.automotive.utils.PropertiesParse;
import com.shine.automotive.utils.StringUtil;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.JedisShardInfo;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;


public class RedisConnection  {
	
	public final static String WRITE_REDIS = "w";
	public final static String READ_REDIS = "r";

	private static ShardedJedisPool masterShardedJedisPool = RedisConnection.initSharedJedisPool(WRITE_REDIS);
	private static ShardedJedisPool slaveShardedJedisPool = RedisConnection.initSharedJedisPool(READ_REDIS);
	private String writeOrRead;

	/**
	 * 读写分离
	 * 
	 * @param writeOrRead
	 *            write:w read:r
	 */
	public RedisConnection(String writeOrRead) {
		this.writeOrRead = writeOrRead;
	}

	public static ShardedJedisPool getMasterShardedJedisPool() {
		return masterShardedJedisPool;
	}

	public static ShardedJedisPool getSlaveShardedJedisPool() {
		return slaveShardedJedisPool;
	}

	public ShardedJedis openConnection()  {
		if (this.writeOrRead.equalsIgnoreCase(READ_REDIS)) {
			return RedisConnection.getSlaveShardedJedisPool().getResource();
		} else if (this.writeOrRead.equalsIgnoreCase(WRITE_REDIS)) {
			return RedisConnection.getMasterShardedJedisPool().getResource();
		}
		return null;
	}

	public void close(ShardedJedis o) {
		if (o == null) {
			return;
		}
		if (this.writeOrRead.equalsIgnoreCase(READ_REDIS)) {
			RedisConnection.getSlaveShardedJedisPool().returnResource(o);
		} else if (this.writeOrRead.equalsIgnoreCase(WRITE_REDIS)) {
			RedisConnection.getMasterShardedJedisPool().returnResource(o);
		}
	}

	private static ShardedJedisPool initSharedJedisPool(String masterOrSlave) {
		JedisPoolConfig config = getPoolConfig();

		List<JedisShardInfo> list = new ArrayList<JedisShardInfo>();

		String url = null;
		if (masterOrSlave.equalsIgnoreCase(READ_REDIS)) {
			url = PropertiesParse.getProperty("si.redis.slave");
		} else if (masterOrSlave.equalsIgnoreCase(WRITE_REDIS)) {
			url = PropertiesParse.getProperty("si.redis.master");
		}

		if (!StringUtil.isStringEmpty(url)) {
			String ipKey, portKey;
			String[] urls = url.split(",");
			for (String each : urls) {
				String[] hp = each.split(":");
				ipKey = hp[0];
				portKey = hp[1];
				list.add(new JedisShardInfo(ipKey, Integer.valueOf(portKey)));
			}
		}

		return list.isEmpty() ? null : new ShardedJedisPool(config, list);
	}

	private static JedisPoolConfig getPoolConfig() {
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxActive(Integer.valueOf(PropertiesParse.getProperty("si.redis.pool.maxActive", "1024")));
		config.setMaxIdle(Integer.valueOf(PropertiesParse.getProperty("si.redis.pool.maxIdle", "500")));
		config.setMinIdle(Integer.valueOf(PropertiesParse.getProperty("si.redis.pool.maxIdle", "100")));
		config.setMaxWait(Long.valueOf(PropertiesParse.getProperty("si.redis.pool.maxWait", "10000")));
		config.setTestOnBorrow(Boolean.valueOf(PropertiesParse.getProperty("si.redis.pool.testOnBorrow", "true")));
		config.setTestOnReturn(Boolean.valueOf(PropertiesParse.getProperty("si.redis.pool.testOnReturn", "true")));
		return config;
	}
}
