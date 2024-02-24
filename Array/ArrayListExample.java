import java.util.*;
import java.util.ArrayList;
public class ArrayListExample 
{   
    public static void main(String[] args) 
    {
        // Create an object of the ArrayList Class.
        ArrayList<Integer> list = new ArrayList<>();  
        /* add elements to the ArrayList using*/
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(2,13);
        list.add(14);
        list.add(14);
        list.add(16);
        System.out.println("ArrayList items: " + list);

        //Removing Even Numbers

        for(int i = list.size()-1 ; i>=0 ; i--)
        {
            if(list.get(i) % 2 == 0 )
                list.remove(i);
        }

        System.out.println("Arraylist after removing even: " + list);
    }
}
