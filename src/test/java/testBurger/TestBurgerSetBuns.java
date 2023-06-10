package testBurger;

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

public class TestBurgerSetBuns {
    Bun bun = new Bun("name", 100);
    Ingredient firstIngredient = Mockito.mock(Ingredient.class);
    Ingredient secondIngredient = Mockito.mock(Ingredient.class);
    public List<Ingredient> ingredients = new ArrayList<>();

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testSetBuns() {
        ingredients.add(firstIngredient);
        ingredients.add(secondIngredient);
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.ingredients = ingredients;
        assertEquals(bun, burger.bun);
    }
}
