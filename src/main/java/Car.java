import java.util.Random;

public class Car {
    public String name;
    public int goCount;
    public int randomValue;

    public Car(String name) {
        this.name = name;
    }

    public void getRandomValue(){
        Random random = new Random();
        int randomValue = random.nextInt(10);
        this.randomValue = randomValue;
    }

    public void checkCarGo(){
        if(this.randomValue > 3){
            this.goCount++;
        }
    }



}
