import java.util.Scanner;



// intializing and print the array elements 

// public class array{
//     public void printarray(int[] arr) {
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             System.out.println(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public void arraydemo(){
//         int[] myarray = new int[5];
//         myarray[0] = 10;
//         myarray[1] = 45;
//         myarray[2] = 34;
//         myarray[3] = 11;
//         myarray[4] = 55;
//         myarray[1] = 1; //update
//        //   myarray[5] = 22;//error out bound
//         printarray(myarray);
//         System.out.println("length of array = "+myarray.length);
//         System.out.println("last element in array "+ myarray[myarray.length-1]);

//         int[] arr = {23,4,2,56};
//         printarray(arr);
        
//     }

//     public static void main(String[] args) {
//         array array = new array();
//         array.arraydemo();
//     }
// }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// print odd numbers in the array


// public class array{
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7};
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             if (arr[i]%2!=0){
//                 System.out.println(arr[i] + " ");
//             }
//         }
//     }
// }




//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//reverse array 


// public class array{
//         public static void printarray(int[] arr) {
//             int n = arr.length;
//             for (int i = 0; i < n; i++) {
//                 System.out.println(arr[i] + " ");
//             }
//             System.out.println();
//         }


//         public static void reversearray(int[] arr) {
//             int start =0;
//             int end  = arr.length-1;

//             while (start<end){
//                 int temp = arr[start];
//                 arr[start] = arr[end];
//                 arr[end] = temp;
//                 start++;
//                 end--;
//             }
            
//         }
    
        
//         public static void main(String[] args) {
//             Scanner scanner = new Scanner(System.in);

//             int[] numbers = new int[5];
//             int length = numbers.length;
        
//             System.out.println("Enter the elements of the array:");
//             for (int i = 0; i < length; i++) {
//                 numbers[i] = scanner.nextInt();
//         }
//             System.out.println("the array elements are \n ");
//             printarray(numbers);

//             reversearray(numbers);

//             System.out.println("the reverse array elements are \n ");
//             printarray(numbers);
//             scanner.close();
//         }
//     }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// min value in array

// public class array{
       
//         public int findmin(int[] arr) {
            
//             int min = arr[0];
//             for(int i = 1; i < arr.length; i++){
//                 if(arr[i] < min){
//                     min = arr[i];
//                 }
//             }
//             return min;
//         }
                  
//         public static void main(String[] args) {
//             Scanner scanner = new Scanner(System.in);

//             int[] numbers = new int[5];
//             int length = numbers.length;
        
//             System.out.println("Enter the elements of the array:");
//             for (int i = 0; i < length; i++) {
//                 numbers[i] = scanner.nextInt();
//             }
//             array obj = new array();
//             System.out.println("the min. number in aray "+ obj.findmin(numbers));
        
//             scanner.close();
//         }
//     }



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// move all o,s to end

public class array{
        public static void printarray(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i] + " ");
            }
            System.out.println();
        }


        public static void movezeros(int[] arr) {
            int j =0;
            for(int i=0; i<arr.length; i++) {
                if(arr[i]!=0 && arr[j]==0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                if(arr[j]!=0){
                    j++;
                }
            }    
        }
    
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] numbers = new int[5];
            int length = numbers.length;
        
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < length; i++) {
                numbers[i] = scanner.nextInt();
        }
            System.out.println("the array elements are \n ");
            printarray(numbers);

            movezeros(numbers);

            System.out.println("the final array elements are \n ");
            printarray(numbers);
            scanner.close();
        }
    }