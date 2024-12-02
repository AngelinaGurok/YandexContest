package yandex_handbook_basics_algs.pph_3_2;

public class Time implements Comparable<Time>{
    int beginning;
    int end;
    public Time(int beginning, int end){
        this.beginning = beginning;
        this.end = end;
    }

    public int getBeginning() {
        return beginning;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public int compareTo(Time o) {
        return this.getEnd() - o.getEnd();
    }
}

