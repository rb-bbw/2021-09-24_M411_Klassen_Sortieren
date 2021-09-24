package ch.bbw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        task_1();
    }
    private static void task_1(){
        int[] data_int = {432, 2342, 1234, 234, 42, 432, 234};
        Arrays.sort(data_int);
        System.out.println(Arrays.toString(data_int));


        ArrayList<Integer> data_Integer = new ArrayList<>();
        data_Integer.add(432);
        data_Integer.add(2342);
        data_Integer.add(1234);
        data_Integer.add(234);
        data_Integer.add(42);
        data_Integer.add(432);
        data_Integer.add(234);
        Collections.sort(data_Integer, Collections.reverseOrder());
        System.out.println(data_Integer);
    }
}
