import org.junit.Test;
import ru.netology.services.Otdyx1.services.calcVacService;

public class calcVacServiceTest {

    @Test
    public void shouldCalcTrue() {
        calcVacService service = new calcVacService();

        int expected = 0;
        int actual = service.calculate(1000, 2000);

        Assertions.assertEquals(expected, actual);

    }
}
