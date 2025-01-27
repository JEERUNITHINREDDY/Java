
import java.time.LocalDateTime;


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int result =0;
//         int[] a = new int[5];
//         for(int i =0; i<a.length; i++){
//             a[i] = sc.nextInt();
//         }
//         for(int i =0; i<a.length; i++){
//             if(a[i]%2 != 0){
//                 result += a[i];
//             }
//         }
//         System.out.println(result);

//     }
// }

// public class a{
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          int count =0;
//          int n = sc.nextInt();
//          int[] a = new int[n];

//          for(int i =0; i<a.length; i++){
//                         a[i] = sc.nextInt();
//             }

//         for(int i =0; i<a.length-1; i++){
//             for(int j = i+1; j<a.length; j++){
//                 if(a[i]>a[j]){
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);

//     }
// }

// public class a{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int count =0;
//         int supiar =Integer.MIN_VALUE;
//         int n = sc.nextInt();

//         int[] a = new int[n];

//         for(int i =0; i<a.length; i++){
//                  a[i] = sc.nextInt();
//             } 

//         for(int i = a.length-1; i >= 0; i--){
//             if(a[i]>supiar){
//                 supiar = a[i];
//                 System.out.print(supiar+ ", ");
//             }
//         }

//     }
// }

// public class c {

//     public static void factors(int n){
//         for(int i = 1; i<=n; i++){
//             if(n%i==0){
//                 System.out.print(i+",");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         factors(n);
//     }
// }

// public class c {

//     public static void factors(){
//         int k = 3;
//         int[] arr = {1,2,3,4,5,6,7};
//         int [] result = new int[arr.length];
//         for(int i = 0; i<k; i++){
//             result[i] = arr[arr.length-k+i];
//         }
//         int j=0;
//         for(int i = k; i<arr.length; i++){
//             result[i] = arr[j];
//             j++;
//         }
//         for(int i =0; i<result.length; i++){
//             System.out.print(result[i]+ ",");
//         }
//     }

//     public static void main(String[] args) {
//         factors();
//     }
// }

public class c {


    public static void main(String[] args) {
        LocalDateTime t =  LocalDateTime.now();
        System.out.println(t);
    }
}