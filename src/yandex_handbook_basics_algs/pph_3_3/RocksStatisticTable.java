package yandex_handbook_basics_algs.pph_3_3;

import java.util.HashMap;
import java.util.Map;

public class RocksStatisticTable {
    Map<Rocks, Boolean> winLoseStat;
    public RocksStatisticTable(){
        winLoseStat = new HashMap<>();
        winLoseStat.put(new Rocks(0, 0), false);
        winLoseStat.put(new Rocks(1, 0), true);
        winLoseStat.put(new Rocks(1, 1), false);
        winLoseStat.put(new Rocks(0, 1), true);
        winLoseStat.put(new Rocks(2, 0), true);
        winLoseStat.put(new Rocks(0, 2), true);
        winLoseStat.put(new Rocks(2, 1), true);
        winLoseStat.put(new Rocks(1, 2), true);
    }
    public void fulfillTheRest(int n, int m){
        if(n < 3 && m < 3) {
            winLoseStat.put(new Rocks(2, 2), false);
            return;
        }
        for(int i = 3; i <= n; i++){
            for(int j = 0; j <= 1; j++){
                Rocks r1 = new Rocks(i - 1, j);
                if(winLoseStat.get(r1) == true &&
                        winLoseStat.get(new Rocks(i - 2, j)) == true){
                    winLoseStat.put(new Rocks(i, j), false);
                } else winLoseStat.put(new Rocks(i, j), true);
            }
        }

        for(int j = 3; j <= m; j++){
            for(int i = 0; i <= 1; i++){
                if(winLoseStat.get(new Rocks(i, j - 1)) == true &&
                        winLoseStat.get(new Rocks( i, j - 2)) == true){
                    winLoseStat.put(new Rocks(i, j), false);
                } else winLoseStat.put(new Rocks(i, j), true);
            }
        }

        for(int i = 2; i <= n; i++){
            for(int j = 2; j <= m; j++){
                if(winLoseStat.get(new Rocks(i - 1, j)) == true &&
                        winLoseStat.get(new Rocks(i, j -1)) == true &&
                        winLoseStat.get(new Rocks(i - 2, j)) == true &&
                        winLoseStat.get(new Rocks(i, j - 2)) == true &&
                        winLoseStat.get(new Rocks(i - 2, j - 1)) == true &&
                        winLoseStat.get(new Rocks(i - 1, j -2)) == true){
                    winLoseStat.put(new Rocks(i, j), false);
                } else winLoseStat.put(new Rocks(i, j), true);
            }
        }
        return;
    }

    public Map<Rocks, Boolean> getWinLoseStat() {
        return winLoseStat;
    }
}
