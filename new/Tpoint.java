
import java.util.Arrays;
import java.util.Scanner;

public class Tpoint {

    public static void fibo(int n) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);
        for (int i = 0; i < n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);

        }
    }

    // public static void prime(int n){
    // for(int i=2; i<=Math.sqrt(n); i++){
    // if(n%i==0){
    // System.out.println("not prime");
    // }
    // }
    // System.out.println("prime");
    // }
    public static boolean primenumber(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean palindrome(int n) {
        int rn = 0;
        int origi = n;
        while (n > 0) {
            int temp = n % 10;
            rn = (rn * 10) + temp;
            n = n / 10;
        }
        if (rn == origi) {
            return true;
        }
        return false;
    }

    public static int factorial(int n) {
        int fact = 1;
        if (n == 0) {
            return fact;
        }
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static boolean armstrong(int n) {
        int original = n;
        int result = 0;
        while (n > 0) {
            int t = n % 10;
            result = result + (t * t * t);
            n = n / 10;
        }
        if (original == result) {
            return true;
        }
        return false;
    }

    public static void randomnumber() {
        int min = 200;
        int max = 400;
        for (int i = 0; i < 5; i++) {
            System.out.println((int) (Math.random() * (max - min) + min));
        }
    }

    public static void pattern() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static boolean automorphic(int n) {
        int original = n % 10;
        int sn = (n * n) % 10;
        if (sn == original) {
            return true;
        }
        return false;
    }

    public static boolean peterson(int n) {
        int original = n;
        int result = 0;
        if (n == 1 || n == 2) {
            return true;
        }
        while (n > 0) {
            int temp = n % 10;
            result = result + factorial(temp);
            n = n / 10;
        }

        if (result == original) {
            return true;
        }

        return false;
    }

    public static int nthprime(int n) {
        int num = 2, count = 0;
        while (count < n) {
            if (primenumber(num)) {
                count++;
            }
            num++;
        }
        return num - 1;
    }

    public static void alternateprime(int n) {
        int temp = 2;
        for (int i = 2; i <= n; i++) {
            if (primenumber(i)) {
                temp++;
                if (temp % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static double sqareroot(int n) {
        double guess = n / 2;
        double epsilon = 0.00004;
        while (Math.abs(guess * guess - n) <= epsilon) {
            guess = (guess + n / guess) / 2;
        }
        return guess;
    }

    public static void swapbitwise(int a, int b) {
        System.out.println("before swaped " + a + "," + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("after swaped " + a + "," + b);

    }

    public static int gcd(int a, int b) {
        int result = 0;
        if (a == 0) {
            if (b == 0) {
                return a;
            }
            return b;
        }
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return result;
    }

    public static boolean perfectsqare(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }

    public static int frequancy(int n[], int k) {
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == k) {
                count++;
            }
        }

        return count;
    }

    public static void right_reverse(int n[], int k) {
        int temp[] = new int[n.length];
        for (int i = 0; i < k; i++) {
            temp[i] = n[n.length - k + i];
        }
        int j = 0;
        for (int i = k; i < n.length; i++) {
            temp[i] = n[j];
            j++;
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }

    }

    public static void left_reverse(int n[], int k) {
        int temp[] = new int[n.length];
        int j = 0;
        for (int i = k; i < n.length; i++) {
            temp[j] = n[i];
            j++;
        }
        for (int i = 0; i < k; i++) {
            temp[j] = n[i];
            j++;
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " ");
        }

    }

    public static void sortass(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // for(int i =0; i<arr.length; i++){
        // System.out.print(arr[i]+" ");
        // }
    }

    public static void sortdes(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void removeduplicate(int arr[]) {
        sortass(arr);
        int temp[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
                // j++;
            }
        }
        temp[j++] = arr[arr.length - 1];

        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void printduplicate(int arr[]) {
        sortass(arr);
        int temp[] = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                temp[j] = arr[i];
                j++;

                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }

        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void matrixs() {
        // int arr[][]= new int[3][3];
        int arr[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
        int brr[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };

        // Scanner sc = new Scanner(System.in);
        // for(int i =0; i<arr.length; i++){
        // for(int j=0; j<arr[0].length; j++){
        // arr[i][j] = sc.nextInt();
        // }
        // }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = arr[i][j] + arr[i][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void lowertrianglematrices() {
        int arr[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j > i) {
                    System.out.print("0 ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

    }

    public static void uppertrianglematrices() {
        int arr[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j < i) {
                    System.out.print("0 ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

    }

    public static void sumof_row_col() {
        int arr[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };

        for (int i = 0; i < arr.length; i++) {
            int rowsum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                rowsum = rowsum + arr[i][j];
            }
            System.out.println("sum of " + (i + 1) + " row " + rowsum);
        }
        System.out.println();
        for (int i = 0; i < arr[0].length; i++) {
            int colsum = 0;
            for (int j = 0; j < arr.length; j++) {
                colsum = colsum + arr[j][i];
            }
            System.out.println("sum of " + (i + 1) + " col " + colsum);
        }

    }

    public static void odd_even_frequancy() {
        int arr[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
        int evencount = 0;
        int oddcount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    evencount++;
                } else {
                    oddcount++;
                }
            }
        }
        System.out.println("evencount: " + evencount);
        System.out.println("odd: " + oddcount);

    }

    public static void transpose() {
        int arr[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
        int temp[][] = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                temp[j][i] = arr[i][j];
            }
        }
        System.out.println("after transpose");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static boolean checkidentitymatrix() {
        int arr[][] = { { 2, 0, 0 }, { 0, 3, 0 }, { 0, 0, 7 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i != j && arr[i][j] != 0) {
                    return false;
                }
                if (i == j && arr[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;

    }

    // strings
    public static int countchar(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static int countpunch(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '!' || str.charAt(i) == '.' || str.charAt(i) == '-' || str.charAt(i) == ','
                    || str.charAt(i) == '?' || str.charAt(i) == ';') {
                count++;
            }
        }
        return count;
    }

    public static boolean anagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.length() != b.length()) {
            return false;
        } else {
            char[] aa = a.toCharArray();
            char[] bb = b.toCharArray();

            Arrays.sort(aa);
            Arrays.sort(bb);

            if (Arrays.equals(aa, bb)) {
                return true;
            }
        }
        return false;
    }

    public static void dividestring(String str, int n) {
        int len = str.length();
        if (len % n != 0) {
            System.out.println("cant divide");
        } else {
            int charleng = len / n;
            System.out.println("we can divide the string into ");
            for (int i = 0; i < str.length(); i = i + charleng) {
                System.out.println(str.substring(i, i + charleng));
            }
        }
    }

    public static void subset(String str) {
        int len = str.length();
        int temp = 0;
        String arr[] = new String[len * (len + 1) / 2];
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                // for(int k=i; k<=j; k++ ){
                // System.out.print(str.charAt(k)+" ");
                // }
                // System.out.println();
                arr[temp++] = str.substring(i, j + 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    // longest repeting sequance in sring
    // /////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static String remove_whitespace(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                temp = temp + str.charAt(i);
            }
        }
        return temp;
    }

    public static String changecase(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            // if(Character.isLowerCase(str.charAt(i))){
            // temp = temp+Character.toUpperCase(str.charAt(i));
            // }else if(Character.isUpperCase(str.charAt(i))) {
            // temp = temp+Character.toLowerCase(str.charAt(i));
            // }
            // else{
            // temp = temp + str.charAt(i);
            // }
            if (str.charAt(i) > 64 && str.charAt(i) < 91) {
                temp = temp + (char) (str.charAt(i) + 32);
            } else if (str.charAt(i) > 96 && str.charAt(i) < 123) {
                temp = temp + (char) (str.charAt(i) - 32);
            } else {
                temp = temp + str.charAt(i);
            }
        }
        return temp;
    }

    public static boolean palindrome(String Str) {
        // StringBuilder temp = new StringBuilder();
        Str = Str.toLowerCase();
        // for (int i = Str.length() - 1; i >= 0; i--) {
        // temp.append(Str.charAt(i));
        // }
        // if (temp.toString().equals(Str)) {
        // return true;
        // }

        for (int i = 0; i < Str.length(); i++) {
            if (Str.charAt(i) != Str.charAt(Str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void max_min_frequancy(String str) {
        str = str.toLowerCase();
        int[] freq = new int[str.length()];
        char minchar = str.charAt(0);
        char maxchar = str.charAt(0);
        int max, min;

        char string[] = str.toCharArray();
        for (int i = 0; i < string.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    freq[i]++;
                    string[j] = '0';
                }
            }
        }
        min = max = freq[0];
        for (int i = 0; i < freq.length; i++) {
            if (string[i] != '0' && string[i] != ' ') {
                if (freq[i] < min) {
                    min = freq[i];
                    minchar = string[i];
                }
                if (freq[i] > max) {
                    max = freq[i];
                    maxchar = string[i];
                }
            }

        }
        System.out.println("maximum frequancy char = " + maxchar);
        System.out.println("min frequancy char = " + minchar);

    }

    ////////////////////
    public static String rotate_each_word(String str) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int start = i;
            while (i < str.length() && str.charAt(i) != ' ') {
                i++;
            }
            String word = substring(str, start, i);
            temp.append(word_reverse(word)).append(" ");
        }
        str = temp.toString();
        return str;
    }

    public static String word_reverse(String str) {
        StringBuilder temp = new StringBuilder(str).reverse();
        String Result = temp.toString();
        return Result;
    }

    public static String substring(String str, int start, int end) {
        StringBuilder temp = new StringBuilder();
        for (int i = start; i < end; i++) {
            temp.append(str.charAt(i));
        }
        String result = temp.toString();
        return result;
    }
    ///////////////////////

    public static void min_max_words_in_sentence(String str) {
        String word = "";
        String words[] = new String[100];
        int wordarrlength = 0;
        str = str + " ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {
                words[wordarrlength] = word;
                wordarrlength++;
                word = "";
            }
        }
        String min, max;
        min = max = words[0];
        for (int j = 0; j < wordarrlength; j++) {
            if (words[j].length() > max.length()) {
                max = words[j];
            }
            if (words[j].length() < min.length()) {
                min = words[j];
            }
        }
        System.out.println("largest word = " + max);
        System.out.println("smallest word = " + min);

    }

    public static void duplicatechar(String str) {
        char string[] = str.toCharArray();
        int temp[] = new int[string.length];
        for (int i = 0; i < string.length; i++) {
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ' && string[j] != 0) {
                    temp[i]++;
                    string[j] = 0;
                }
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 0) {
                System.out.println(string[i]);
            }
        }
    }

    public static void duplicatewords(String str) {
        str = str.toLowerCase() + " ";
        String word = "";
        String words[] = new String[100];
        int wordcount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {
                if (!word.isEmpty()) {
                    words[wordcount++] = word;
                    word = "";
                }
            }
        }
        int temp[] = new int[wordcount];
        for (int i = 0; i < wordcount; i++) {
            // int count =0;
            for (int j = i + 1; j < wordcount; j++) {
                if (words[i].equals(words[j])) {
                    temp[i]++;
                    words[j] = "";
                }
            }
            if (temp[i] > 0 && !words[i].isEmpty()) {
                System.out.println(words[i]);
            }
        }
    }

    public static void highest_repeting_word(String str) {
        str = str.toLowerCase() + " ";
        String word = "";
        String words[] = new String[100];
        int wordcount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                word = word + str.charAt(i);
            } else {
                if (!word.isEmpty()) {
                    words[wordcount++] = word;
                    word = "";
                }
            }
        }
        int temp[] = new int[wordcount];
        for (int i = 0; i < wordcount; i++) {
            // int count =0;
            if (words[i] != null && !words[i].isEmpty()) {
                for (int j = i + 1; j < wordcount; j++) {
                    if (words[i].equals(words[j])) {
                        temp[i]++;
                        words[j] = "";
                    }
                }
            }
        }
        String max = "";
        int maxcount = 0;
        for (int i = 0; i < wordcount; i++) {
            if (temp[i] > maxcount) {
                maxcount = temp[i];
                max = words[i];
            }
        }
        System.out.println("highest repeting word is " + max);
    }

    public static int total_words(String str) {
        str = str + " ";
        int count = 0;
        if (str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            return count;
        }
        return count;

    }

    public static void swap_strings(String str1, String str2) {
        System.out.println(str1 + "," + str2);
        str1 = str1 + str2;
        str2 = str1.substring(0, (str1.length() - str2.length()));
        str1 = str1.substring(str2.length());
        System.out.println(str1 + "," + str2);
    }

    public static void max_min_palindrme(String str) {
        // String words[] = new String[str.length()];
        // String word = "";
        // str = str+" ";
        // int wordslength =0;
        // for(int i=0; i<str.length();i++){
        // if(str.charAt(i)!=' '){
        // word = word+str.charAt(i);
        // }else {
        // words[wordslength++]=word;
        // word="";
        // }
        // }

        // we can also write int his way
        String words[] = str.split("\\s+");
        int wordslength = words.length;
        String minpalindrome = words[0];
        String maxpalindrome = words[0];

        for (int i = 0; i < wordslength; i++) {

            if (palindrome(words[i])) {
                if (words[i].length() > maxpalindrome.length()) {
                    maxpalindrome = words[i];
                }
                if (words[i].length() < minpalindrome.length()) {
                    minpalindrome = words[i];
                }
            }
        }
        System.out.println("maxmimum palindrome  " + maxpalindrome);
        System.out.println("minimum palindrome  " + minpalindrome);
    }

    // searching nd sorting
    public static int binarysearch(int arr[], int k) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        Arrays.sort(arr);

        while (start <= end) {
            if (arr[mid] < k) {
                start = mid + 1;
            } else if (arr[mid] > k) {
                end = mid - 1;
            } else {
                return mid;
            }
            mid = (start + end) / 2;
        }
        if (start > end) {
            return -1;
        }
        return mid;
    }

    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void selection_sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    int temp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionsort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // patterns
    public static void pattern1(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = x; j > 0; j--) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void pattern2(int x) {
        for (int i = 1; i <= x; i++) {
            int j;
            for (j = 1; j <= x; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
            }
            j--;
            System.out.print("*");
            while (j >= 1) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print("0");
                }
                j--;
            }
            System.out.println();
        }
    }

    public static void code() {
        String str = "11101011110";
        int count = 64;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
            if (str.charAt(i) == '0') {
                System.out.print((char) count);
                count = 64;
            }
        }
    }

    public static boolean code2(int x) {
        int sum = 0;
        while (x > 0) {
            int temp = x % 10;
            sum = sum + temp;
            x = x / 10;
        }
        if (sum == 1 || sum < 1) {
            return false;
        }
        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                return false;
            }
        }
        return true;
    }

    ///
    public static int arrsum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void spcial_palindrome(int x) {
        int n1 = 0, n2 = 0, n3 = 1, n4;
        for (int i = 0; i < x; i++) {
            n4 = n3 + n2 + n1;
            n1 = n2;
            n2 = n3;
            n3 = n4;
            System.out.print(n4 + " ");
        }
    }

    public static void pattern3(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int x) {
        for (int i = 1; i < x; i++) {
            for (int j = 1; j <= x / 2; j++) {
                if (i == j || (i > x / 2 && j == x - i)) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = (x / 2) - 1; j >= 1; j--) {
                if (i == j || (i > x / 2 && j == x - i)) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void spiralmini(int a) {
        int arr[][] = new int[a][a];
        int direction = 1;
        int j = 0, k = 0, i;
        for (i = 1; i <= (a - 1) * (a - 1); i++) {

            arr[j][k] = i;
            switch (direction) {
                case 1:
                    if (k + 1 < a) {
                        if (arr[j][k + 1] == 0) {
                            k++;
                            continue;
                        } else {
                            j++;
                            direction = 2;
                            continue;
                        }
                    } else {
                        j++;
                        direction = 2;
                        continue;
                    }

                case 2:
                    if (j + 1 < a) {
                        if (arr[j + 1][k] == 0) {
                            j++;
                            continue;
                        } else {
                            k--;
                            direction = 3;
                            continue;
                        }
                    } else {
                        k--;
                        direction = 3;
                        continue;
                    }

                case 3:
                    if (k - 1 >= 0) {
                        if (arr[j][k - 1] == 0) {
                            k--;
                            continue;
                        } else {
                            j--;
                            direction = 4;
                            continue;
                        }
                    } else {
                        j--;
                        direction = 4;
                        continue;
                    }

                case 4:
                    if (j - 1 >= 0) {
                        if (arr[j - 1][k] == 0) {
                            j--;
                            continue;
                        } else {
                            k++;
                            direction = 1;
                            continue;
                        }
                    } else {
                        k++;
                        direction = 1;
                        continue;
                    }
            }
        }

        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                if (arr[i][j] == 0) {
                    System.out.print("\t");
                } else {
                    System.out.print(arr[i][j] + "\t");
                }
            }
            System.out.println();
        }

    }

    // soertend
    public static void spiralmini_modified(int a) {
        int arr[][] = new int[a][a];
        int direction = 1;
        int j = 0, k = 0, i;
        for (i = 1; i <= (a - 1) * (a - 1); i++) {

            arr[j][k] = i;
            switch (direction) {
                case 1:
                    if (k + 1 < a) {
                        k++;
                        continue;
                    } else {
                        j++;
                        direction = 2;
                        continue;
                    }

                case 2:
                    if (j + 1 < a) {
                        j++;
                        continue;
                    } else {
                        k--;
                        direction = 3;
                        continue;
                    }

                case 3:
                    if (k - 1 >= 0) {
                        k--;
                        continue;
                    } else {
                        j--;
                        direction = 4;
                        continue;
                    }

                case 4:
                    if (j - 1 >= 0) {
                        j--;
                        continue;
                    } else {
                        k++;
                        direction = 1;
                        continue;
                    }
            }
        }

        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                if (arr[i][j] == 0) {
                    System.out.print("\t");
                } else {
                    System.out.print(arr[i][j] + "\t");
                }
            }
            System.out.println();
        }

    }

    public static void spiralmatrix(int a) {
        int arr[][] = new int[a][a];
        int i, j = 0, k = 0;
        int direction = 1;

        for (i = 1; i <= a * a; i++) {
            arr[j][k] = i;
            switch (direction) {
                case 1:
                    if (k + 1 < a) {
                        if (arr[j][k + 1] == 0) {
                            k++;
                            continue;
                        } else {
                            j++;
                            direction = 2;
                            continue;
                        }
                    } else {
                        j++;
                        direction = 2;
                        continue;
                    }

                case 2:
                    if (j + 1 < a) {
                        if (arr[j + 1][k] == 0) {
                            j++;
                            continue;
                        } else {
                            k--;
                            direction = 3;
                            continue;
                        }
                    } else {
                        k--;
                        direction = 3;
                        continue;
                    }

                case 3:
                    if (k - 1 >= 0) {
                        if (arr[j][k - 1] == 0) {
                            k--;
                            continue;
                        } else {
                            j--;
                            direction = 4;
                            continue;
                        }
                    } else {
                        j--;
                        direction = 4;
                        continue;
                    }

                case 4:
                    if (j - 1 >= 0) {
                        if (arr[j - 1][k] == 0) {
                            j--;
                            continue;
                        } else {
                            k++;
                            direction = 1;
                            continue;
                        }
                    } else {
                        k++;
                        direction = 1;
                        continue;
                    }
            }
        }

        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                if (arr[i][j] < 10) {
                    System.out.print(arr[i][j] + "  ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

    }

    public static void print_spiral_matrix(int arr[][]) {

        int bottom = arr.length - 1;
        int right = arr[0].length - 1;
        int top = 0, left = 0;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }

    }

    public static void pattern5(int n) {
        System.out.println("0");
        for (int i = 1; i < n; i++) {
            for (int j = n - i; j < n; j++) {
                System.out.print(j);
            }
            System.out.print("0");

            for (int j = n - 1; j >= n - i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        // 0
        // 909
        // 89098
        // 7890987
        // 678909876
        // 56789098765
        // 4567890987654
        // 345678909876543
        // 23456789098765432
        // 1234567890987654321
    }

    public static void alp_pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (65 + i) + " ");
            }
            System.out.println();
        }
    }

    public static void alp_pattern2(int n) {
        int c = 0;
        char cc = 'a';
        int s = cc;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (s + c++) + " ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n - 1 || i == n - 1 || j == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern7(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern8(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // linkedlist
    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void add_at_beg(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public static void add_at_end(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public static void add_at_idx(int idx, int data) {
        if (idx == 0) {
            add_at_beg(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public static int remove_at_beg() {
        if (size == 0) {
            return -1;
        } else if (size == 1) {
            int res = head.data;
            head = tail = null;
            size = 0;
            return res;
        }
        int res = head.data;
        head = head.next;
        size--;
        return res;
    }

    public static int remove_at_end() {
        if (size == 0) {
            return -1;
        } else if (size == 1) {
            int res = head.data;
            head = tail = null;
            size = 0;
            return res;
        }
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int res = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return res;
    }

    public static int searchll(int x) {
        Node temp = head;
        int i = 0;
        while (temp.next != null) {
            if (temp.data == x) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static Node mid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static int mida() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public static void reversell() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static boolean palindrome() {
        if (head != null && head.next == null) {
            return true;
        }
        Node midnode = mid(head);
        Node prev = null;
        Node curr = midnode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;

    }

    public static boolean isloop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static void removeloop() {
        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }

        slow = head;
        Node prev = null;

        while (slow != fast) {
            prev = fast;
            fast = fast.next;
            slow = slow.next;
        }
        prev.next = null;
    }

    public static void min_max() {
        int min = Integer.MAX_VALUE;
        int max = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }
            if (temp.data < min) {
                min = temp.data;
            }
            temp = temp.next;
        }

        System.out.println("max number = " + max);
        System.out.println("min number = " + min);
    }

    public static void printll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static int palindrome_in_range(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            // int rev =0;
            // int num =i;
            // while(num>0){
            // int temp = num%10;
            // rev = (rev*10)+temp;
            // num = num/10;
            // }
            // if(i==rev){
            // count++;
            // }
            if (palindrome(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean tcs1(int k) {
        int sum = 0;
        while (k > 0) {
            int temp = k % 10;
            sum = sum + temp;
            k = k / 10;
        }
        if (sum % 3 == 0) {
            return true;
        }
        return false;
    }

    public static int tcs111(int arr[], int k) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] - arr[j] == k || arr[j] - arr[i] == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean tcs2(int k) {
        int sum = 0;
        for (int i = 1; i < k; i++) {
            if (k % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == k) {
            return true;
        }
        return false;
    }

    public static void tcs22(int arr[]) {
        boolean[] visted = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visted[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visted[j] = true;
                }
            }
            System.out.println(arr[i] + " is repeted " + count + " times");
        }
    }

    public static boolean tcs33(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int leftsum = 0;
            int rightsum = 0;

            for (int j = 0; j <= i; j++) {
                leftsum = leftsum + arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                rightsum = rightsum + arr[j];
            }
            if (leftsum == rightsum) {
                return true;
            }
        }
        return false;
    }

    /*
     * Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string
     * is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it
     * a valid string. The string is considered valid if the number of ‘*’ and ‘#’
     * are equal. The ‘*’ and ‘#’ can be at any position in the string.
     * Note : The output will be a positive or negative integer based on number of
     * ‘*’ and ‘#’ in the input string.
     * 
     * (*>#): positive integer
     * (#>*): negative integer
     * (#=*): 0
     * Example 1:
     * Input 1:
     * 
     * ###*** -> Value of S
     * Output :
     * 
     * 0 → number of * and # are equal
     */
    public static int tcs10(String str) {
        int starcount = 0;
        int hashcount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                starcount++;
            }

            if (str.charAt(i) == '#') {
                hashcount++;
            }
        }
        return starcount - hashcount;
    }

    /*
     * Given an integer array Arr of size N the task is to find the count of
     * elements whose value is greater than all of its prior elements.
     * 
     * Note : 1st element of the array should be considered in the count of the
     * result.
     * 
     * For example,
     * Arr[]={7,4,8,2,9}
     * As 7 is the first element, it will consider in the result.
     * 8 and 9 are also the elements that are greater than all of its previous
     * elements.
     * Since total of 3 elements is present in the array that meets the condition.
     * Hence the output = 3.
     * Example 1:
     * 
     * Input
     * 5 -> Value of N, represents size of Arr
     * 7-> Value of Arr[0]
     * 4 -> Value of Arr[1]
     * 8-> Value of Arr[2]
     * 2-> Value of Arr[3]
     * 9-> Value of Arr[4]
     * 
     * Output :
     * 3
     */
    public static int tcs11(int arr[]) {
        int count = 1;
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count++;
            }
        }
        return count;
    }

    /*
     * A parking lot in a mall has RxC number of parking spaces. Each parking space
     * will either be empty(0) or full(1). The status (0/1) of a parking space is
     * represented as the element of the matrix. The task is to find index of the
     * prpeinzta row(R) in the parking lot that has the most of the parking spaces
     * full(1).
     * 
     * Note :
     * RxC- Size of the matrix
     * Elements of the matrix M should be only 0 or 1.
     * 
     * Example 1:
     * Input :
     * 3 -> Value of R(row)
     * 3 -> value of C(column)
     * [0 1 0 1 1 0 1 1 1] -> Elements of the array M[R][C] where each element is
     * separated by new line.
     * Output :
     * 3 -> Row 3 has maximum number of 1’s
     * 
     * Example 2:
     * input :
     * 4 -> Value of R(row)
     * 3 -> Value of C(column)
     * [0 1 0 1 1 0 1 0 1 1 1 1] -> Elements of the array M[R][C]
     * Output :
     * 4 -> Row 4 has maximum number of 1’s
     */
    public static void tcs12(int row, int col) {
        int arr[][] = new int[row][col];
        Scanner sc = new Scanner(System.in);
        int highestrow = 1;
        int highsum = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
            for (int j = 0; j < arr[0].length; j++) {
                sum = sum + arr[i][j];
            }
            if (highsum < sum) {
                highestrow++;
            }
        }
        System.out.println("Row " + highestrow + " has maximum number of 1’s");
    }

    /*
     * A party has been organised on cruise. The party is organised for a limited
     * time(T). The number of guests entering (E[i]) and leaving (L[i]) the party at
     * every hour is represented as elements of the array. The task is to find the
     * maximum number of guests present on the cruise at any given instance within T
     * hours.
     * 
     * Example 1:
     * Input :
     * 
     * 5 -> Value of T
     * [7,0,5,1,3] -> E[], Element of E[0] to E[N-1], where input each element is
     * separated by new line
     * [1,2,1,3,4] -> L[], Element of L[0] to L[N-1], while input each element is
     * separate by new line.
     * Output :
     * 8 -> Maximum number of guests on cruise at an instance.
     * 
     * Explanation:
     * 
     * 1st hour:
     * Entry : 7 Exit: 1
     * No. of guests on ship : 6
     * 
     * 2nd hour :
     * Entry : 0 Exit : 2
     * No. of guests on ship : 6-2=4
     * 
     * Hour 3:
     * Entry: 5 Exit: 1
     * No. of guests on ship : 4+5-1=8
     * 
     * Hour 4:
     * Entry : 1 Exit : 3
     * No. of guests on ship : 8+1-3=6
     * 
     * Hour 5:
     * Entry : 3 Exit: 4
     * No. of guests on ship: 6+3-4=5
     * Hence, the maximum number of guests within 5 hours is 8.
     */

    public static int tcs13(int t) {
        int e[] = new int[t];
        int l[] = new int[t];

        Scanner sc = new Scanner(System.in);

        System.out.println("enter entry members");
        for (int i = 0; i < t; i++) {
            e[i] = sc.nextInt();
        }
        System.out.println("enter leaving members");
        for (int i = 0; i < t; i++) {
            l[i] = sc.nextInt();
        }
        int maxxmembers = 0;
        int totalmembers = 0;

        for (int i = 0; i < t; i++) {
            totalmembers = totalmembers + e[i] - l[i];
            if (totalmembers > maxxmembers) {
                maxxmembers = totalmembers;
            }
        }
        return maxxmembers;
    }

    /*
     * /*At a fun fair, a street vendor is selling different colours of balloons. He
     * sells N number of different colours of balloons (B[]). The task is to find
     * the colour (odd) of the balloon which is present odd number of times in the
     * bunch of balloons.
     * 
     * Note: If there is more than one colour which is odd in number, then the first
     * colour in the array which is present odd number of times is displayed. The
     * colours of the balloons can all be either upper case or lower case in the
     * array. If all the inputs are even in number, display the message “All are
     * even”.
     * 
     * Example 1:
     * 
     * 7 -> Value of N
     * [r,g,b,b,g,y,y] -> B[] Elements B[0] to B[N-1], where each input element is
     * sepārated by ṉew line.
     * Output :r -> [r,g,b,b,g,y,y] -> “r” colour balloon is present odd number of
     * times in the bunch.
     * Explanation:
     * From the input array above:
     * r: 1 balloon
     * g: 2 balloons
     * b: 2 balloons
     * y : 2 balloons
     * hence , r is only the balloon which is odd in number.
     * 
     * Example 2:
     * Input:
     * 10 -> Value of N
     * [a,b,b,b,c,c,c,a,f,c] -> B[], elements B[0] to B[N-1] where input each
     * element is separated by new line.
     * Output :
     * b-> ‘b’ colour balloon is present odd number of times in the bunch.
     */
    public static void tcs14() {
        System.out.println("enter nummber of ballons");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String baloon[] = new String[n];
        int temp[] = new int[n];

        System.out.println("enter baloon chars");
        for (int i = 0; i < baloon.length; i++) {
            baloon[i] = sc.next().toLowerCase();
        }

        for (int i = 0; i < temp.length; i++) {
            temp[i] = 1;
        }

        for (int i = 0; i < baloon.length; i++) {
            if (!baloon[i].equals("0")) {
                for (int j = i + 1; j < baloon.length; j++) {
                    if (!baloon[i].equals("0")) {
                        if (baloon[i].equals(baloon[j])) {
                            temp[i]++;
                            baloon[j] = "0";
                        }
                    }
                }
            }
        }

        for (int j = 0; j < temp.length; j++) {
            if (temp[j] % 2 != 0 && !baloon[j].equals("0")) {
                System.out.println("first odd occarance : " + baloon[j]);
                return;
            }
        }
        System.out.println("all are even");
    }

    /*
     * Selection of MPCS exams include a fitness test which is conducted on ground.
     * There will be a batch of 3 trainees, appearing for running test in track for
     * 3 rounds. You need to record their oxygen level after every round. After
     * trainee are finished with all rounds, calculate for each trainee his average
     * oxygen level over the 3 rounds and select one with highest oxygen level as
     * the most fit trainee. If more than one trainee attains the same highest
     * average level, they all need to be selected.
     * 
     * Display the most fit trainee (or trainees) and the highest average oxygen
     * level.
     * 
     * Note:
     * 
     * The oxygen value entered should not be accepted if it is not in the range
     * between 1 and 100.
     * If the calculated maximum average oxygen value of trainees is below 70 then
     * declare the trainees as unfit with meaningful message as “All trainees are
     * unfit.
     * Average Oxygen Values should be rounded.
     * Example 1:
     * INPUT VALUES
     * 95
     * 92
     * 95
     * 92
     * 90
     * 92
     * 90
     * 92
     * 90
     * 
     * OUTPUT VALUES
     * Trainee Number : 1
     * Trainee Number : 3
     * 
     * Note:
     * Input should be 9 integer values representing oxygen levels entered in order
     * as
     */
    public static void tcs15(int arr[]) {
        int temp[] = new int[3];

        for (int i = 0; i < arr.length / 3; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j = j + 3) {
                sum = sum + arr[j];
            }
            temp[i] = sum / 3;
        }

        int highest = temp[0];
        if (highest < temp[1]) {
            highest = temp[1];
        } else if (highest < temp[2]) {
            highest = temp[2];
        }

        if (highest < 70) {
            System.out.println("all are unfit");
            return;
        }

        for (int i = 0; i < 3; i++) {
            if (highest == temp[i]) {
                System.out.println("trainee number : " + (i + 1));
            }
        }
    }

    /*
     * The Caesar cipher is a type of substitution cipher in which each alphabet in
     * the plaintext or messages is shifted by a number of places down the alphabet.
     * For example,with a shift of 1, P would be replaced by Q, Q would become R,
     * and so on.
     * To pass an encrypted message from one person to another, it is first
     * necessary that both parties have the ‘Key’ for the cipher, so that the sender
     * may encrypt and the receiver may decrypt it.
     * Key is the number of OFFSET to shift the cipher alphabet. Key can have basic
     * shifts from 1 to 25 positions as there are 26 total alphabets.
     * As we are designing custom Caesar Cipher, in addition to alphabets, we are
     * considering numeric digits from 0 to 9. Digits can also be shifted by key
     * places.
     * For Example, if a given plain text contains any digit with values 5 and keyy
     * =2, then 5 will be replaced by 7, “-”(minus sign) will remain as it is. Key
     * value less than 0 should result into “INVALID INPUT”
     * 
     * Example 1:
     * Enter your PlainText: All the best
     * Enter the Key: 1
     * 
     * The encrypted Text is: Bmm uif Cftu
     * 
     * Write a function CustomCaesarCipher(int key, String message) which will
     * accept plaintext and key as input parameters and returns its cipher text as
     * output.
     */
    public static String tcs16(String str, int key) {
        if (key == 0) {
            return "invalid key input";
        }

        String enc = "";
        char s;
        int x;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                s = str.charAt(i);
                x = s + key;
                enc = enc + (char) x;
            } else {
                enc = enc + str.charAt(i);
            }
        }
        return enc;
    }

    /*
     * A City Bus is a Ring Route Bus which runs in circular fashion.That is, Bus
     * once starts at the Source Bus Stop, halts at each Bus Stop in its Route and
     * at the end it reaches the Source Bus Stop again.
     * If there are n number of Stops and if the bus starts at Bus Stop 1, then
     * after nth Bus Stop, the next stop in the Route will be Bus Stop number 1
     * always.
     * If there are n stops, there will be n paths.One path connects two stops.
     * Distances (in meters) for all paths in Ring Route is given in array Path[] as
     * given below:
     * Path = [800, 600, 750, 900, 1400, 1200, 1100, 1500]
     * Fare is determined based on the distance covered from source to destination
     * stop as Distance between Input Source and Destination Stops can be measured
     * by looking at values in array Path[] and fare can be calculated as per
     * following criteria:
     * 
     * If d =1000 metres, then fare=5 INR
     * (When calculating fare for others, the calculated fare containing any
     * fraction value should be ceiled. For example, for distance 900n when fare
     * initially calculated is 4.5 which must be ceiled to 5)
     * Path is circular in function. Value at each index indicates distance till
     * current stop from the previous one. And each index position can be mapped
     * with values at same index in BusStops [] array, which is a string array
     * holding abbreviation of names for all stops as-
     * “THANERAILWAYSTN” = ”TH”, “GAONDEVI” = “GA”, “ICEFACTROY” = “IC”,
     * “HARINIWASCIRCLE” = “HA”, “TEENHATHNAKA” = “TE”, “LUISWADI” = “LU”,
     * “NITINCOMPANYJUNCTION” = “NI”, “CADBURRYJUNCTION” = “CA”
     * 
     * Given, n=8, where n is number of total BusStops.
     * BusStops = [ “TH”, ”GA”, ”IC”, ”HA”, ”TE”, ”LU”, ”NI”,”CA” ]
     * 
     * Write a code with function getFare(String Source, String Destination) which
     * take Input as source and destination stops(in the format containing first two
     * characters of the Name of the Bus Stop) and calculate and return travel fare.
     * 
     * Example 1:
     * Input Values
     * ca
     * Ca
     * Output Values
     * INVALID OUTPUT
     * 
     * Example 2:
     * Input Values
     * NI
     * HA
     * Output Values
     * 23.0 INR
     * Note: Input and Output should be in format given in example.
     * Input should not be case sensitive and output should be in the format INR
     */
    public static String tcs17(String source, String dest) {
        String[] busStops = { "TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA" };
        int[] path = { 800, 600, 750, 900, 1400, 1200, 1100, 1500 };

        source = source.toUpperCase();
        dest = dest.toUpperCase();

        int sourceinx = -1;
        int destidx = -1;

        for (int i = 0; i < busStops.length; i++) {
            if (source.equals(busStops[i])) {
                sourceinx = i;
            }
            if (dest.equals(busStops[i])) {
                destidx = i;
            }
        }
        if (sourceinx == -1 || destidx == -1 || sourceinx == destidx) {
            return "Invalid inputs";
        }

        int totaltripdistance = 0;
        if (destidx > sourceinx) {
            for (int i = sourceinx; i < destidx; i++) {
                totaltripdistance = totaltripdistance + path[i];
            }
        } else {
            for (int i = sourceinx; i < path.length; i++) {
                totaltripdistance = totaltripdistance + path[i];
            }
            for (int i = 0; i < destidx; i++) {
                totaltripdistance = totaltripdistance + path[i];
            }
        }
        double fair = Math.ceil((double) totaltripdistance / 1000) * 5;

        return fair + " inr";
    }

    /*
     * There are total n number of Monkeys sitting on the branches of a huge Tree.
     * As travelers offer Bananas and Peanuts, the Monkeys jump down the Tree. If
     * every Monkey can eat k Bananas and j Peanuts. If total m number of Bananas
     * and p number of Peanuts are offered by travelers, calculate how many Monkeys
     * remain on the Tree after some of them jumped down to eat.
     * At a time one Monkeys gets down and finishes eating and go to the other side
     * of the road. The Monkey who climbed down does not climb up again after eating
     * until the other Monkeys finish eating.
     * Monkey can either eat k Bananas or j Peanuts. If for last Monkey there are
     * less than k Bananas left on the ground or less than j Peanuts left on the
     * ground, only that Monkey can eat Bananas(<k) along with the Peanuts(<j).
     * Write code to take inputs as n, m, p, k, j and return the number of Monkeys
     * left on the Tree.
     * Where, n= Total no of Monkeys
     * k= Number of eatable Bananas by Single Monkey (Monkey that jumped down last
     * may get less than k Bananas)
     * j = Number of eatable Peanuts by single Monkey(Monkey that jumped down last
     * may get less than j Peanuts)
     * m = Total number of Bananas
     * p = Total number of Peanuts
     * Remember that the Monkeys always eat Bananas and Peanuts, so there is no
     * possibility of k and j having a value zero
     * 
     * Example 1:
     * Input Values
     * 20
     * 2
     * 3
     * 12
     * 12
     * 
     * Output Values
     * Number of Monkeys left on the tree:10
     * Note: Kindly follow the order of inputs as n,k,j,m,p as given in the above
     * example. And output must include the same format as in above example(Number
     * of Monkeys left on the Tree:)
     * For any wrong input display INVALID INPUT
     */
    public static int tcs18(int monkeys, int eatbanana, int eatpea, int totalbanana, int totalpea) {
        if (monkeys <= 0 && eatbanana <= 0 || eatpea <= 0 || totalbanana <= 0 || totalpea < 0) {
            System.out.println("invalid inputs");
        }
        int monkeyscan_banana = totalbanana / eatbanana;
        int monkeyscan_pea = totalpea / eatpea;

        int monkeysleft = monkeys - monkeyscan_banana - monkeyscan_pea;
        if (totalbanana % eatbanana != 0 || totalpea % eatpea != 0) {
            return monkeysleft - 1;
        }
        return monkeysleft;
    }

    // number to binary
    public static int binary(int n) {
        String binary = "";
        while (n > 0) {
            if (n % 2 == 1) {
                binary = "1" + binary;
                n = n / 2;
            } else {
                binary = "0" + binary;
                n = n / 2;
            }
        }
        return Integer.parseInt(binary);
    }

    // will return int
    public static int decimalToBinary(int Decimal) {
        int temp;
        int binary = 0;
        int count = 0;

        while (Decimal > 0) {
            temp = Decimal % 2;
            binary = binary + (temp * (int) Math.pow(10, count));
            Decimal = Decimal / 2;
            count++;
        }

        return binary;
    }

    // binary to number
    public static int number(int n) {
        int number = 0;
        int power = 0;
        while (n > 0) {
            int temp = n % 10;
            if (temp == 1) {
                number = number + (int) Math.pow(2, power);
                n = n / 10;
                power++;
            } else {
                n = n / 10;
                power++;
            }

        }
        return number;
    }

    // finding the second smallest and seccond largest n arr(contains duplicate
    // values also)
    public static void a_2ndmax_2ndmin(int arr[]) {
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
            if (arr[i] < small) {
                small = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
            if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }

        System.out.println("second small : " + second_small);
        System.out.println("large small : " + second_large);

    }

    // reverse a string
    public static int[] reversearr(int arr[]) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    /*
     * Rearrange array in increasing-decreasing order
     * 
     * 
     * Problem Statement: Rearrange the array such that the first half is arranged
     * in increasing order, and the second half is arranged in decreasing order
     * 
     * Example 1:
     * Input: 8 7 1 6 5 9
     * Output: 1 5 6 9 8 7
     * Explanation: First three elements are in the ascending order and next three
     * elements are in the descending order.
     * 
     * Example 2:
     * Input: 4 2 8 6 15 5 9 20
     * Output: 2 4 5 6 20 15 9 8
     */
    public static void sorta_d(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int temp[] = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < (arr.length) / 2; i++) {
            temp[i] = arr[idx++];
        }
        int n = idx;
        for (int i = arr.length - 1; i >= n; i--) {
            temp[i] = arr[idx++];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(temp[i] + " ");
        }
    }

    public static void abcd(int i[]) {
        i[0]++;
        i[1]++;
        i[2]++;

    }

    // median in array
    public static double median(int arr[]) {
        if (arr.length % 2 == 1) {
            return arr[arr.length / 2];
        }
        return (double) (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
    }

    // remove duplicates in sorted array
    public static int remove_duplicates(int arr[]) {
        int idx = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[idx++] = arr[i];
            }
        }
        return idx;
    }

    // alternate swaping of numbers by k
    public static int[] alternateswap(int arr[], int k) {
        int result[] = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length / (k * 2); i++) {
            for (int j = 0; j < k; j++) {
                result[idx++] = arr[idx - 1];
            }
            int r = idx;
            for (int j = r + k - 1; j >= r; j--) {
                result[idx++] = arr[j];
            }
        }
        return result;
    }

    // Find all repeating elements in an array
    public static void repeatelements(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    // Find all non-repeating elements in an array
    public static void non_repeatelements(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }

    // nonrepeating elements
    public static void non_repeating(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean repeted = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    repeted = true;
                    break;
                }
            }
            if (!repeted) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    // Find all Symmetric Pairs in the array of pairsFind all Symmetric Pairs in the
    // array of pairs
    public static void Symmetric_pair(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            boolean sym = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][1] == arr[j][0] && arr[i][0] == arr[j][1]) {
                    sym = true;
                    System.out.println("(" + arr[i][0] + "," + arr[i][1] + ")");
                    break;
                }
            }
        }
    }

    // Maximum Product Subarray in an Array
    public static int maxsubarr_product(int arr[]) {
        int maxproduct = 0;
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = i; j < arr.length; j++) {
                // for(int k = i; k<=j; k++){
                // product *= arr[k];
                // }
                product *= arr[j];
                if (product > maxproduct) {
                    maxproduct = product;
                }
            }
        }
        return maxproduct;
    }

    // Replace elements by its rank in the array
    public static void ranks(int arr[]) {
        int temp[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        int ranks[] = new int[arr.length];
        int idx = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || temp[i] != temp[i - 1]) {
                ranks[i] = idx++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == temp[j]) {
                    arr[i] = ranks[j];
                    break;
                }
            }
        }
    }

    /*
     * Jack and Jill are playing a string game. Jack has given Jill two strings A
     * and B. Jill has to derive a string C from A, by deleting elements from string
     * A, such that string C does not contain any element of string B. Jill needs
     * help to do this task. She wants a program to do this as she is lazy. Given
     * strings A and B as input, give string C as Output.
     * 
     * Example 1:
     * 
     * Input:
     * tiger -> input string A
     * ti -> input string B
     * Output:
     * ger -> Output string C
     * 
     * Example 2:
     * 
     * Input:
     * processed -> input string A
     * esd -> input string B
     * Output:
     * proc -> Output string C
     */
    public static String mock(String str, String str2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            boolean match = false;
            for (int j = 0; j < str2.length(); j++) {
                if (str.charAt(i) == (str2.charAt(j))) {
                    match = true;
                    break;
                }
            }
            if (!match) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    /*
     * Finding Equilibrium index in an array
     * Example 1:
     * Input: nums = [2,3,-1,8,4]
     * Output: 3
     * Explanation: The sum of the numbers before index 3 is: 2 + 3 + -1 = 4
     * The sum of the numbers after index 3 is: 4 = 4
     * 
     * Example 2:
     * Input: nums = [1,-1,4]
     * Output: 2
     * Explanation: The sum of the numbers before index 2 is: 1 + -1 = 0
     * The sum of the numbers after index 2 is: 0
     */

    public static int Equilibrium_index(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int leftsum = 0;
            int rightsum = 0;

            if (i != 0) {
                for (int j = 0; j < i; j++) {
                    leftsum = leftsum + arr[j];
                }
            }

            if (i != arr.length - 1) {
                for (int j = i + 1; j < arr.length; j++) {
                    rightsum = rightsum + arr[j];
                }
            }

            if (leftsum == rightsum) {
                return i;
            }
        }
        return -1;
    }

    /*
     * Check if array is subset of another array
     * Example 1:
     * Input: arr1[]= [1,3,4,5,2]
     * arr2[]= [2,4,3,1,7,5,15]
     * Output: arr1[] is a subset of arr2[]
     * 
     * Example 2:
     * Input: arr1[]= [1,3,4,5,2]
     * arr2[]= [4,5,2]
     * Output: arr1[] is not a subset of arr2[]
     * 
     * Example 3:
     * Input: arr1[]= [1,3,4,5,2]
     * arr2[]= [11,12,13,15,16]
     * Output: arr1[] is not a subset of arr2[]
     */
    public static boolean subset_of_another_array(int arr1[], int arr2[]) {
        if (arr1.length > arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                }
            }
            if (!found) {
                return false;
            }
        }
        return true;
    }

    /*
     * Problem Statement: Given an integer N, print all of its prime factors.
     * 
     * Examples
     * Example 1:
     * Input: N=60
     * Output: 2, 3, 5
     * Explanation: All factors/divisors of 60 include: 1, 2, 3, 4, 5, 6, 10, 12,
     * 18, 20, 30, 60. Out of these only 2, 3 and 5 are prime.
     */
    // helper function
    public static boolean primenum(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void prime_factors(int num) {
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                if (primenum(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    /*
     * Problem Statement: Given an integer Print “YES” if it is a strong number else
     * print “NO”.
     * 
     * When the sum of factorial of individual digits of a number is equal to the
     * original number the number is called a strong number.
     * Strong number is also known as Krishnamurthi number/Peterson Number.
     * Examples:
     * 
     * Examples 1:
     * Input: N = 145
     * Output: Yes
     * Explanation: 1! + 4! + 5! = 145. Hence 145 is a strong number.
     */
    // helper function
    public static int fact(int x) {
        if (x == 0) {
            return 1;
        }
        return x * fact(x - 1);
    }

    public static boolean strong_number(int n) {
        int original = n;
        int strong = 0;
        while (n > 0) {
            int temp = n % 10;
            strong += fact(temp);
            n = n / 10;
        }
        if (strong == original) {
            return true;
        }
        return false;
    }

    /*
     * Check if a number is Automorphic Number
     * Example 1:
     * Input Format: N = 76
     * Result: Automorphic Number
     * Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.
     */
    public static int countint(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static boolean Automorphic(int num) {
        int numlen = countint(num);
        int mul = (num * num) % (int) Math.pow(10, numlen);
        if (num == mul) {
            return true;
        }
        return false;
    }

    // lcm
    public static int lcm(int num1, int num2) {
        int lcm = num1 * num2;
        int x = num1 * num2;
        int max = Math.max(num1, num2);
        for (int i = x; i >= max; i--) {
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
            }
        }
        return lcm;
    }

    /*
     * Program to Add two fractions
     * 
     * Problem Statement: Adding two fractional numbers.
     * 
     * Example 1:
     * Input: 3/4 + 1/7
     * Output: 25/28
     * Explanation: Since 3/4 + 1/7 = 25/28
     * 
     * Example 2:
     * Input: 5/2 +1/2
     * Output: 3/1
     * Explanation: Since 5/2 + 1/2 = 3/1
     */
    public static int gcdnum(int a, int b) {
        int result = 0;
        if (a == 0) {
            if (b == 0) {
                return a;
            }
            return b;
        }
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return result;
    }

    public static void add_fractions(int num1, int den1, int num2, int den2) {
        int common_denom = den1 * den2;
        int common_num = num1 * den2 + num2 * den1;

        int gcd = gcd(common_denom, common_num);

        common_denom = common_denom / gcd;
        common_num = common_num / gcd;

        System.out.println(
                "sum of " + num1 + "/" + den2 + " + " + num2 + "/" + den2 + " = " + common_num + "/" + common_denom);
    }

    /*
     * Express given number as Sum of Two Prime Numbers
     * 
     * Problem: Given a number n, express the number as a sum of 2 prime numbers.
     * 
     * Example 1:
     * Input : N = 74
     * Output : True .
     * Explanation: 74 can be expressed as 71 + 3 and both are prime numbers.
     * 
     * Example 2:
     * Input : N = 11
     * Output : False.
     * Explanation: 11 cannot be expressed as sum of two prime numbers.
     */
    public static boolean isitprime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean sum_two_prime(int n) {
        for (int i = 2; i < n; i++) {
            if (isitprime(i) && isitprime(n - i)) {
                return true;
            }
        }
        return false;
    }

    // binary to octotal
    // helper
    // binary to decimal
    public static int binary_to_number(int n) {
        int number = 0;
        int power = 0;
        while (n > 0) {
            int temp = n % 10;
            number = number + (temp * (int) Math.pow(2, power));
            n = n / 10;
            power++;
        }
        return number;
    }

    public static int binary_to_octal(int binary) {
        String octal = "";
        while (binary > 0) {
            int temp = binary % 1000;
            octal = binary_to_number(temp) + octal;
            binary = binary / 1000;
        }
        return Integer.parseInt(octal);
    }

    // decimal to octal
    public static int decimal_to_octal(int decimal) {
        int octal = 0;
        int power = 0;
        while (decimal > 0) {
            int temp = decimal % 8;
            octal = octal + (temp * (int) Math.pow(10, power));
            decimal = decimal / 8;
            power++;
        }
        return octal;
    }

    // decimal to hexadecimal
    //////////////// we can change only the values of dividend like 16 or 8 or 2
    public static int decimal_to_hexadecimal(int decimal) {
        int hexa = 0;
        int power = 0;
        while (decimal > 0) {
            int temp = decimal % 16;
            hexa = hexa + (temp * (int) Math.pow(10, power));
            decimal = decimal / 16;
            power++;
        }
        return hexa;
    }

    // octal to number
    //////////////////// here we will only change power base
    public static int octal_to_number(int n) {
        int number = 0;
        int power = 0;
        while (n > 0) {
            int temp = n % 10;
            number = number + (temp * (int) Math.pow(8, power));
            n = n / 10;
            power++;
        }
        return number;
    }

    // you are given a sorted array consisting of only integers where every element
    // appears exactly twice, except for one element which appears exactly once.
    // Input: array = [1,1,2,3,3,4,4,8,8]
    // Output: 2
    // return the element that does not repeat
    public static int nonrepet(int arr[]) {
        for (int i = 0; i < arr.length; i = i + 2) {
            if (i == arr.length - 1) {
                return arr[i];
            }
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int accenture(int n) {
        int arr[] = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n - 1] * arr[n - 1] + arr[n - 2] * arr[n - 2];
    }

    //
    public static int compress(char[] chars) {
        int idx = 0;
        if (chars.length == 1) {
            return 1;
        }

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == ch) {
                count++;
                i++;
            }

            chars[idx++] = ch;
            chars[idx++] = (char) count;

        }

        return idx;
    }



        public static  void moveZeroes(int[] nums) {
            int[] temp = new int[nums.length];
            int
            for(int i=0; i<nums.length;i++){
                if(nums[i]!=0){
                    temp[i] = nums[i];
                }
            }
            for(int i=0; i<nums.length; i++){
                nums[i]=temp[i];
            }
        }
    

    public static void main(String[] args) {

        int[] arr =  {0,1,2,0,11,12};
        moveZeroes(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        // char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c','c'};
        // System.out.println(compress(chars));
        // System.out.println(accenture(4));

        // fibo(10);
        // prime(9);
        // System.out.println(primenumber(10));
        // palindrome(1210);
        // System.out.println(factorial(15));
        // System.out.println(armstrong(153));
        // randomnumber();
        // pattern();
        // System.out.println(automorphic(100));
        // System.out.println(peterson(145));
        // System.out.println(nthprime(3));
        // alternateprime(20);
        // System.out.println(sqareroot(9));
        // swapbitwise(1, 2);
        // System.out.println(gcd(12,8));
        // System.out.println(perfectsqare(4));
        // int arr[] = {1,2,3,4,5,6,7};
        // System.out.println(frequancy(arr, 3));
        // right_reverse(arr, 1);
        // left_reverse(arr, 2);
        // int a[] = { 23, 67, 2, 7, 1, 3, 2, 7, 7, 7, 7, 7, 9, 9, 2, 5, 54, 100, 9,
        // 100, 3 };
        // sortass(a);
        // sortdes(a);
        // removeduplicate(a);
        // printduplicate(a);
        // matrixs();
        // lowertrianglematrices();
        // uppertrianglematrices();
        // sumof_row_col();
        // odd_even_frequancy();
        // transpose();
        // System.out.println(checkidentitymatrix());
        // String r = "my name is nithin reddy";
        // String s = "Iam Nithin Reddy Nithin";
        // char a[] = { 'a', 'b', 'c', 'd' };
        // String c="abaa";
        // System.out.println(countchar(s));
        // System.out.println(countpunch(s));
        // System.out.println(anagram(s, r));
        // dividestring(a, 4);
        // subset(a);
        // System.out.println(remove_whitespace(r));
        // System.out.println(changecase(r));
        // System.out.println(palindrome(c));
        // max_min_frequancy(s);
        // word_rotate(a, 0, 3);
        // System.out.println(word_reverse(s));
        // System.out.println(substring(r, 0, 2));
        // System.out.println(rotate_each_word(s));
        // min_max_words_in_sentence(r);
        // duplicatechar("Great rresponsibility");
        // duplicatewords("Big black bug bit a big black dog on his big black nose");
        // highest_repeting_word("Big black bug bit a big black black black black black
        // black big big dog on his big black nose");
        // System.out.println(total_words("Big black bug bit a big black black black
        // black"));
        // swap_strings("abcd", "edgh");
        // String z = "aa abba abcd abbba";
        // max_min_palindrme(z);

        // int arr[] = { 9, 8, 7, 6, 66, 5, 4, 3, 2, 1 };
        // System.out.println(binarysearch(arr, 2));
        // bubblesort(arr);
        // selection_sort(arr);
        // insertionsort(arr);
        // pattern1(5);
        // pattern2(4);
        // code();
        // System.out.println(code2(1));
        // code3(8);
        // pattern3(10);
        // pattern4(8);
        // spiralmini(5);
        // spiralmini_modified(5);
        // spiralmatrix(10);
        // int[][] matrix = { { 1, 2, 3, 4 },
        // { 5, 6, 7, 8 },
        // { 9, 10, 11, 12 },
        // { 13, 14, 15, 16 } };
        // print_spiral_matrix(matrix);
        // pattern5(10);
        // alp_pattern(5);
        // alp_pattern2(6);
        // pattern6(10);
        // pattern7(5);
        // pattern8(5);
        // linkedlist
        // add_at_beg(1);
        // add_at_beg(2);
        // add_at_beg(2);
        // add_at_beg(2);
        // add_at_beg(1);
        // add_at_end(55);
        // add_at_end(66);
        // add_at_end(7);
        // add_at_end(23);
        // add_at_end(77);
        // add_at_end(777);
        // add_at_idx(2, 69);
        // printll();
        // System.out.println("removed at beg : "+remove_at_beg());
        // printll();
        // System.out.println("removed at end : "+remove_at_end());
        // printll();
        // System.out.println("number found ar index : "+ searchll(5));
        // Node middlenode = mid(head);
        // System.out.println("mid value : " + middlenode.data);
        // System.out.println("mid value : "+mida()) ;
        // reversell();
        // printll();
        // System.out.println(palindrome());
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // System.out.println(isloop());
        // removeloop();
        // printll();
        // min_max();
        // System.out.println(palindrome_in_range(0, 20));
        // System.out.println(tcs1(98));
        // int arrr[] = { 5, 2, 3 };
        // System.out.println(tcs11(arrr, 1));
        // System.out.println(tcs2(6));
        // tcs22(arrr);
        // System.out.println(tcs33(arrr));
        // int n =7;
        // String number = (n==2)? "2":(n==3)? "3" : (n==4)?"4": "0";
        // System.out.println(number);
        // System.out.println(tcs10("ahbcd##*gv#*NGF#JH*#HHG#*"));
        // int arb[] = {7, 4, 8, 2, 9};
        // System.out.println(tcs11(arb));
        // tcs12(3, 3);
        // System.out.println("Maximum number of guests on cruise at an instance :
        // "+tcs13(5)) ;
        // tcs14();
        // int breath[] = {95,92,95,92,90,92,90,92,90 };
        // tcs15(breath);
        // char s = 'a';
        // int i;
        // i = s+1;
        // System.out.println((char)i);
        // System.out.println(tcs16("iam12 nithin reddy", 1)) ;
        // System.out.println(tcs17("ni", "haw"));
        // System.out.println(tcs18(20, 2, 3, 13, 15));
        // System.out.println(binary(9));
        // System.out.println(number(111));
        // int asa[] = { 1, 2, 3, 4, 5 };
        // a_2ndmax_2ndmin(asa);
        // System.out.println(Arrays.toString(reversearr(asa)));
        // int aarr [] = { 3,1,5,7,12,98,4,1};
        // sorta_d(aarr);
        // int a[]={1,2,2,3};
        // System.out.println(a[0]+", "+a[1]+", "+a[2]);
        // System.out.println(a);
        // abcd(a);
        // System.out.println(a[0]+", "+a[1]+", "+a[2]);
        // System.out.println(a);
        // System.out.println(median(a));
        // int a[]={1,1,2,2,3,3,5};
        // int idx = remove_duplicates(a);
        // for(int i=0; i<idx; i++){
        // System.out.print(a[i]+" ");
        // }
        // int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        // int temp[] = alternateswap(a, 4);
        // for(int i=0; i<temp.length; i++){
        // System.out.print(temp[i]+" ");
        // }
        // int a[] = {1,2,3,1,2};
        // repeatelements(a);
        // non_repeatelements(a);
        // int arr[] = {1,2,4,1,3,2};
        // non_repeating(arr);
        // int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        // Symmetric_pair(arr);
        // int arr[] = {1,2,3,4,5,0};
        // System.out.println(maxsubarr_product(arr));
        // int arr[] = { -1, 1, 5, 8, 15, 8, 25, 9 };
        // ranks(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println(mock("processed", "esd"));
        // int arr[] = {1,-1,4};
        // System.out.println(Equilibrium_index(arr));
        // int arr1[]= {1,3,4,5,2};
        // int arr2[]= {4,5,2};
        // System.out.println(subset_of_another_array(arr1, arr2));
        // prime_factors(35);
        // System.out.println(strong_number(142));
        // System.out.println(countint(123));
        // System.out.println(Automorphic(75));
        // System.out.println(lcm(20, 25));
        // System.out.println(gcd(5, 11));
        // add_fractions(3, 4, 1, 7);
        // System.out.println(sum_two_prime(74));
        // System.out.println(binary(3)) ;
        // System.out.println(dec_to_binary(3));
        // System.out.println(binary_to_octal(11111));
        // System.out.println(decimal_to_octal(45));
        // System.out.println(decimal_to_hexadecimal(17));
        // System.out.println(octal_to_number(17));
        int array[] = { 1, 1, 2, 2, 3, 3, 4, 4, 8 };

        // System.out.println(nonrepet(array));

    }
}
