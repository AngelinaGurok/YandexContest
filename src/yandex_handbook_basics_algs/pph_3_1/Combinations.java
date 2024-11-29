package yandex_handbook_basics_algs.pph_3_1;

public class Combinations {
    public static int combinations(int n, int k){
        if(n < k){
            return 0;
        }
        return (Factorial.factorial(n)/(Factorial.factorial(n - k) * Factorial.factorial(k)));
    }
}
