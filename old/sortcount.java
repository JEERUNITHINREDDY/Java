public class sortcount {
   public static void main(String[] args) {
       int[] arr = {10, 4, 12 ,3, 1};
       int count =0;
       for(int i=0; i<arr.length-1; i++){
        for(int j=i+1; j<arr.length;j++){
            if(arr[j]<arr[i]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
        }
       }
        count++;

   }
   for(int i=0; i<arr.length; i++){
    System.out.print(arr[i]+" ");
   }
   System.out.println("count is ="+ count);

}
}
