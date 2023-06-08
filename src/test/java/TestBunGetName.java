import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestBunGetName {

    private final float price = 2.90F;


    @Parameterized.Parameter
    public String name;

    @Parameterized.Parameters(name = "{index}: имя")
    public static Object[] dataBunName() {
        return new Object[]{"белая", "черная", "цельнозерновая"};
    }
    @Test
    public void testBunName() {
        Bun bun = new Bun(name, price);
        String actualName = bun.getName();
        assertEquals(name, actualName);
    }
}
