
import java.util.Scanner;

public class P {
    // 1111111111111111111111111111111111111111111111111111111111111111111111111111111111
    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of " + n + " = " + fact);
    }

    // 2222222222222222222222222222222222222222222222222222222222222222222222222222
    public static void fibonacci() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(first + ", ");
            int next = first + second;
            second = first;
            first = next;
        }
    }

    // 33333333333333333333333333333333333333333333333333333333333333333333333
    public static void gdc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1");
        int n1 = sc.nextInt();
        System.out.println("enter number2");
        int n2 = sc.nextInt();
        int gdc = 1;
        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0) {
                gdc = i;
            }
        }
        System.out.println("GDC of TWO numbbers is " + gdc);
    }

    // 4444444444444444444444444444444444444444
    public static void lcm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1");
        int n1 = sc.nextInt();
        System.out.println("enter number2");
        int n2 = sc.nextInt();
        int lcm = (n1 > n2) ? n1 : n2;
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.println("lcm of two numbers is " + lcm);
                break;
            }
            lcm++;
        }
    }

    // 55555555555555555555555555555555555555555555
    public static void reversenum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        System.out.println("reverse number " + reverse);
    }

    // 6666666666666666666666666666666666666666666
    public static void power() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base");
        int base = sc.nextInt();
        System.out.println("enter power");
        int power = sc.nextInt();

        long result = 1;
        while (power != 0) {
            result = result * base;
            --power;
        }
        System.out.println("the result is " + result);
    }

    // 77777777777777777777777777777777777777777777777777777777777777777
    public static void palindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int m = n;
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        if (reverse == m) {
            System.out.println("palindrome");
        } else {
            System.out.println("non palindrome");
        }
    }

    // 88888888888888888888888888888888888888888888888888888888888888888
    public static void prime() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        boolean result = false;
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                result = true;
                break;
            }
        }
        if (!result) {
            System.out.println("prime");
        } else {
            System.out.println("non prime");
        }
    }

    // 9999999999999999999999999999999999999999999999999999999999999
    public static void armstrong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        double org = n, result = 0;
        while (n != 0) {
            double rem = n % 10;
            // result = Math.pow(rem, 3);
            result += rem * rem * rem;
            n = n / 10;
        }
        if (result == org) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

    // 1000000000000000000000000000000000000000000000000000000000000000000000000000000000000

    public static void tolowercase() {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter string");
        // String n = sc.next();

        // for(int i = 0; i<n.length(); i++){
        // if(c)
        // }
       

    }

    public static void main(String[] args) {
        // factorial();
        // fibonacci();
        // gdc();
        // lcm();
        // reversenum();
        // power();
        // palindrome();
        // prime();
        // armstrong();
        tolowercase();
    }

}