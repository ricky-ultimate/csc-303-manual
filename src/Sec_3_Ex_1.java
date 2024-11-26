import java.util.Scanner;

/* Java Program to perform arithmetic operation on two user-input integers*/
public class Sec_3_Ex_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("num1: ");
        int num1 = input.nextInt();

        System.out.print("num2: ");
        int num2 = input.nextInt();

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));
        System.out.println("num1++ = " + num1++);
        System.out.println("num2-- = " + num2--);

    }
}
