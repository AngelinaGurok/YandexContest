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
        winLoseStat.put(new Rocks(2, 2), false);
    }
    public Map<Rocks, Boolean> getWinLoseStat() {
        return winLoseStat;
    }
}
