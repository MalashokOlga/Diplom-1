package testBurger;

import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestBurgerGetReceipt {
    Bun bun = new Bun("white bun", 200);
    Ingredient firstIngredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100);
    Ingredient secondIngredient = new Ingredient(IngredientType.FILLING, "sausage", 300);
    public static List<Ingredient> ingredients = new ArrayList<>();
    public String actualReceipt;

    @Before
    public void setActualReceipt() {
        actualReceipt = "(==== white bun ====)\n" +
                "= sauce hot sauce =\n" +
                "= filling sausage =\n" +
                "(==== white bun ====)\n" +
                "\n" +
                "Price: 800,000000\n";
        System.out.println(actualReceipt);
    }
    @Test
    public void testGetReceipt() {
        ingredients.add(firstIngredient);
        ingredients.add(secondIngredient);
        Burger burger = new Burger();
        burger.bun = bun;
        burger.ingredients = ingredients;
        String expectedReceipt = burger.getReceipt();
        System.out.println(expectedReceipt);
        assertEquals(actualReceipt, expectedReceipt);
    }
}
