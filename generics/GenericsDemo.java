import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class GenericsDemo
{
    public static void main(String[] args)
    {
        int[] array=new int[4];
        array[0]=1;
        array[1]=90;
        // There is no type saftey in collection
        TreeSet<Integer> treeSet=new TreeSet<Integer>();
        // ascending order
        treeSet.add(10);
        treeSet.add(56);
        treeSet.add(9);

        System.out.println(treeSet);
        System.out.println("-----------------------------");

        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("Nisanth");
        System.out.println(arrayList);
        System.out.println("-----------------------------");
        GenericsDemo genericsDemo=new GenericsDemo();
        genericsDemo.add(arrayList);

    }

    private void add(ArrayList<String> arrayList)
    {
        arrayList.add("Jothi");
        System.out.println(arrayList);
    }
}