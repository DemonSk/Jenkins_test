import static org.junit.Assert.*;

public class NumbersTest {

    @org.junit.Test
    public void sum() throws Exception {
        Numbers num = new Numbers();
        int act = num.sum(5);
        int exp = 4;
        assertEquals(exp, act);
    }
}