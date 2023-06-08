import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestIngredientGetPrice {
    IngredientType type;
    private final String name = "дино";
    @Parameterized.Parameter
    public float price;

    @Parameterized.Parameters(name = "{index}: цена")
    public static Object[] dataIngredientPrice() {
        return new Object[]{170.50F, 300, 500};
    }
    @Test
    public void testIngredientPrice() {
        Ingredient ingredient = new Ingredient(type, name, price);
        float actualPrice = ingredient.getPrice();
        assertEquals(price, actualPrice, 0);
    }
}
