package yandex_handbook_basics_algs.pph_3_1;

public class Factorial {
    public static int factorial(int n){
        int result = 1;
        if(n == 1 || n == 0){
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }
}
