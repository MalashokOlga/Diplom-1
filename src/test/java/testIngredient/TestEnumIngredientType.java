package testIngredient;

import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class TestEnumIngredientType {
    @Test
    public void testIngredientType() {
        String sauce = String.valueOf(IngredientType.SAUCE);
        String filling = String.valueOf(IngredientType.FILLING);
        assertEquals(sauce, "SAUCE");
        assertEquals(filling, "FILLING");
    }
}
