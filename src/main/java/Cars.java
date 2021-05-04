import java.util.ArrayList;
import java.util.List;

public class Cars {
    // 1급 컬렉션
    List<Car> carList = new ArrayList<>();
    List<Car> winnerList = new ArrayList<>();

    public Cars(String [] carNames) {
        for(String name : carNames){
            this.carList.add(new Car(name));
        }
    }


    public void checkWinners(int winnerCount){
        while (winnerCount > 0 && this.winnerList.size() == 0){
            searchWinner(winnerCount);
            winnerCount--;
        }
    }

    public void searchWinner(int winnerCount){
        for (Car car : this.carList){
            addWinner(car, winnerCount);
        }
    }

    public void addWinner(Car car, int winnerCount){
        if(car.goCount == winnerCount){
            this.winnerList.add(car);
        }
    }



}
