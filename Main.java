import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        output
        System.out.println("*\n**\n***\n****");

        /*
second part
        Variables
*/
        int a = 10;
        int b = 25;
        /*some functions of primitive var*/
        int sum =  a + b;
        /* System.out.println(sum); */
        int diff = b - a;
        /* System.out.println(diff); */
        int multiply = a * b;
        /* System.out.println(multiply); */
        float div = (b) / (a);
        System.out.println(div);



        /*Input fnx*/
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        //nextInt()
        System.out.println(name);


    }
}