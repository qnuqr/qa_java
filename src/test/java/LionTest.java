import com.example.Lion;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LionTest {
    Lion lion;

    @Before
    public void setLion() throws Exception {
        lion = new Lion("Самец");
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец");
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void lionDoesHaveManeTest() throws Exception {
        Lion maleLion = new Lion("Самец");
        assertTrue(maleLion.doesHaveMane());

    }

    @Test
    public void lionDoesNotHaveManeTest() throws Exception {
        Lion femaleLion = new Lion("Самка");
        assertFalse(femaleLion.doesHaveMane());
    }

    @Test
    public void lionGetFoodTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
    }
}
