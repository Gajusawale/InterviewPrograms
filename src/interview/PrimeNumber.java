package interview;

public class PrimeNumber {



    public static void main(String[] args) {
        int num=12;

        System.out.println(isPrimeNum(num));
        ;
    }

    private static String isPrimeNum(int num) {

        boolean check=true;
        if(num==1)
        {
           return "number is not prime ";
        }
        for(int i=2;i<= Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return "number is not prime ";
            }

        }
            return "number is prime ";

    }

}
