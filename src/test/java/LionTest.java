import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


public class LionTest {

    @Mock
    private Feline feline;

    private Lion lion;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
        lion = new Lion("Самец", feline);
    }

    @Test
    public void testGetKittens() {
        when(feline.getKittens()).thenReturn(1);
        int expectedKittensCount = 1;
        assertEquals(expectedKittensCount, lion.getKittens());
    }

    @Test
    public void lionDoesHaveManeTest() throws Exception {
        Lion maleLion = new Lion("Самец", feline);
        assertTrue(maleLion.doesHaveMane());

    }

    @Test
    public void lionDoesNotHaveManeTest() throws Exception {
        Lion femaleLion = new Lion("Самка", feline);
        assertFalse(femaleLion.doesHaveMane());
    }

    @Test
    public void lionGetFoodTest() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
    }
}
