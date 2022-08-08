package ua.levelup;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClass {

    @Test
    public void test(){
        MainClass mc = new MainClass();
        assertEquals("qwerty", mc.rev("ytrewq", true));
        assertEquals("qwarty", mc.repl("qwerty", 'e', 'a'));
    }

}
