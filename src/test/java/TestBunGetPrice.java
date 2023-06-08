import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestBunGetPrice {
    private final String name = "белая";

    @Parameterized.Parameter
    public float price;

    @Parameterized.Parameters(name = "{index}: цена")
    public static Object[] dataBunPrice() {
        return new Object[]{3.25F, - 5, 4};
    }
    @Test
    public void testBunPrice() {
        Bun bun = new Bun(name, price);
        float actualPrice = bun.getPrice();
        assertEquals(price, actualPrice, 0);
    }
}
