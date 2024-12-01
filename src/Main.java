import yandex_handbook_basics_algs.pph_3_1.Factorial;
//import yandex_handbook_basics_algs.pph_3_2.ReservationMeetingRoom;
import yandex_handbook_basics_algs.pph_3_2.ReservationMeetingRoom;
import yandex_handbook_basics_algs.pph_3_2.Time;
//import yandex_handbook_basics_algs.pph_3_1.Premutations;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amountOfClients = in.nextInt();
        ArrayList<Main.Time> clients = new ArrayList<>(amountOfClients);
        int beginning = 1;
        int end = 2;
        /*for(int i = 0; i < amountOfClients; i++){
            beginning = in.nextInt();
            end = in.nextInt();
            Time time = new Time(beginning, end);
            clients.add(time);
        }*/
        for(int i = 0; i < amountOfClients; i++){
            Time time = new Time(beginning, end);
            clients.add(time);
            beginning += 1;
            end += 1;
        }
        int result = Main.countAmountOfClients(0, clients);
        System.out.println(result);
    }

    static int findMinimumEnd(int index, ArrayList<Main.Time> clients){
        int minEnd = clients.get(index).getEnd();
        int indexOfMin = index;
        for(int i = 1; i < clients.size(); i++){
            if(minEnd > clients.get(i).getEnd()){
                indexOfMin = i;
                minEnd = clients.get(i).getEnd();
            }
        }
        return indexOfMin;
    }
    public static int countAmountOfClients(int index, ArrayList<Main.Time> clients)
    {
        int result = clients.size();
        if(result <= index) return result;
        int indexOfMinEnd = Main.findMinimumEnd(index, clients);

        int minBeginning = clients.get(indexOfMinEnd).getBeginning();
        int minEnd = clients.get(indexOfMinEnd).getEnd();

        for(int i = index; i < clients.size(); i++){
            if(i != indexOfMinEnd){
                int currentBeginning = clients.get(i).getBeginning();
                int currentEnd = clients.get(i).getEnd();

                if(((currentBeginning >= minBeginning) && (currentBeginning <= minEnd)) ||
                        ((currentEnd >= minBeginning) && (currentEnd <= minEnd))){
                    clients.remove(i);
                    i--;
                }
            }
        }
        return countAmountOfClients(indexOfMinEnd + 1, clients);
    }
    public static class Time {
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
    }
}



