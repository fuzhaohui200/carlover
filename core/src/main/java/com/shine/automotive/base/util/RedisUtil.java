package com.shine.automotive.base.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPipeline;
import redis.clients.jedis.Transaction;


public class RedisUtil {

	private static RedisConnection wconn = new RedisConnection(RedisConnection.WRITE_REDIS);
	private static RedisConnection rconn = new RedisConnection(RedisConnection.READ_REDIS);

	/**
	 * 哈希表添加数据
	 * 
	 * @param key
	 *            哈希表key
	 * @param field
	 *            字段
	 * @param value
	 *            值
	 * @return
	 * @throws java.sql.SQLException
	 * @throws ClassNotFoundException
	 * @author siquan.lv
	 * @date 2013-11-28
	 */
	public static Long hset(String key, String field, String value,int seconds)  {
		ShardedJedis jedis=null;
		try {
			jedis = wconn.openConnection();
			Long l = jedis.hset(key, field, value);
			jedis.expire(key, seconds);
			return l;
		} finally{
			if(jedis!=null){
				wconn.close(jedis);
			}
		}
	}

	/**
	 * 哈希表添加数据
	 *
	 * @param key
	 *            哈希表key
	 * @param field
	 *            字段
	 * @param value
	 *            值
	 * @return
	 * @throws java.sql.SQLException
	 * @throws ClassNotFoundException
	 * @author siquan.lv
	 * @date 2013-11-28
	 */
	public static Long hset(byte[] key, byte[] field, byte[] value,int seconds)  {
		ShardedJedis jedis = wconn.openConnection();
		Long l = jedis.hset(key, field, value);
		jedis.expire(key, seconds);
		wconn.close(jedis);
		return l;
	}



	/**
	 *
	 * @param key
	 *            哈希表key
	 * @param field
	 *            字段
	 * @param value
	 *            值
	 * @return
	 * @throws java.sql.SQLException
	 * @throws ClassNotFoundException
	 * @author siquan.lv
	 * @date 2013-11-28
	 */
	public static String hmset(byte[] key, Map<byte[], byte[]> map,int seconds)  {
		ShardedJedis jedis = wconn.openConnection();
		String l = jedis.hmset(key,map);
		jedis.expire(key, seconds);
		wconn.close(jedis);
		return l;
	}



	/**
	 * 哈希表获取数据
	 *
	 * @param key
	 *            哈希表key
	 * @param field
	 *            字段
	 * @return
	 * @throws java.sql.SQLException
	 * @throws ClassNotFoundException
	 * @author siquan.lv
	 * @date 2013-11-28
	 */
	public static String hget(String key, String field,int seconds)  {
		ShardedJedis jedis=null;
		try {
			jedis = rconn.openConnection();
			String s = jedis.hget(key, field);
			if(seconds>0){
				jedis.expire(key, seconds);
			}
			return s;
		} finally {
			// TODO: handle exception
			if(jedis!=null){
				rconn.close(jedis);
			}
		}
	}

	/**
	 * 哈希表获取数据
	 *
	 * @param key
	 *            哈希表key
	 * @param field
	 *            字段
	 * @return
	 * @throws java.sql.SQLException
	 * @throws ClassNotFoundException
	 * @author siquan.lv
	 * @date 2013-11-28
	 */
	public static byte[] hget(byte[] key, byte[] field,int seconds)  {
		ShardedJedis jedis = rconn.openConnection();
		byte[] s = jedis.hget(key, field);
		jedis.expire(key, seconds);
		rconn.close(jedis);
		return s;
	}



	/**
	 * 哈希表获取数据
	 *
	 * @param key
	 *            哈希表key
	 * @param field
	 *            字段
	 * @return
	 * @throws java.sql.SQLException
	 * @throws ClassNotFoundException
	 * @author siquan.lv
	 * @date 2013-11-28
	 */
	public static Map<byte[], byte[]> hgetAll(byte[] key,int seconds)  {
		ShardedJedis jedis = rconn.openConnection();
		Map<byte[], byte[]> s = jedis.hgetAll(key);
		jedis.expire(key, seconds);
		rconn.close(jedis);
		return s;
	}

	/**
	 * 哈希表获取数据
	 *
	 * @param key
	 *            哈希表key
	 * @param field
	 *            字段
	 * @return
	 * @throws java.sql.SQLException
	 * @throws ClassNotFoundException
	 * @author siquan.lv
	 * @date 2013-11-28
	 */
	public static boolean hdel(byte[] key, byte[] field,int seconds)  {
		ShardedJedis jedis = rconn.openConnection();
		jedis.hdel(key, field);
		jedis.expire(key, seconds);
		rconn.close(jedis);
		return true;
	}


	public static List<byte[]> hmget(byte[] key, byte[]... fields)  {
		ShardedJedis jedis = rconn.openConnection();
		List<byte[]> list = jedis.hmget(key, fields);
		rconn.close(jedis);
		return list;
	}

	public static List<String> hmget(String key, String... fields)  {
		ShardedJedis jedis = rconn.openConnection();
		List<String> list = jedis.hmget(key, fields);
		rconn.close(jedis);
		return list;
	}

	/**
	 * 序列化成字节数组
	 *
	 * @param o
	 * @return
	 * @throws java.io.IOException
	 * @author siquan.lv
	 * @date 2013-11-28
	 */
	public static byte[] seri2ByteArray(Object o) throws IOException {
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(bout);
		out.writeObject(o);
		out.flush();
		byte[] bytes = bout.toByteArray();
		bout.close();
		out.close();
		return bytes;
	}

	/**
	 * 删除数据
	 *
	 * @param key
	 *            哈希表key
	 * @param field
	 *            字段
	 * @return
	 * @throws java.sql.SQLException
	 * @throws ClassNotFoundException
	 * @author siquan.lv
	 * @date 2013-11-28
	 */
	public static long del(String key)  {
		ShardedJedis jedis=null;
		try {
			jedis = rconn.openConnection();
			long l=jedis.del(key);
			return l;
		} finally {
			// TODO: handle exception
			if(jedis!=null){
				rconn.close(jedis);
			}
		}
	}

	/**
	 * 反序列化
	 *
	 * @param bytes
	 * @return
	 * @throws java.io.IOException
	 * @throws ClassNotFoundException
	 * @author siquan.lv
	 * @date 2013-11-28
	 */
	public static Object deseri2Object(byte[] bytes) throws IOException, ClassNotFoundException {
		ByteArrayInputStream bi = new ByteArrayInputStream(bytes);
		ObjectInputStream oi = new ObjectInputStream(bi);
		Object obj = oi.readObject();
		bi.close();
		oi.close();
		return obj;
	}

	/**
	 * 获取管道
	 *
	 * @return
	 * @author siquan.lv
	 * @throws ClassNotFoundException
	 * @throws java.sql.SQLException
	 * @date 2013-11-28
	 */
	public static ShardedJedisPipeline getPipeLine() throws ClassNotFoundException {
		ShardedJedis jedis = wconn.openConnection();
		return jedis.pipelined();
	}


	/**
	 * 获取事务
	 *
	 * @return
	 * @author siquan.lv
	 * @throws ClassNotFoundException
	 * @throws java.sql.SQLException
	 * @date 2013-11-28
	 */
	public static ShardedJedis getShard()  {
		ShardedJedis shardedJedis = wconn.openConnection();
		return shardedJedis;
	}

	/**
	 * 释放事物
	 *
	 * @return
	 * @author siquan.lv
	 * @throws ClassNotFoundException
	 * @throws java.sql.SQLException
	 * @date 2013-11-28
	 */
	public static void closeConnection(ShardedJedis jedis)  {
		//jedis.disconnect();
		wconn.close(jedis);
	} 
	
	
}

