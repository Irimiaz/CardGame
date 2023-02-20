package Cards.Enviroment;

import Cards.DeleteCard;
import Cards.Minions.minion;

import java.util.ArrayList;

public class Firestorm extends enviroment{

    public Firestorm(int mana, String description, ArrayList<String> colors, String name) {
        super(mana, description, colors, name);
    }

    @Override
    public void special(ArrayList<minion> Target, ArrayList<minion> Destination) {
        int i = 0;
        ArrayList<Integer> poz = new ArrayList<Integer>();
        for (minion card : Target) {
            int targetHealth = card.getHealth();
            targetHealth = targetHealth - 1;
            card.setHealth(targetHealth);
            }
        DeleteCard.delete(Target);
    }
}
