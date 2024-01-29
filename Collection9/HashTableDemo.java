package collection9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Properties;

public class HashTableDemo
{
    // TreeSet DS:Red Balck Tree same to TreeMap
    // sorting based on keys
    // No heterogenous objects are
    public static void main(String[] args) throws IOException {
        Hashtable hashtable=new Hashtable();
        hashtable.put(101,"abc");
        hashtable.put(102,"ds");
        System.out.println(hashtable);

        // HashTable ->child Class of hashTable

        Properties properties=new Properties();
        FileInputStream fileInputStream=new FileInputStream("/Users/sujiths/ nisanth/Nisan-Java new -workspace/collection9/menu.properties");
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("NellaiExpress"));

    }

}
