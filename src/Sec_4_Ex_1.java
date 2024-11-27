
/*
    Program to fetch prime numbers from a specified array set
*/
public class Sec_4_Ex_1 {
    public static boolean isPrime(int num){
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0 ) return false;
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,69,16,19,90};

        System.out.println("Prime numbers in the array: ");

        for (int num : arr){
            if (isPrime(num)) System.out.println(num);
        }
    }
}
