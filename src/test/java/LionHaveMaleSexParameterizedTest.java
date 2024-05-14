import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LionHaveMaleSexParameterizedTest {
    private final String sex;

    public LionHaveMaleSexParameterizedTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Collection<String> testData() {
        return Arrays.asList("Женский", "Мужской", "Неопределенный");
    }

    @Test(expected = Exception.class)
    public void testLionWithInvalidSex() throws Exception {
        new Lion(sex);
    }
}
