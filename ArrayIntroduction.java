import java.util.Arrays;

public class ArrayIntroduction {
    //declaration
    public static void main(String[] a){
        int[] arr1;
        int arr2[];

        //initialization
        arr1 = new int[3]; //[0,0,0]

        //direct initialization
        int[] arr3 = {10,20,20};

        //Accessing
        System.out.println(arr3[1]);

        //Traversing
        for (int  i=0; i<arr3.length;i++){
            System.out.println(arr3[i]);
            //arr3[3] - ArrayIndexOutOfBoundsException
        }

        System.out.println("It prints reference: "+arr3);
        System.out.println("It prints array: "+ Arrays.toString(arr3));

        Arrays.fill(arr1,9);
        System.out.println("It prints array: "+ Arrays.toString(arr1));
    }
}
