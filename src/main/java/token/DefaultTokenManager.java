package token;

import cache.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import utils.sha.SHA;

/**
 * the default implementation of TokenManager,using redis to save token
 */
@Component
public class DefaultTokenManager implements TokenManager {

    @Autowired
    private RedisCache redisCache;

    @Override
    public String createToken(String phoneNumber) {

        String token = SHA.getResult(phoneNumber); //simply use
        redisCache.putCacheWithExpireTime(token, phoneNumber, 60 * 20); //default token remained time is 20 minutes
        return token;
    }

    @Override
    public boolean checkToken(String token) {

        return !StringUtils.isEmpty(token) && redisCache.getCache(token,String.class)!=null;
    }
}
