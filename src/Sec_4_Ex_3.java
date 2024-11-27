/*
    Program demonstrating array initialisation
*/
public class Sec_4_Ex_3 {
    public static void main(String[] args){
        int[] array = new int[6];

        array[0] = 23;
        array[1] = 6;
        array[2] = 47;
        array[3] = 35;
        array[4] = 2;
        array[5] = 14;

        for (int num: array){
            System.out.println(num);
        }
    }
}
