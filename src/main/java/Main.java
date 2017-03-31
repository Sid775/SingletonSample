/**
 * Created by Sid775 on 31.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        Thread princessKingdom = new Thread(new KingdomOne());
        Thread dragonKingdom = new Thread(new KingdomTwo());
        princessKingdom.start();
        dragonKingdom.start();
    }
}
