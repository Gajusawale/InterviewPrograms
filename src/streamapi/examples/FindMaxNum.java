package streamapi.examples;

import java.util.Arrays;

public class FindMaxNum {

    public static void main(String[] args) {
        int[] nums={1,3,5,3,6,454,77,5};

        int num=Arrays.stream(nums).max().getAsInt();

        System.out.println("max number is "+ num);
    }
    
}
