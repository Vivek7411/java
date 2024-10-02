import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {

        int a;
        String s;

        System.out.println("hello");

        Scanner sc = new Scanner(System.in);


        System.out.println("try to enter a number : ");
        a = sc.nextInt();
        System.out.println("you entered " + a);


        System.out.println("try to enter a name : ");
//        s = sc.next();
        sc.nextLine();// to avoid buffer issue
        s = sc.nextLine();
        System.out.println("you entered " + s);


    }
}
