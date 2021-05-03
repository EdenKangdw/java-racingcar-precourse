import java.util.List;

public class InputCarName {
    String [] names;

    public InputCarName(String names) {
        makeNameStringArray(names);
    }

    public void makeNameStringArray(String names){
        this.names = names.split(",");
    }

}
