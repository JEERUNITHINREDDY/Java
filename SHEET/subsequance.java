class subsequance {

    public static void subSequences(String str, String sub, int i) {
        if (i == str.length()) {
            System.out.println(sub);
            return;
        }

        subSequences(str, sub + str.charAt(i), i + 1);
        subSequences(str, sub, i + 1);
    }

    public static void main(String[] args) {
        subSequences("abcdef", "", 0);
    }
}
