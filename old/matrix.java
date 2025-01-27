
import java.util.Scanner;

public class matrix{
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        Scanner sc = new Scanner(System.in);
        for(int i =0; i<3; i++){
            for(int j =0; j<3; j++ ){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i =0; i<matrix.length; i++){
            for(int j =i; j<matrix[i].length; j++ ){
                int temp = matrix[i][j];  
                matrix[i][j]=matrix[j][i];  
                matrix[j][i]=temp;  
            }
        }

        //clockwise 90deg
        // int n = matrix.length;
        // for(int i=0;i<n;i++){  
        //     int low = 0, high = n-1;  
        //     while(low < high)  
        //     {  
        //     int temp = matrix[i][low];  
        //     matrix[i][low] = matrix[i][high];  
        //     matrix[i][high] = temp;  
        //     low++;  
        //     high--;  
        //     }  
        // }  

        //anti clockwise deg
        int n = matrix.length;
        for(int i=0;i<n;i++){  
            int low = 0, high = n-1;  
            while(low < high)  
            {  
            int temp = matrix[low][i];  
            matrix[low][i] = matrix[high][i];  
            matrix[high][i] = temp;  
            low++;  
            high--;  
            }  
        }  
    


        for(int i =0; i<3; i++){
            for(int j =0; j<3; j++ ){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}