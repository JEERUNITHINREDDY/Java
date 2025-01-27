public class zetus{
public static void del(int arr[], int n) {
    int temp[] = new int[arr.length-1];
    int j=0;
    for(int i =0; i<arr.length; i++){
        if(i==n){
            continue;
        }
        temp[j++]=arr[i];
    }
    for(int i=0; i<temp.length; i++){
        System.out.println(temp[i]);
    }
}

public static void reduced(int num, int den){
    int small = den;
    if(num<den){
        small = num;
    }

    int gcd =0;
    for(int i=1; i<=small; i++){
        if(num%i==0 && den%i==0){
            gcd =i;
        }
    }
    num = num/gcd;
    den= den/gcd;

    System.out.println(num + " " + den);
}

public static void duplicate(int arr[]){
    int cor = 0;
    for(int i=1;i<arr.length; i++){
        if(arr[cor] != arr[i] ){
            arr[cor+1] = arr[i];
            cor++;
        }
    }
    for(int i=0; i<=cor; i++){
        System.out.println(arr[i]);
    }
}

    public static void main(String[] args){
        int arr[] = {1,1,2,2,3,3,4,4,5,5};
        int n = 2;
        // del(arr, n);
        // reduced(15, 150);
        duplicate(arr);


    }
}
