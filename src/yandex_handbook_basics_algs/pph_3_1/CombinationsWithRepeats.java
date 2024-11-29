package yandex_handbook_basics_algs.pph_3_1;

public class CombinationsWithRepeats {
    public static int combinationsWithRepeats(int n, int k){
        return (Factorial.factorial(n + k - 1)/(Factorial.factorial(n - 1) * Factorial.factorial(k)));
    }
}
