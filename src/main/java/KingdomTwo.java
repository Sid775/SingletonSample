/**
 * Created by Sid775 on 31.03.2017.
 */
public class KingdomTwo implements Runnable {
    public void run() {
        SuperKnight knight = SuperKnight.getKnight("kill dragon");
        System.out.println("Knight was " + knight.feat);
    }
}
