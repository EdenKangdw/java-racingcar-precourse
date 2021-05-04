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





}
