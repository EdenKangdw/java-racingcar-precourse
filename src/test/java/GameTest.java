import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    void 게임_생성시_총횟수_검증_테스트() {
        Game game = new Game(new InputNumber("44"));
        Assertions.assertThat(game.totalCount.number).isEqualTo(44);
    }
}
