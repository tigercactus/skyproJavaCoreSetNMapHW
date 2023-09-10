import java.util.*;

public class Main {
    public static void main(String[] args) {
        //задание 1
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 9, 4, 4, 5, 5, 6, 7, 3));
        List<Integer> numscopy = new ArrayList<>();
        for (int temporal : nums) {
            if (temporal % 2 != 0) {
                numscopy.add(temporal);
            }
        }
        System.out.println(numscopy);
        //задание 2

        Set<Integer> oneCopy = new HashSet<>(numscopy);
        List<Integer> oneCopied = new ArrayList<>(oneCopy);
        Collections.sort(oneCopied);
        System.out.println(oneCopied);
        //задание 3

        List<String> strings = Arrays.asList("морковка", "тыковка", "бабочка", "тыковка","яблочко","яблочко");
        Set<String> stringsSet = new HashSet<>(strings);
        System.out.println(stringsSet);
        //задание 4
        ArrayList<String> copy = new ArrayList<>(strings);

        System.out.println(copy);
        for (int i = 0; i < copy.size(); i++) {
            String temporal = copy.get(i);
            int frequency = Collections.frequency(copy,temporal);
            if(frequency>1){
                System.out.println(frequency+" "+ temporal);
                copy.remove(i);
            }
        }


        }


    }
