public class s {
    public static void main(String[] args){
        int arr[] = {1,2,66,2,40};
        int sec = 0;
        int max =0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
                sec = max;
                max = arr[i];
            }else if (arr[i]>sec && arr[i]!=max){
                sec = arr[i];
            }
        }
        System.out.println(sec);
    }
}