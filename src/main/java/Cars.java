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

    public void go(){
        for(Car car : this.carList){
            car.makeCarGo();
        }
    }

    public String getWinnerNames(int totalCount){
        StringBuilder winnerNames = new StringBuilder();
        this.checkWinners(totalCount);
        for (Car car : this.winnerList) {
            winnerNames.append(" " + car.name + ",");
        }
        if(winnerNames.toString().length() == 0){
            return "Nobody";
        }
        winnerNames.setLength(winnerNames.length() - 1);

        return winnerNames.toString();
    }

    public void checkWinners(int winnerCount){
        while (winnerCount > 0 && this.winnerList.size() == 0){
            addWinner(winnerCount);
            winnerCount--;
        }
    }

    public void addWinner(int winnerCount){
        for (Car car : this.carList){
            checkGoCount(car, winnerCount);
        }
    }

    public void checkGoCount(Car car, int winnerCount){
        if(car.goCount == winnerCount){
            this.winnerList.add(car);
        }
    }



}
