import java.util.*;

public class accPrac {
    public static void missing() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        int[] newarr = new int[n + 2];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            newarr[arr[i]]++;
        }

        for (int i = 1; i < newarr.length; i++) {
            if (newarr[i] == 0) {
                System.out.println(i);
            }
        }
    }

    // reverse a string
    public static void stringreverse() {
        String s = "nithin";
        String n = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            n += s.charAt(i);
        }
        System.out.println(n);
    }

    // remove duplicates from array
    public static void removedupli() {
        int[] arr = { 1, 1, 2, 2, 4, 4, 5, 5, 6, 3, 6, 7, 7, 8, 8, 9, 9, 9, 3 };
        int[] temp = new int[arr.length];
        Arrays.sort(arr);

        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length - 1];

        for (int i = 0; i < j; i++) {
            System.out.println(temp[i] + " ");
        }

    }

    // 2nd max element in array
    public static void secmax() {
        int[] arr = { 31, 12, 95, 38 };
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int sndm = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                sndm = max;
                max = arr[i];
            } else if (arr[i] > sndm && arr[i] != max) {
                sndm = arr[i];
            }
        }
        System.out.println(sndm);
    }

    // merged sorted array
    public static void mergedarr() {
        int[] a1 = { 1, 3, 7, 8 };
        int[] a2 = { 2, 3, 6, 8 };
        int[] ma = new int[a1.length + a2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] < a2[j]) {
                ma[k] = a1[i];
                k++;
                i++;
            } else if (a1[i] == a2[j]) {
                ma[k] = a1[i];
                i++;
                k++;
                j++;
            } else {
                ma[k] = a2[j];
                k++;
                j++;
            }
        }
        while (i < a1.length) {
            ma[k++] = a1[i++];
        }
        while (j < a2.length) {
            ma[k++] = a2[j++];
        }

        for (int z = 0; z < k; z++) {
            System.out.println(ma[z] + " ");
        }
    }

    // reverse a linkedlist
    // public static class Node{
    // int data;
    // Node next;

    // public Node(int data){
    // this.data = data;
    // this.next = null;
    // }
    // }
    // public static void reverselist(){
    // LinkedList<Integer> l =new LinkedList<Integer>();

    // }

    // kth smallest element in array
    public static void kthsmallest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the kth smallest number u want");
        int k = sc.nextInt();
        int[] a = { 31, 11, 55, 61, 12, 17 };
        int max = Integer.MIN_VALUE;
        int kth = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int[] a2 = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            a2[a[i]]++;
        }

        for (int i = 0; i < a2.length; i++) {
            if (a2[i] != 0) {
                kth++;

                if (kth == k) {
                    System.out.println(i + " is the " + kth + "rd smallest number");
                }
            }

        }
    }

    // kth largest element
    public static void kthlargest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the kth smallest number u want");
        int k = sc.nextInt();
        int[] a = { 31, 11, 55, 61, 12, 17 };
        int max = Integer.MIN_VALUE;
        int kth = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int[] a2 = new int[max + 1];
        for (int i = 0; i < a.length; i++) {
            a2[a[i]]++;
        }

        for (int i = a2.length - 1; i >= 0; i--) {
            if (a2[i] != 0) {
                kth++;

                if (kth == k) {
                    System.out.println(i + " is the " + kth + " largest number");
                }
            }

        }
    }

    /*
     * Find count of All Combinations(for time being lets assume subarray ) of a
     * Sum: Write a function that finds all unique
     * subarry of numbers in a given array that less than or equalto target value.
     */

    public static void subsum() {
        int[] array = { 1, 1, 2, 3, 2, 3, 4 };
        int key = 6;
        // sort
        Arrays.sort(array);

        // duplicate
        int[] temp = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[j++] = array[i];
            }
        }
        temp[j++] = array[array.length - 1];

        // counting the subarrary
        int count = 0;
        for (int i = 0; i < j; i++) {
            int sum = 0;
            for (int k = i; k < j; k++) {
                sum += temp[k];
                if (sum < key) {
                    count++;
                } else {
                    break;
                }
            }
        }
        System.out.println(count);
    }

    /*
     * Calculate Binary Operations: Given a string with binary numbers and
     * operators (AND, OR, XOR), write a function to calculate the result by
     * scanning
     * from left to right.
     */

    public static void string_to_binary() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (str == null) {
            System.out.println("empty");
        }
        int result = str.charAt(0) - '0';
        for (int i = 1; i < str.length();) {
            char prev = str.charAt(i);
            i++;
            if (prev == 'A') {
                result = result & (str.charAt(i) - '0');
                i++;
            } else if (prev == 'B') {
                result = result | (str.charAt(i) - '0');
                i++;
            } else {
                result = result ^ (str.charAt(i) - '0');
                i++;
            }
        }
        System.out.println(result);
    }

    // password checker
    /*
     * You are given a function.
     * int CheckPassword(char str[], int n);
     * The function accepts string str of size n as an argument. Implement the
     * function which returns 1 if given string str is valid password else 0.
     * str is a valid password if it satisfies the below conditions.
     * 
     * – At least 4 characters
     * – At least one numeric digit
     * – At Least one Capital Letter
     * – Must not have space or slash (/)
     * – Starting character must not be a number
     */

    public static int passwordcheck() {
        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        int n = password.length();

        if (n < 4) {
            System.out.println("in valid password");
            return 0;
        }
        if (password.charAt(0) >= 0 && password.charAt(0) <= 9) {
            System.out.println("in valid password");
            return 0;
        }
        int caps = 0;
        int nums = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) == ' ' || password.charAt(i) == '/') {
                System.out.println("in valid password");
                return 0;
            }
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                caps++;
            }
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                nums++;
            }
        }
        if (caps > 0 && nums > 0) {
            System.out.println("valid password");
            return 1;
        } else {
            System.out.println("in valid password");
            return 0;
        }
    }

    /*
     * def differenceofSum(n. m)
     * The function accepts two integers n, m as arguments Find the sum of all
     * numbers in range from 1 to m(both inclusive) that are
     * not divisible by n. Return difference between sum of integers not divisible
     * by n with sum of numbers divisible by n.
     * Assumption:
     * n>0 and m>0
     * Sum lies between integral range
     */

    public static void differenceofsum() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int divsum = 0;
        int nondivsum = 0;

        for (int i = 1; i <= m; i++) {
            if (i % n == 0) {
                divsum = divsum + i;
            } else {
                nondivsum = nondivsum + i;
            }
        }
        int result = Math.abs(nondivsum - divsum);
        System.out.println(result);

    }

    /*
     * The function accepts an integers arr of size ’length’ as its arguments you
     * are required to return the sum of second largest element from the even
     * positions and second smallest from the odd position of given ‘arr’
     * Assumption:
     * All array elements are unique
     * Treat the 0th position as even
     * NOTE
     * Return 0 if array is empty
     * Return 0, if array length is 3 or less than 3
     */

    public static void oddevensum() {
        int[] arr = { 3, 2, 1, 7, 5, 4 };
        if (arr.length <= 3) {
            return;
        }
        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        even.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);

        // System.out.println(even.get(even.size()-2));
        // System.out.println(odd.get(1));
        int result = (even.get(even.size() - 2)) + (odd.get(1));
        System.out.println(result);
    }

    /*
     * The function accepts an integers sum and an integer array arr of size n.
     * Implement the function to find the pair,
     * (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two
     * elements of array (arr[j] + arr[k] <= sum)
     * and return the product of element of this pair.
     * NOTE
     * Return -1 if array is empty or if n<2
     * Return 0, if no such pairs found
     * All computed values lie within integer range
     */

    public static void ProductSmallestPair() {
        int[] arr = { 9, 8, 3, -7, 3, 9 }; // {5, 2, 4, 3, 9, 7, 1};
        int sum = 9;
        if (arr.length < 2) {
            return;
        }
        // for(int i=0; i<arr.length; i++){
        // for(int j = i+1; j<arr.length; j++){
        // if(arr[i]>arr[j]){
        // int temp = arr[i];
        // arr[i] = arr[j];
        // arr[j] = temp;
        // }
        // }
        // }

        Arrays.sort(arr);

        if ((arr[0] + arr[1]) <= sum) {
            System.out.println(arr[0] * arr[1]);
        } else {
            System.out.println("no such pair exists");
        }
    }

    /*
     * char*MoveHyphen(char str[],int n);
     * The function accepts a string “str” of length ‘n’, that contains alphabets
     * and hyphens (-). Implement the function to move all hyphens(-)
     * in the string to the front of the given string.
     * NOTE:- Return null if str is null.
     * Input:
     * str.Move-Hyphens-to-Front
     * Output:
     * —MoveHyphenstoFront
     */

    public static void MoveHyphen() {
        String str = "Move-Hyphens-to-Front";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '-') {
                result = str.charAt(i) + result;
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);

    }

    /*
     * Void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);
     * 
     * The function accepts a string ‘ str’ of length n and two characters ‘ch1’ and
     * ‘ch2’ as its arguments .
     * Implement the function to modify and return the string ‘ str’ in such a way
     * that all occurrences of ‘ch1’ in original
     * string are replaced by ‘ch2’ and all occurrences of ‘ch2’ in original string
     * are replaced by ‘ch1’.
     */

    public static void ReplaceCharacter() {
        String str = "apple";
        String result = "";
        char ch1 = 'a';
        char ch2 = 'p';

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch1) {
                result = result + ch2;
            } else if (str.charAt(i) == ch2) {
                result = result + ch1;
            } else {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);

    }

    /* reverse a word in a scentence */
    public static void reverseword() {
        String str = "we love you";
        StringBuilder result = new StringBuilder();
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || i == str.length() - 1) {
                int end; // = (str.charAt(i) == ' ') ? i - 1 : i;
                if (str.charAt(i) == ' ') {
                    end = i - 1;
                } else {
                    end = i;
                }
                for (int j = end; j >= start; j--) {
                    result.append(str.charAt(j));
                }
                if (i < str.length() - 1) {
                    result.append(' ');
                }
                start = i + 1;
            }

        }
        System.out.println(result.toString());

    }

    /* char pattern */

    public static void pattern() {
        char n = 'j';
        for (char i = 'a'; i <= n; i++) {
            for (char j = 'a'; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }

    // numbers block sort
    public static void rightrotate() {
        int[] arr = {10,222,45,23,78,34,11,90};
        
        int d=3;
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        start = 0;
        end = d;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end-1];
            arr[end-1] = temp;
            start++;
            end--;
        }
        start = d;
        end = arr.length;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end-1];
            arr[end-1] = temp;
            start++;
            end--;
        }
        


        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }



/*The function accepts two strings ‘str1’ and ‘str2’ as its argument. The function
needs to return the index of the first occurrence of substring ‘str2’ in string
‘str1’ or -1 if the substring is not found.*/
    public static void indexsubstring(){
        String str1=  "Hello, World!";
        String str2=  "World";

        System.out.println(str1.indexOf(str2)); 
        
    }

   /*  Given an array of integers, find the maximum subarray sum. A subarray is a
contiguous subsequence of the array*/
    public static void maxsumsubarray(){
        int[] arr = {-5, -3, -4, -11, -2, -10, -5, -3};
        int maxsofar = Integer.MIN_VALUE;
        int presentsum = 0;
        for(int i=0; i<arr.length; i++){
            presentsum = presentsum+arr[i];
            if(maxsofar<presentsum){
                maxsofar = presentsum;
            }
            if(presentsum<0){
                presentsum =0;
            }
        }
        System.out.println(maxsofar);
    }












    public static void main(String[] args) {
        // missing();
        // stringreverse();
        // removedupli();
        // secmax();
        // mergedarr();
        // reverselist();
        // kthsmallest();
        // kthlargest();
        // subsum();
        // string_to_binary();
        // passwordcheck();
        // differenceofsum();
        // oddevensum();
        // ProductSmallestPair();
        // MoveHyphen();
        // ReplaceCharacter();
        // reverseword();
        // pattern();
        // rightrotate();
        // indexsubstring();
        maxsumsubarray();
    }
}
