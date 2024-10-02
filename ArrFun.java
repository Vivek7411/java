public class ArrFun {

    static void revArr(int arr[]) {
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }


    static void revArr2(int arr2[][]) {
        int cols = arr2[0].length;


        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < cols / 2; j++) {
                int temp = arr2[i][j];
                arr2[i][j] = arr2[arr2.length - 1 - i][cols - 1 - j];
                arr2[arr2.length - 1 - i][cols - 1 - j] = temp;
            }
        }
    }



    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int arr2[][] = {{1, 2}, {3, 4}, {5, 6}};
        int arr3[] = {1,2,3,2,1};


        revArr(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(arr2.length);

        revArr2(arr2);

        for (int i = 0; i < arr2.length; i++) {
            int cols = arr2[0].length;
            for (int j = 0; j < cols; j++) {
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.print("\n");
        }


        // checking pal

        for(int i=0;i< arr3.length;i++){
            if(arr3[i]!=arr3[arr3.length-1-i]){
                System.out.println("not");
            }
        }
        System.out.println("yes");// hoewever this will always be executed since i didint use funtion and return


    }
}
