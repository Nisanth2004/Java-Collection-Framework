import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
public class StringMapDemo
{
    // count of each character
    String string="ammaappa";
    HashMap<Character,Integer> charCountMap=new HashMap<Character, Integer>();
   char[] ch=string.toCharArray();
   for(char c:ch)
    {
        if(charCountMap.containsKey(c))
        {
            charCountMap.put(c,charCountMap.get(c)+1);
        }
        else
        {
            charCountMap.put(c,1);
        }
        System.out.println(charCountMap);
    }


}
