package token;

/**
 * the interface to deal with token
 */
public interface TokenManager {

    String createToken(String userName);

    boolean checkToken(String token);
}
