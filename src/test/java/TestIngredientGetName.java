import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestIngredientGetName {
    IngredientType type;
    private final float price = 100;
    @Parameterized.Parameter
    public String name;

    @Parameterized.Parameters(name = "{index}: имя")
    public static Object[] dataIngredientName() {
        return new Object[]{"дино", "сосиска", "котлета"};
    }
    @Test
    public void testIngredientName() {
        Ingredient ingredient = new Ingredient(type, name, price);
        String actualName = ingredient.getName();
        assertEquals(name, actualName);
    }
}
