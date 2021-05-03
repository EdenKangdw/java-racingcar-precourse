import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class InputNumberTest {
    InputNumber number = new InputNumber("1");

    @Test
    void 인풋값_숫자형_여부_검증_테스트() {
        String input = "1";
        String wrongInput = "aa";
        Assertions.assertThat(number.checkInteger(input)).isEqualTo(1);
        Assertions.assertThat(number.checkInteger(wrongInput)).isNotEqualTo(1);
    }

    @Test
    void 인풋값_0_초과_테스트() {
        Assertions.assertThat(number.isOverZero(1)).isEqualTo(true);
        Assertions.assertThat(number.isOverZero(0)).isEqualTo(false);
    }

}
