import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!!!");
        Games g1 = new Games("XBOX", "Sonic");
        Games g2 = new Games("Switch", "Animal Crossin");
        Games g3 = new Games("Nintendo", "Mario");
        Games g4 = new Games("PS2", "Street Fighter");
        Games g5 = new Games("Tablet", "Dance");

        ArrayList<Games>myGameList = new ArrayList<>();
        myGameList.add(g1);
        myGameList.add(g2);
        myGameList.add(g3);
        myGameList.add(g4);
        myGameList.add(g5);

        Collections.sort(myGameList);

        for(Games a : myGameList){
            System.out.println(a);
        }

    }
}