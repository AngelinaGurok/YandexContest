import yandex_handbook_basics_algs.pph_3_1.Factorial;
//import yandex_handbook_basics_algs.pph_3_1.Premutations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        //int result  = Factorial.factorial(n);
        //int result = Main.combinations(n, k);
        int result = Main.combinationsWithRepeats(n, k);
        System.out.println(result);
    }

    public static int factorial(int n){
        int result = 1;
        if(n == 1 || n == 0){
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }
    public static int combinations(int n, int k){
        if(n < k){
            return 0;
        }
        return (Main.factorial(n)/(Main.factorial(n - k) * Main.factorial(k)));
    }

    public static int combinationsWithRepeats(int n, int k){
        return (Factorial.factorial(n + k - 1)/(Factorial.factorial(n - 1) * Factorial.factorial(k)));
    }

}



