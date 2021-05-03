import java.util.Scanner;

public class RacingGame {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        // TODO : 1. make Cars with input CarNames
        System.out.println("경주할 자동차 이름을 입력해주세요(,로 구분됩니다)");
        Cars cars = new Cars(new InputCarName(scanner.next()).names);

        // TODO : 2. make Game with input totalCount
        System.out.println("시행할 게임 횟수를 입력해주세요");
        Game game = new Game(new InputNumber(scanner.next()));

        // TODO : 3. play game
        game.play(cars);
    }
}
