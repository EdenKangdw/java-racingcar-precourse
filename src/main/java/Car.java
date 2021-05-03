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

    public void makeCarGo(){
        this.getRandomValue();
        this.checkCarGo();
        this.printResult();
    }


    public void printResult(){
        String resultSign = convertGoCountIntoSign();
        System.out.println(String.format("%s : %s", this.name, resultSign));
    }

    public String convertGoCountIntoSign(){
        String result = "";
        for (int i = 0; i < this.goCount; i++) {
            result = result + "ㅇ";
        }
        return result;
    }


}
