/**
 * Created by Sid775 on 31.03.2017.
 */
public class KingdomOne implements Runnable {

    public void run() {
        SuperKnight knight = SuperKnight.getKnight("save princess");
        System.out.println("Knight was " + knight.feat);
    }
}
