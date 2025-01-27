public class bubblesort {
    public static void bs() {
        int arr[] = {32,12,56,33,90};
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j =0; j<n-i-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ ", ");
        }
    }

    //selection sort
    public static void ss() {
        int arr[] = {32,12,56,33,90};
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j =i+1; j<n; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ ", ");
        }
    }

    public static void main(String[] args) {
        // bs();
        ss();
    }
}