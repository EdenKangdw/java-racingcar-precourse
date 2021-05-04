import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarsTest {
    @Test
    void 자동차_리스트_생성_테스트() {
        String [] carNames = {"람보르기니", "페라리", "포르쉐"};
        Cars cars = new Cars(carNames);
        int i = 0;:
        for(String name : carNames){
            Assertions.assertThat(name).isEqualTo(cars.carList.get(i).name);
            i++;
        }
    }
}
