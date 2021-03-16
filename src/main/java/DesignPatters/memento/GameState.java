package DesignPatters.memento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



//        The Memento pattern describes how to manage the saved states of an object.
//        Imagine a game(e.g.running on a console)that has auto-save functionality
//        in certain places.In this game,you move your character around the world.
//        When such a save occurs,the game"must know",for example,what equipment your
//        character currently has,which tasks in the game have been completed and which
//        are ongoing,what places have been visited,to correctly display the world map.


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameState {


    private Integer health;
    private Integer mana;
    private List<String> items;

    @Override
    public String toString() {
        return "GameState{" +
                "health=" + health +
                ", mana=" + mana +
                ", items=" + items +
                "}\n";
    }

    public void heal() {
        health = 100;
    }

    public void takeDamage(final int damage) {
        health -= damage;
    }

    public void addItem(final String item) {
        items.add(item);
    }

    public void loseAllItems() {
        items.clear();
    }

    public void restoreFromSnapshot(final GameStateSnapshot snapshot) {
        health = snapshot.getHealth();
        mana = snapshot.getMana();
        items = List.copyOf(snapshot.getItems());
    }
}
