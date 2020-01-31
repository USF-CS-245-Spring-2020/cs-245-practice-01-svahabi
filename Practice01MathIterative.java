/*
The following class may reference geeks for geeks, stackoverflow, and other online sources for improvement
 */
public class Practice01MathIterative implements Practice01Math {
    public int fact(int n){
        if(n<0){
            throw new IllegalArgumentException("Enter a number larger than 0.");
        }
        int sum = 1;
        for(int i = 1; i <= n; i++){
            sum*=i;
        }
        return sum;
    }
    public  int fib(int n) {
        int fib = 1;
        int prev1 = 1;
        int prev2 = 1;
        if(n<0){
            throw new IllegalArgumentException("Enter a number larger than 0.");
        }
        else if (n <= 1) {
            return n;
        }
        else {
            for (int i = 2; i < n; i++) {
                prev2=fib;
                fib+=prev1;
                prev1=prev2;
            }
            return fib;
        }
    }



}
