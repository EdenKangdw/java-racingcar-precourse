import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CarsTest {
    static Cars cars;
    
    @BeforeAll
    void 자동차_리스트_생성(){ 
        String [] carNames = {"람보르기니", "페라리", "포르쉐"};
        cars = new Cars(carNames);     
    }
    
    @Test
    void 자동차_리스트_생성_테스트() {
        String [] carNames = {"람보르기니", "페라리", "포르쉐"};
        Cars cars = new Cars(carNames);
        int i = 0;
        for(String name : carNames){
            Assertions.assertThat(name).isEqualTo(cars.carList.get(i).name);
            i++;
        }
    }

    @Test
    void 승자리스트_자동차_추가_테스트() {
        cars.carList.get(0).goCount = 3;
        cars.carList.get(1).goCount = 1;
        cars.carList.get(2).goCount = 4;

        cars.checkWinners(4);
        Assertions.assertThat(cars.winnerList.get(0).name).isEqualTo("포르쉐");

    }

    @Test
    void 승자_이름_출력_테스트() {
        cars.carList.get(0).goCount = 4;
        cars.carList.get(1).goCount = 1;
        cars.carList.get(2).goCount = 4;

        Assertions.assertThat(cars.getWinnerNames(4)).isEqualTo(" 람보르기니, 포르쉐");
    }
}
