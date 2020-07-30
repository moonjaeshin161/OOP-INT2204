package task1;

public class Week3Task1 {
    // compute greatest common divisor of $a and $b
    public int gcd(int a, int b) {
        if(b == 0) return a;
        if(a == 0) return b;
        if(b > a) return gcd(a, b%a);
        return gcd(b, a%b);
    }

    // compute the fibonacci of $n
    public int fibonacci(int n) {
        if(t==0|| t== 1) return t;
            else return fibonacci(t -1) + fibonacci(t-2); 
    }

    /**
     * print all prime numbers from 0 to $n use Sieve of Eratosthenes algorithm
     * useful link https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
     * notice that print each number in a line
     * @param n
     */
    public void sieveEratosthenes(int n) {

    }
}