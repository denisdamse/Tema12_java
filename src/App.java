import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<String>();
        stringArray.add("Denis");
        stringArray.add("Andrei");
        stringArray.add("Damse");
        System.out.println(stringArray);
        ArrayListSwap.swapFirstLast(stringArray);
        System.out.println(stringArray);
    }
}

