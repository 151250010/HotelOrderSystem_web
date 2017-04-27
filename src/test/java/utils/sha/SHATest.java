package utils.sha;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by xihao on 17-4-24.
 */
public class SHATest {

    @Test
    public void testGetResult(){

        String input = "963852741zx";
//        System.out.println(SHA.getResult(input));
        assertEquals("675351258747835884319507665044530675710653766598", SHA.getResult(input));
    }

}