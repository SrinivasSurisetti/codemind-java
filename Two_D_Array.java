// import java.util.*;
// public class  Two_D_Array{
//     public static void main(String[] sri){
//         String[][] characters  = {{"harry","heroine","ron"},
//                                  { "Walter","jesse","saul"},
//                                  { "professor","berlin","tokyo"}  
//                                  };
//         for(String[] eachsesries: characters){
//             for(String eachcharacter: eachsesries ){
//                 System.out.print(eachcharacter + " ");
//             }
//         System.out.print("\n");
//         }
//     System.out.print(Arrays.deepToString(characters));
//     }
// }
// public class Two_D_Array{
//     public static void main(String[] sri){
        // int[] a,b,c; //all a,b,c are integer arrays 
        // int p[] ,q,r; // only p is intgr array and q,r are only integrs
        // //for checking prpose
        // a = new int[];
        // b = new int[];
        // c = new int[];
        // p = new int[];
        // q = new int[];
        
        // int[][] arr  = {{10,120},{12,34,4,5,65},{4,5,6,7,56}}
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
//         }
// }

import java.util.Arrays;

public class Two_D_Array{
    public static void main(String[] sr){
        int[][] arr = new int[4][]; //here there 3 inner arrays inmsode every inr array we declare no'of elements
        arr[1] =  new int[8];
        arr[2] = new int[5];
        arr[3] = new int[3];
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[i].length;j++){
        //         arr[i][j]=10;
        //     }
        // }
        System.out.println(Arrays.deepToString(arr));
    }
}