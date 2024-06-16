package interview;

public class FibonacciSeries {

    public static void main(String[] args) {

        int num=8;
        int a=0;
        int b=1;


        System.out.println(a);
        System.out.println(b);


        while(num-2>0)
        {
            int temp=a+b;
            a=b;
            b=temp;
            System.out.println(temp);
            num--;
        }


    }
}
