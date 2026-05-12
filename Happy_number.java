public class Happy_number{
    public boolean isHappy(int n) {
        int sum=0;
        int dig=0;
    while(n!=1&&n!=4){
        sum=0;
        while(n>0){
            dig=n%10;
            sum=sum+dig*dig;
            n=n/10;
        }
            n=sum;
        }
        if(n==1)
        return true;
        else
        return false;
    }
}