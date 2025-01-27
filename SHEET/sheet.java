import java.util.Arrays;
import java.util.*;

class sheet {
    public static int[] reverse(int arr[]) {
        int i = 0;
        while (i < arr.length / 2) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
            i++;
        }
        return arr;
    }

    // Repeat and Missing Number Array
    // https://www.interviewbit.com/problems/repeat-and-missing-number-array/
    // solved in interview bit
    public int[] repeatedNumber(final int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        int temp[] = new int[max + 1];
        int result[] = new int[2];
        for (int i = 0; i < A.length; i++) {
            temp[A[i]]++;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 2) {
                result[0] = i;
            }
            if (temp[i] == 0) {
                result[1] = i;
            }
        }
        return result;
    }

    // Find minimum number of merge operations to make an array palindrome
    public static int maxmerge(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            if (arr[low] == arr[high]) {
                high--;
                low++;
            } else {
                return arr.length - 1 - (2 * low);
            }
        }
        return 0;
    }

    // number reverse
    public static int reversenum(int num) {
        int result = 0;
        while (num > 0) {
            int temp = num % 10;
            result = result * 10 + temp;
            num = num / 10;
        }
        return result;
    }

    // Arrange given numbers to form the biggest number
    // public static String bignum(int[] arr) {
    // int count = 0;
    // int temp[] = new int[arr.length];
    // boolean mark[] = new boolean[arr.length];
    // StringBuilder result = new StringBuilder("");

    // while (count < arr.length) {
    // int firstplace = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (reversenum(arr[i]) % 10 > firstplace) {
    // firstplace = arr[i];
    // }
    // }
    // result.append(firstplace);

    // }
    // int idx = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] != firstplace) {
    // temp[idx++] = arr[i];
    // }
    // }
    // Arrays.sort(temp);
    // result.append(firstplace);
    // for (int i = temp.length - 1; i >= 0; i--) {
    // result.append(temp[i]);
    // }
    // return result.toString();
    // }

    // https://www.geeksforgeeks.org/print-all-possible-combinations-of-r-elements-in-a-given-array-of-size-n/
    public static void allcombinnations(int[] arr, int r) {
        for (int i = 0; i < arr.length; i++) {

        }
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

    public static int[] techm(int n) {
        int[] result = new int[n];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }

    // Count Non-repeated Character in String
    public static int nonrep(String str) {
        char[] c = str.toCharArray();
        char[] result = new char[c.length];
        boolean[] temp = new boolean[c.length];
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j] && c[i] != '0') {
                    c[j] = '0';
                    temp[i] = true;
                    temp[j] = true;
                }
            }
        }
        int idx = 0;
        for (int i = 0; i < temp.length; i++) {
            if (!temp[i]) {
                result[idx++] = c[i];
            }
        }
        return idx;
    }

    public static int fct(int n) {
        if (n < 1) {
            return 1;
        }
        return n * fct(n - 1);
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    // Find if an expression has duplicate parenthesis or not
    public static boolean duppara(String s) {
        Stack<Character> stk = new Stack<>();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ')') {
                char top = stk.peek();
                // stk.pop();
                int insideelements = 0;
                while (top != '(') {
                    insideelements++;
                    top = stk.peek();
                    stk.pop();
                }
                if (insideelements < 1) {
                    return true;
                }
            } else {
                stk.push(ch[i]);
            }
        }
        return false;
    }

    // Count natural numbers whose all permutation are greater than that number
    public static int permgrat(int n) {
        int result = 0;
        Stack<Integer> stk = new Stack<>();
        for (int i = 1; i <= 9; i++) {
            if (i <= n) {
                stk.push(i);
                result++;
            }
            while (!stk.empty()) {
                int tp = stk.pop();
                for (int j = tp % 10; j <= 9; j++) {
                    int temp = tp * 10 + j;
                    if (temp <= n) {
                        stk.push(temp);
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> main = new ArrayList<>();

        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            List<Integer> sub = new ArrayList<>();
            int j;
            for (j = i + 1; j < s.length(); j++) {
                char ch2 = s.charAt(j);
                if (ch == ch2) {
                    continue;
                } else {
                    break;
                }
            }
            if (j - i >= 3) {
                sub.add(i);
                sub.add(j);
                main.add(sub);
            }
        }
        return main;
    }

    public static void p(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            System.out.print(i * i + " ");
        }
    }

    public static void main(String[] args) {
        p(5);
        // System.out.println(largeGroupPositions("abbxxxxzzy"));
        // System.out.println(permgrat(100));
        // System.out.println(duppara("((a+b)+((c+d)))"));
        // System.out.println(sum(5));
        // System.out.println(nonrep("alpaadida"));
        // int temp = 'A' - S.charAt(i);
        // int arr[] = { 3, 30, 34, 5, 9 };
        // int[] result2 = techm(10);
        // for (int i = 0; i < result2.length; i++) {
        // System.out.print(result2[i] + " ");
        // }
        // reverse(arr);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println(arr[i]);
        // }
        // System.out.println(maxmerge(arr));
        // System.out.println(reversenum(1));
        // System.out.println(bignum(arr));
        // System.out.println(anagram("rat", "cat"));
        // String s = "";
        // System.out.println(s.length());
    }
}