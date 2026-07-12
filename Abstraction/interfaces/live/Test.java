package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxaphone;

public class Test {

    public static void main(String[] args) {

        Veena v = new Veena();
        v.play();

        Saxaphone s = new Saxaphone();
        s.play();

        Playable p;

        p = new Veena();
        p.play();

        p = new Saxaphone();
        p.play();
    }
}