import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestBurgerAddIngredient {
    Bun bun = Mockito.mock(Bun.class);
    Ingredient firstIngredient = Mockito.mock(Ingredient.class);
    Ingredient secondIngredient = Mockito.mock(Ingredient.class);
    Ingredient ingredient = Mockito.mock(Ingredient.class);

    public static List<Ingredient> ingredients = new ArrayList<>();

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddIngredient() {
        ingredients.add(firstIngredient);
        ingredients.add(secondIngredient);
        Burger burger = new Burger();
        burger.bun = bun;
        burger.ingredients = ingredients;
        burger.addIngredient(ingredient);
        List<Ingredient> expectedIngredients = ingredients;
        expectedIngredients.add(ingredient);
        List<Ingredient> actualIngredients = burger.ingredients;
        assertEquals(actualIngredients, expectedIngredients);
    }
}
