import yandex_handbook_basics_algs.pph_3_1.Factorial;
//import yandex_handbook_basics_algs.pph_3_2.ReservationMeetingRoom;
import yandex_handbook_basics_algs.pph_3_2.ReservationMeetingRoom;
import yandex_handbook_basics_algs.pph_3_2.Time;
import yandex_handbook_basics_algs.pph_3_3.Rocks;
import yandex_handbook_basics_algs.pph_3_3.RocksStatisticTable;
//import yandex_handbook_basics_algs.pph_3_1.Premutations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] numbers = in.nextLine().split(" ");
        int n = Integer.parseInt(numbers[0]) % 3;
        int m = Integer.parseInt(numbers[1]) % 3;
        RocksStatisticTable statisticTable = new RocksStatisticTable();

        if(Rocks.winOrLoseNewRules(n, m, statisticTable.getWinLoseStat())){
            System.out.println("Win");
        } else System.out.println("Lose");
    }
}

/* public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amountOfClients = in.nextInt();
        ArrayList<Main.Time> clients = new ArrayList<>(amountOfClients);
        int beginning = 1;
        int end = 2;

        String[] numbers = in.nextLine().split(" ");


        for(int i = 0; i < amountOfClients; i++){
            beginning = in.nextInt();
            end = in.nextInt();
            Time time = new Time(beginning, end);
            clients.add(time);
        }
        for(int i = 0; i < amountOfClients; i++){
            System.out.println(clients.get(i).getEnd());
        }
        Collections.sort(clients);

        for(int i = 0; i < amountOfClients; i++){
            System.out.println(clients.get(i).getEnd());
        }
        int result = Main.countAmountOfClients(0, clients);
        System.out.println(result);
    }

    public static int countAmountOfClients(int index, ArrayList<Main.Time> clients)
    {
        int result = clients.size();
        if(result <= index) return result;

        int minBeginning = clients.get(index).getBeginning();
        int minEnd = clients.get(index).getEnd();

        for(int i = index; i < clients.size(); i++){
            if(i != index){
                int currentBeginning = clients.get(i).getBeginning();
                int currentEnd = clients.get(i).getEnd();

                if(((currentBeginning >= minBeginning) && (currentBeginning <= minEnd)) ||
                        ((currentEnd >= minBeginning) && (currentEnd <= minEnd)) || (currentBeginning < minBeginning && currentEnd > minEnd)){
                    clients.remove(i);
                    i--;
                }
            }
        }
        return countAmountOfClients(index + 1, clients);
    }
    public static class Time implements Comparable<Main.Time> {
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
}


*/