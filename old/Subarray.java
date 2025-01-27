// public class Subarray {
//     public static void main(String[] args) {
//         int[] arr = {1,2,3};
//         int count = 0;
//         int key= 4;
//         for(int i = 0; i<arr.length; i++){
//             // int start = i;
//             for(int j = i; j < arr.length; j++){
//                 // int end = j;
//                 int sum =0;
//                 for(int k = i; k<=j; k++){
//                     // System.out.print(arr[k]+", ");
//                     sum += arr[k]; 
//                 }
//                 if(sum<key){
//                     count++;
//                 }
//             }
//         }
//         System.out.println("the sum of sub arrays less than key value :- "+count);
//     }
// }





public class Subarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int count = 0;
        int key = 4;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0; 
            for (int j = i; j < arr.length; j++) {
                System.out.print(arr[j]+", ");
                sum += arr[j]; 
                if (sum < key) {
                    count++;
                } else {
                    break; 
                }
            }
            System.out.println();
        }

        System.out.println("The count of subarrays with sum less than the key value is: " + count);
    }
}
