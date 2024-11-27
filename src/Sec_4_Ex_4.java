
/*
    Program to calculate the average of a set of numbers
*/
public class Sec_4_Ex_4 {
    public static int getAverage(int[] arr){
        int sum = 0;
        for (int num: arr){
            sum += num;
        }
        return sum / arr.length;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.println(getAverage(arr));
    }
}
