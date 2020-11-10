package stack_queue.bai_tap;

import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        String string = "vo duy      phuoc Vo     ";
        String[] array = string.split("\\s+");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String temp;
        int count;
        for (String element : array){
            temp = element.toLowerCase();
            if (treeMap.containsKey(temp)){
                count = treeMap.get(temp);
                treeMap.put(temp,count+1);
            }else treeMap.put(temp,1);
        }
        System.out.println(treeMap);
    }
}
