package copy_paste;

import java.util.*;

public class List_Set_Map {
    public static void collections(){

        ArrayList<Object> arr = new ArrayList<>();
        Object o1 = new Object();
        arr.add(o1);

        HashSet<Object> hs = new HashSet<>();
        Object o2 = new Object();
        hs.add(o2);

        TreeSet<Object> ts = new TreeSet<>();
        Object o3 = new Object();
        ts.add(o3);

        HashMap<Object, Object> hm = new HashMap<>();
        Object o4 = new Object();
        hm.put(o4, o4);

        TreeMap<Object, Object> tm = new TreeMap<>();
        Object o5 = new Object();
        tm.put(o5, o5);

        //iterating through loop
        for (Object o:arr){
            //same for HashSet and TreeSet
        }

        //iterating using Iterator
        Iterator<Object> ioarr = arr.iterator();
        //Iterator<Object> iohs = hs.iterator();
        //Iterator<Object> iots = ts.iterator();
        while (ioarr.hasNext()){
            System.out.println(ioarr.next());
        }

        //iterating classic for
        for (int i=0; i< arr.size();i++){
            System.out.println(arr.get(i));
        }

        //iterating through HashMap and TreeMap
        for (Object o:tm.keySet()){
            tm.get(o);
        }
        //or
        for (Map.Entry<Object, Object> o:tm.entrySet()){
            System.out.println(o.getKey());
            System.out.println(o.getValue());
        }

    }
}
