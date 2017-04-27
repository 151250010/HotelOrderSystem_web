package cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import utils.ProtoStuffSeralizerUtil;

/**
 * redis cache
 */
@Component
public class RedisCache {

    public final static String CACHENAME = "cache"; //use CACHENAME as prefix of key every time adding a key
    public final static int CACHETIME = 60; //default cache time is 60 seconds

    @Autowired
    private RedisTemplate<String, String> redisTemplate; //the template of spring to operate redis

    /**
     * 添加缓存
     * @param key 键值
     * @param obj 对象
     * @param <T> 键值的泛型
     * @return
     */
    public <T> boolean putCache(String key, T obj) {

        final byte[] bKey = key.getBytes();
        final byte[] bValue = ProtoStuffSeralizerUtil.serialize(obj);
        return redisTemplate.execute((RedisCallback<Boolean>) redisConnection -> redisConnection.setNX(bKey, bValue));
    }

    /**
     * 按照需要的时间配置缓存
     * @param key
     * @param obj
     * @param expireTime
     * @param <T>
     */
    public <T> void putCacheWithExpireTime(String key, T obj, final long expireTime) {

        final byte[] bKey =key.getBytes();
        final byte[] bValue = ProtoStuffSeralizerUtil.serialize(obj);
        redisTemplate.execute((RedisCallback<Boolean>) redisConnection -> {
            redisConnection.setEx(bKey, expireTime, bValue);
            return true;
        });
    }

    /**
     * 获得缓存对象
     * @param key
     * @param targetClass
     * @param <T>
     * @return
     */
    public <T> T getCache(final String key, Class<T> targetClass) {

        byte[] result = redisTemplate.execute((RedisCallback<byte[]>) redisConnection -> redisConnection.get(key.getBytes()));

        if (result == null) {
            return null;
        }

        return ProtoStuffSeralizerUtil.deSerialize(result, targetClass);
    }

    /**
     * 精确删除key
     * @param key
     */
    public void deleteKey(String key) {
        redisTemplate.delete(key);
    }
}
