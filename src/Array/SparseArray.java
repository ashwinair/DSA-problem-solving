package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.hackerrank.com/challenges/sparse-arrays/problem?isFullScreen=false
public class SparseArray {

    public static void main(String[] args) {
//        matchingStrings();
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

        Map<String, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>(queries.size());

        for (String inputString : strings) {
            if (map.containsKey(inputString)) {
                map.put(inputString, map.get(inputString) + 1);
            } else {
                map.put(inputString, 1);
            }
        }

        for (String queriesString : queries) {
            result.add(map.getOrDefault(queriesString, 0));
//            if(map.containsKey(queriesString)){
//                result.add(map.get(queriesString));
//            }
//            else{
//                result.add(0);
//            }
        }
        return result;
    }
}
