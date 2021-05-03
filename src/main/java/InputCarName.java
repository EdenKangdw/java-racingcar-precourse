import java.util.List;

public class InputCarName {
    boolean isValid = true;
    String [] names;

    public InputCarName(String names) {
        makeNameStringArray(names);
        this.names =  names.split(",");
    }

    public void makeNameStringArray(String nameString){
            String [] names = nameString.split(",");
            checkValidNames(names);
    }

    public void checkValidNames(String [] names){
        for(String name : names){
            this.isValid = checkLengthUnderStandard(5, name);
        }
    }

    public boolean checkLengthUnderStandard(int standard, String target){
        if(target.length() <= standard){
            return true;
        }
        throw new RuntimeException(String.format("자동차 이름은 %d자 이하의 문자열만 가능합니다", standard));
    }


}
