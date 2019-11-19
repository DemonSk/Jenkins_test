import org.junit.Ignore;
import org.junit.Test;

import java.util.concurrent.TimeoutException;

import static org.junit.Assert.*;




public class JavaCalcTest {

    JavaCalc calc = new JavaCalc();

    @Test
    public void firstF() {
        System.out.println("firstF test");
        assertEquals(1,calc.firstF(2,2,3),0.0);
    }


    @Test(timeout=400)
    public void bigEvklid() {
        System.out.println("bigEvklid test");
        assertEquals(12, calc.BigEvklid(36,60)[0]);
    }

    @Test
    public void evklid() {
        System.out.println("evklid test");
        assertEquals(1, calc.Evklid(5,7));
    }

    @Test
    public void proverkanaprostotu() {
        System.out.println("proverkanaprostotu test");
        assertEquals(true, calc.proverkanaprostotu(13));
    }

    @Test
    public void hitriyeular() {
        System.out.println("hitriyeular test");
        assertEquals(8, calc.hitriyeular(15));
    }
}