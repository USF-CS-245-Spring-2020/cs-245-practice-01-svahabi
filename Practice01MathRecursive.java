/*
The following class may reference geeks for geeks, stackoverflow, and other online sources for improvement
 */
public class Practice01MathRecursive implements Practice01Math{
    public int fact(int n) {
        if(n<0){
            throw new IllegalArgumentException("Enter a number larger than 0.");
        }
        else if (n <= 1){
            return 1;
        }
        else {
            return  n*fact(n - 1);
        }


    }
    public int fib(int n) {
        if(n<0){
            throw new IllegalArgumentException("Enter a number larger than 0.");
        }
        else if (n == 0) {
            return 0;
        } else if(n==1) {
            return 1;
        }
        else{

            return fib(n-1) + fib(n - 2);

        }
    }


}
