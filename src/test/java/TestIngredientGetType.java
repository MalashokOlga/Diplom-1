import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class TestIngredientGetType {
    private final float price = 100;
    private final String name = "дино";
    IngredientType type;

    @Test
    public void testIngredientPrice() {
        Ingredient ingredient = new Ingredient(type, name, price);
        IngredientType actualType = ingredient.getType();
        assertEquals(type, actualType);
    }
}
