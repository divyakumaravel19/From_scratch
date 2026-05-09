class Palindrome_number {
    public boolean isPalindrome(int x) {
        int temp = x;
        if (x < 0)
            return false;
        int r = 0;
        while (x > 0) {
            r = r * 10 + x % 10;
            x = x / 10;
        }
        return temp == r;
    }
}