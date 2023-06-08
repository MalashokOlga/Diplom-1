import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import praktikum.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestBurgerGetPrice {
    Bun bun = new Bun("white bun", 200);
    Ingredient firstIngredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100);
    Ingredient secondIngredient = new Ingredient(IngredientType.FILLING, "sausage", 300);
    public static List<Ingredient> ingredients = new ArrayList<>();
    public float actualPrice;

    @Before
    public void countActualPrice() {
        actualPrice = bun.getPrice() * 2 + firstIngredient.getPrice() + secondIngredient.getPrice();
    }
    @Test
    public void testGetPrice() {
        ingredients.add(firstIngredient);
        ingredients.add(secondIngredient);
        Burger burger = new Burger();
        burger.bun = bun;
        burger.ingredients = ingredients;
        float expectedPrice = burger.getPrice();
        assertEquals(actualPrice, expectedPrice, 0);
    }
}
