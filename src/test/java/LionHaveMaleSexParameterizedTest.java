import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionHaveMaleSexParameterizedTest {
    private final String sex;

    Feline feline;

    public LionHaveMaleSexParameterizedTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Collection<String> testData() {
        return Arrays.asList("Женский", "Мужской", "Неопределенный");
    }

    @Test
    public void testLionWithInvalidSex() {
        assertThrows(Exception.class, () -> new Lion(sex, feline));
    }
}
