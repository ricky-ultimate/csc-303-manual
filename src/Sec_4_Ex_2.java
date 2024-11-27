/*
    Program to calculate and display perfect numbers in an array set
*/
public class Sec_4_Ex_2 {
    public static boolean isPerfect(int num){
        if (num <= 1) return false;

        int sum = 0;

        for (int i = 1; i <= num /2; i++ ){
            if(num % i == 0) sum += i;
        }

        return sum == num;
    }

    public static void main(String[] args){
        int[] arr = {6,28,12,496,30,8128,10};

        System.out.println("Perfect numbers in the array: ");

        for (int num: arr){
            if (isPerfect(num)) System.out.println(num);
        }
    }
}
