package collection9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo
{

    // HashMap is immutable ->to add stringbuffer objects in map we use Identity HashMap
    // StringBuffer an StringBuilder is mutable
    public static  void main(String[] args)
    {
        HashMap hashMap=new HashMap();
        hashMap.put("Idli",29);
        hashMap.put("Dosai",90);
        hashMap.put("poori",49);
        hashMap.put("Parota",60);
        // get the entryset
        Set s=hashMap.entrySet();
        System.out.println(s);

        System.out.println(hashMap);


        // get the values
        Collection c=hashMap.values();
        System.out.println(c);


        // get the key only
        Set s1=hashMap.keySet();
        System.out.println(s1);

        HashMap hashMap1=new HashMap();
        hashMap1.putAll(hashMap);
        System.out.println(hashMap1);

        System.out.println(hashMap.containsKey("Dosai"));
        System.out.println(hashMap.containsValue(78));


        System.out.println(hashMap1.get("Dosai")); // get the value and it will not remove the key
        System.out.println(hashMap1.remove("Dosai"));// print the removed value and it will remove

        System.out.println(hashMap1);

    }
}
