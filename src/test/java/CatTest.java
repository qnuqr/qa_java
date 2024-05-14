import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    private List<String> expectedFood;
    @Mock
    Feline feline;
    Cat cat;

    @Before
    public void setCat() {
        cat = new Cat(feline);
        expectedFood = List.of("Животные", "Птицы", "Рыба");
    }

    @Test
    public void catGetFoodTest() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        List<String> food = cat.getFood();
        assertEquals(expectedFood, food);
        assertEquals(3, food.size());
    }

    @Test
    public void catGetSoundTest() {
        assertEquals("Мяу", cat.getSound());
    }

}
