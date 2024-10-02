import java.util.Scanner;

public class Str {

//    static int len(String s){
//        int c=0;
//
//        while(s.charAt(c)!='\0'){
//            c++;
//        }
//        return c;
//    }


    // making user defined funtions in java will not work since it dosent end with '\0'.


    public static void main(String[] args) {

        int c;
        String s;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String ");
        s = sc.nextLine();

        System.out.println("Enter your choice");
        System.out.println("1.len");
        System.out.println("2.rev");
        System.out.println("3.remove empty spaces");
        System.out.println("4.concat");
        System.out.println("5.cmp");
        System.out.println("6.toupper or lower");
        System.out.println("7.palandrome");

        c = sc.nextInt();

        switch (c) {
            case 1:
                System.out.println(s.length());

        }

    }
}