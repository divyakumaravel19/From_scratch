public class Add_digits {
    public int addDigits(int num) {
        int sum=0;
        while(num>0){
            int dig=num%10;
            num=num/10;
            sum=sum+dig;
        if(num==0&&sum>9){
            num=sum;
            sum=0;
        }
    }
    return sum;
}
}
