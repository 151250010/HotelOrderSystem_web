package cache;

import entity.client.NormalClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by xihao on 17-4-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-redis.xml")
public class RedisCacheTest {

    @Autowired
    private RedisCache redisCache;

    @Test
    public void putCache() throws Exception {

        String key = "firstClient";
        NormalClient normalClient = new NormalClient();
        normalClient.setPhoneNumber("123");
        normalClient.setIsMan(false);
        normalClient.setIdentityId("13123123123");
        normalClient.setCreditPoint(123);
        normalClient.setClientName("Xihao");
        redisCache.putCache(key, normalClient);
    }

    @Test
    public void putCacheWithExpireTime() throws Exception {
    }

    @Test
    public void getCache() throws Exception {

        System.out.println(redisCache.getCache("firstClient",NormalClient.class));
    }

    @Test
    public void deleteKey() throws Exception {
        redisCache.deleteCache("firstClient");
    }

    @Test
    public void deleteWithPatternTest() {

        redisCache.deleteCacheWithPattern("*");
    }
}