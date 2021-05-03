import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class InputCarNameTest {
    String names = "오징어,자전거,비행기,오리배";
    String [] results = {"오징어", "자전거", "비행기", "오리배"};
    InputCarName carNames = new InputCarName(names);

    @Test
    void 자동차_이름_배열_생성_테스트() {
        int i = 0;
        for(String name : carNames.names){
            Assertions.assertThat(name).isEqualTo(results[i]);
            i++;
        }
    }

    @Test()
    void 자동차_이름_5자이하_검증_테스트() {
        String name = "일이삼사오육칠";

        Assertions.assertThatThrownBy(()
        -> { carNames.checkLengthUnderStandard(5, name); })
            .isInstanceOf(RuntimeException.class)
            .hasMessageContaining("5자 이하의 문자열만 가능합니다");
    }
}
