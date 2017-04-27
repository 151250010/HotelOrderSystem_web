package utils.sha;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 对密码进行加密
 */
public class SHA {

    private static final String KEY_SHA = "SHA";

    public static String getResult(String input) {

        BigInteger bigInteger = null;
        byte[] inputBytes = input.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(KEY_SHA);
            messageDigest.update(inputBytes);
            bigInteger = new BigInteger(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            return "";
        }

        return bigInteger.toString();
    }

}
