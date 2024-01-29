package collection9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2
{
    // Entry ->interface
    public static void main(String[] args)
    {
        HashMap hashMap=new HashMap<>();
        hashMap.put("Nellai Exp",1900);
        hashMap.put("Chennai Exp",2000);
        hashMap.put("Kumari Exp",2100);
        hashMap.put("Palkadu Exp",2100);
        // pair of object and keys
        System.out.println(hashMap );

        // let iterate by entry

        Set s=hashMap.entrySet();
        System.out.println(s);
        Iterator i=s.iterator();
        while(i.hasNext())
        {
           Object o= i.next();
           // chage into entry object to separete key and value to print
            Map.Entry e=(Map.Entry)o;
            Object time=e.getValue();
            Object expName=e.getKey();
            if(time.equals(2100))
            {
                System.out.println(expName +" -"+time);
                e.setValue(2130);
            }
        }

        System.out.println(hashMap );
    }
}
