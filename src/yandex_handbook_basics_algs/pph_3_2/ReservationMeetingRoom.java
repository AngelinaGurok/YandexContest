package yandex_handbook_basics_algs.pph_3_2;

import java.util.ArrayList;

public class ReservationMeetingRoom {
    static int findMinimumEnd(int index, ArrayList<Time> clients){
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
    public static int countAmountOfClients(int index, ArrayList<Time> clients)
    {
        int result = clients.size();
        if(result <= index) return result;
        int indexOfMinEnd = ReservationMeetingRoom.findMinimumEnd(index, clients);

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

}


