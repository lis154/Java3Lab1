import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by il on 13.08.2018.
 */
public class Java3Lab1 {


    public Java3Lab1()
    {}

    public <T> T[] zamena(T mass[], int nom1, int nom2)
    {


        T zam = mass[nom1];
        mass[nom1] = mass[nom2];
        mass[nom2] = mass[nom1];
        return mass;
    }

    public <T> ArrayList<T> preob(T mass[])
    {
        ArrayList<T> array = new ArrayList<T>();
        for (int i = 0; i < mass.length; i++) {
          array.add(mass[i]);
        }
        return array;
    }



}
