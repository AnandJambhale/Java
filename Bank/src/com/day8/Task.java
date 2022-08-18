package com.day8;


import java.sql.Array;
import java.util.*;


class day8{
    //Problem 1
    ArrayList<Integer> updateAList(ArrayList<Integer> array, int index, int element){
        array.add(index, element);
        return array;
    }
//Problem 2
    LinkedList<Integer> insert(LinkedList<Integer> list, int a, int z){
        list.add(0,a);
        list.add(z);
        return list;
    }
//problem 3
    List convertToArray(HashSet<Integer> set) {
        Object[]array=set.toArray();
        return Arrays.asList(array);
    }

//Problem 4
    TreeSet<Integer> Clone(TreeSet<Integer> set){
        TreeSet<Integer> set2=(TreeSet) set.clone();
        return set2;
    }

//Problem 5
    int compare(PriorityQueue<Integer> pQue1, PriorityQueue<Integer> pQue2){
        return pQue1.peek().compareTo(pQue2.peek());
    }

//Problem 6
    boolean hasKey(HashMap map, int value){
        return map.containsKey(value);
    }

//Problem 7
    Collection keyString(TreeMap map){
        return map.keySet();
    }
}

//Problem 7
class CompareTree implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Integer s1=(Integer) o1;
        Integer s2=(Integer) o2;
        return -s1.compareTo(s2);
    }
}
public class Task {
    public static void main(String[] args) {
        day8 hj=new day8();

        //Problem 1
        ArrayList aList=new ArrayList<>(List.of(45,85,96,2,1,45,36,25));
        hj.updateAList(aList,4,58);
        System.out.println("(Problem 1) "+aList);

        //Problem 2
        LinkedList<Integer>list=new LinkedList<>(List.of(14,85,2,4,75,85,36));
        hj.insert(list, 4,25);
        System.out.println("(Problem 2) "+list);

        //Problem 3
        HashSet Set=new HashSet<>(List.of(45,85,25,65,24));
        System.out.println("(Problem 3) "+hj.convertToArray(Set));

        //Problem 4
        TreeSet<Integer>set=new TreeSet<>(List.of(41,52,85,632,25,45));
        System.out.println("(Problem 4) "+hj.Clone(set));

        //problem 5
        PriorityQueue<Integer>pQ1=new PriorityQueue<Integer>(List.of(12,45,78,15,75));
        PriorityQueue<Integer>pQ2=new PriorityQueue<Integer>(List.of(45,85,25,36,45));
        System.out.println("(Problem 5) "+hj.compare(pQ1,pQ2));

        //Problem 6
        HashMap<Integer, String> map=new HashMap<>();
        map.put(21,"Anand");
        map.put(39,"Mamta");
        map.put(67,"Vilas");
        map.put(15,"Hansuja");
        System.out.println("(Problem 6) "+hj.hasKey(map,21));
        System.out.println("(Problem 6) "+hj.hasKey(map,50));

        //Problem 7
        TreeMap<Integer,String> map1=new TreeMap<>(new CompareTree());
        map1.put(21,"Anand");
        map1.put(39,"Mamta");
        map1.put(67,"Vilas");
        map1.put(15,"Hansuja");
        System.out.println(map1);
        System.out.println("(Problem 7) "+hj.keyString(map1));

//        for (int i=0;i<map1.size();i++) {
//            for(int j=0;j<map1.size();j++){
//                if (map1.get())
//            }
//        }

        ArrayList<Integer>array=new ArrayList<>(List.of(12,45,1,23,85,75));
        ArrayList<Integer>array1=new ArrayList<>();
        for (int i=0;i<array.size();i++){
            if(i+1<array.size()) {
                for (int j = i + 1; j < array.size(); j++) {
                    if (array.get(i) < array.get(j)) {
                        if (i==array.size()-1){
                            array.add(i, array.get(j));
                        }
                        else {
                            int tempi = array.get(i);
                            array.remove(i);
                            array.add(i, array.get(j));
                            array.remove(j);
                            array.add(j, tempi);
                        }
                    }
                }
            }
        }
        System.out.println(array);
        System.out.println(array.get(5));

    }
}
