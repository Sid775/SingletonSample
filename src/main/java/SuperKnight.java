/**
 * Created by Sid775 on 31.03.2017.
 */
public final class SuperKnight {

    private static SuperKnight knight;
    public String feat;

    private SuperKnight(String feat) {
        this.feat = feat;
    }

    public static SuperKnight getKnight(String feat){
        if (knight == null){
            synchronized (SuperKnight.class){
                if (knight == null){
                    knight = new SuperKnight(feat);
                }
            }
        }
        return knight;
    }
}
