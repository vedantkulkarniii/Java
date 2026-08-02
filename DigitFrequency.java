import java.util.Scanner;

public class DigitFrequency {

    static void frequency(long n){

        int[] count=new int[10];

        while(n>0){
            int digit=(int)(n%10);
            count[digit]++;
            n/=10;
        }

        for(int i=0;i<10;i++){
            if(count[i]!=0)
                System.out.println(i+" -> "+count[i]);
        }

    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        long n=sc.nextLong();

        frequency(n);

    }
}