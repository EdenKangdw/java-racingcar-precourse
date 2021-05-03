import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void 자동차_이름_생성자_테스트() {
        Car car1 = new Car("sample1");
        Car car2 = new Car("sample2");
        Assertions.assertThat(car1.name).isEqualTo("sample1");
        Assertions.assertThat(car2.name).isEqualTo("sample2");
    }

}
