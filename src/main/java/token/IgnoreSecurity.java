package token;

import java.lang.annotation.*;

/**
 * show to ignore security check
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreSecurity {
    //简单声明一下
}
