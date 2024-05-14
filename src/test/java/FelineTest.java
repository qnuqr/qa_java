import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {
    private List<String> predatorExpectedFood;
    private List<String> herbivorousExpectedFood;

    Feline feline;
    @Before
    public void setupFeline() {
        feline = new Feline();
        predatorExpectedFood = List.of("Животные", "Птицы", "Рыба");
        herbivorousExpectedFood = List.of("Трава", "Различные растения");
    }

    @Test
    public void felineGetFamilyTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void felineEatMeatTest() throws Exception {
        List<String> food = feline.eatMeat();
        assertNotNull(food);
        assertFalse(food.isEmpty());
    }

    @Test
    public void felinePredatorGetFoodTest() throws Exception {
        List<String> food = feline.getFood("Хищник");
        assertEquals(predatorExpectedFood, food);
    }

    @Test
    public void felineHerbivorousGetFoodTest() throws Exception {
        List<String> food = feline.getFood("Травоядное");
        assertEquals(herbivorousExpectedFood, food);
    }

}
