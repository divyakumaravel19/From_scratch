class Reverse_Integer {
    public int reverse(int x) {
        int dig = 0;
        int rev = 0;
        while (x != 0) {
            dig = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
                return 0;
            rev = rev * 10 + dig;
            x = x / 10;
        }
        return rev;
    }
}