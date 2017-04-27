package entity.client;

import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * 测试validator
 */
public class NormalClientTest {

    private static Validator validator;

    @BeforeClass
    public static void setValidator() {

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    @Test
    public void clientNameIsNull(){

        NormalClient normalClient = new NormalClient();
        normalClient.setPhoneNumber("123123");
        Set<ConstraintViolation<NormalClient>> constraintViolations = validator.validate(normalClient);
        System.out.println(constraintViolations.size());
        constraintViolations.forEach(a -> System.out.println(a.getMessage()));
    }

}