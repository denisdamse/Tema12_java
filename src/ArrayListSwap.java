import java.util.ArrayList;

public class ArrayListSwap {
    public static ArrayList<String> swapFirstLast(ArrayList<String> stringList)
    {
        int listLength=stringList.size()-1;
        if(stringList.size()==0 || stringList.size()==1)
        {
            return stringList;
        }
        else
        {
            String value=stringList.get(0);
            stringList.set(0, stringList.get(listLength));
            stringList.set(listLength, value);
        }
        return stringList;
    }
}

