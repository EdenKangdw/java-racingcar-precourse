public class InputNumber {
    public int number;

    public InputNumber(String input) {
        if(validCheck(input)){
            this.number = Integer.parseInt(input);
        };
    }

    public boolean validCheck(String input){
        if(!isOverZero(checkInteger(input))){
            return false;
        }
        if(!isUnderTen(checkInteger(input))){
            return false;
        }
        return true;
    }

    public int checkInteger(String input){
        try {
            int number = Integer.parseInt(input);
            return number;
        } catch (NumberFormatException e){
            System.out.println("입력값은 숫자 형태가 되어야 합니다");
        }
        return 0;
    }

    public boolean isOverZero(int number) {
        if (number > 0) {
            return true;
        }
        return false;
    }

    public boolean isUnderTen(int number){
        if(number < 10){
            return true;
        }
        return false;
    }



}
