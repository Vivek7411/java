public class Set2 {

    static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fibo(n-1)+fibo(n-2);
    }




    public static void main(String[] args) {
        System.out.println("now lets do some fibo facto and recurtion");

        int a=10,f=0,s=1;


        // printing first five fibo

        System.out.print(f);
        System.out.print(s);

        for(int i=2;i<a;i++){
            int curr=f+s;
            System.out.print(curr+"\t");
            f=s;
            s=curr;
        }

        System.out.println(" \n");

        for(int i=0;i<a;i++){
            System.out.print(fibo(i)+"\t");
        }

        System.out.println("\n");

        System.out.println("and fibo num at "+a+"th possition is " +fibo(a-1));
    }
}
