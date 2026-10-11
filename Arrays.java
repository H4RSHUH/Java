public class Arrays {
    public static void main(String a[]){
        int arr1[] = {1,2, 3, 4 , 5};
        int arr2[] = new int[5];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        System.out.println("elements of arr1");
        for(int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
        System.out.println("elements of arr2");
        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }


        // jagged array : array with different number of columns in each row
        int arr3[][] = new int[3][];
        arr3[0] = new int[2];
        arr3[1] = new int[3];
        arr3[2] = new int[4];
        System.out.println("elements of arr3");

        for(int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3[i].length; j++){
                arr3[i][j] = (int)(Math.random() * 100);
            }
        }
        for(int i[] : arr3){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
