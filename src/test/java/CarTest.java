import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

public class CarTest {
    static Car car;

    @BeforeAll
    static void makeSampleCar(){
        car = new Car("sample");
    }

    @Test
    void 자동차_이름_생성자_테스트() {
        Car car1 = new Car("sample1");
        Car car2 = new Car("sample2");
        Assertions.assertThat(car1.name).isEqualTo("sample1");
        Assertions.assertThat(car2.name).isEqualTo("sample2");
    }

    @Test
    @DisplayName("자동차 랜덤 값 생성 테스트")
    void 자동차_랜덤_값_생성_1_9_사이_검증_테스트() {
        for (int i = 0; i < 20; i++) {
            car.getRandomValue();
            Assertions.assertThat(car.randomValue).isBetween(0,9);
        }
    }

    @Test
    void 자동차_전진_값_3_초과_검증_테스트(){
        car.randomValue = 4;
        car.checkCarGo();
        Assertions.assertThat(car.goCount).isEqualTo(1);

        car.randomValue = 2;
        car.checkCarGo();
        Assertions.assertThat(car.goCount).isEqualTo(1);
    }
}
