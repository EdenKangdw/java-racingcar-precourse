import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputCarNameTest {

    @Test
    void 자동차_이름_배열_생성_테스트() {
        String names = "오징어,자전거,비행기,오리배";
        String [] results = {"오징어", "자전거", "비행기", "오리배"};
        InputCarName carNames = new InputCarName(names);

        int i = 0;
        for(String name : carNames.names){
            Assertions.assertThat(name).isEqualTo(results[i]);
            i++;
        }

    }
}
