package yandex_handbook_basics_algs.pph_3_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Rocks {
    Integer n;
    Integer m;

    Rocks(int n, int m){
        this.n = n;
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public static boolean winOrLose(int n, int m){
        if(n % 2 == 0 && n % 2 == 0){
            return false;
        }
        return true;
    }

    public static boolean winOrLoseNewRules(int n, int m, Map<Rocks, Boolean> winLoseStatistic){
        return winLoseStatistic.get(new Rocks(n, m));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Rocks rocks = (Rocks) obj;

        return Objects.equals(n, rocks.n) && Objects.equals(m, rocks.m);
    }

    @Override
    public int hashCode() {
        return Objects.hash(n, m);
    }
}
