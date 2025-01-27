public class reverse {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int tarr[] = new int[arr.length];
        int  k = 2;
        for (int i=0; i<k; i++){
            tarr[i] = arr[arr.length-k+i];
        }
        int j=0;
        for (int i=k; i<arr.length; i++){
            tarr[i] = arr[j];
            j++;
        }
        for (int i=0; i<tarr.length; i++){
            System.out.println(tarr[i]);
        }
    }
}
