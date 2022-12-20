import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> divisionOf52 = new ArrayList<>();
        divisionOf52.add(1);
        divisionOf52.add(2);
        divisionOf52.add(4);
        divisionOf52.add(13);
        divisionOf52.add(26);

        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);

        randomNumbers.addAll(divisionOf52);

        System.out.println(randomNumbers.toString());

        // ho cercato un ciclo for per assegnare due variabili e togliere il numero uguale
        for(int i = 0; i < randomNumbers.size(); i++){
            for(int j = i + 1; j < randomNumbers.size();j++){
                if(randomNumbers.get(i).equals(randomNumbers.get(j))){
                    randomNumbers.remove(j);
                    j--;
                }
            }
        }
        System.out.println(randomNumbers.toString());

        Collections.sort(randomNumbers);
        System.out.println(randomNumbers);










    }
}