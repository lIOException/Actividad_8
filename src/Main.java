import java.util.List;

public class Main {
    public static void main(String[] args) {
        Deck d = new Deck();
        d.addCards();
        d.shuffle();
        d.head();
        d.pick();
        d.hand();

    }
}
