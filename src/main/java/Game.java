import java.util.Scanner;

public class Game {
    public InputNumber totalCount;
    public int currentCount = 0;

    public Game(InputNumber totalCount) {
        this.totalCount = totalCount;
    }

    public void play(Cars cars){
        System.out.println("==== 게임 실행 결과 ====");
        while(this.totalCount.number != this.currentCount){
            System.out.println("");
            System.out.println(String.format("%d 회차 시행!", this.currentCount + 1));
            cars.go();
            this.currentCount++;
        }
        end(cars);
    }

}
