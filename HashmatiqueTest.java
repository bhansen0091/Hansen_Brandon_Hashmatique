import java.util.HashMap;

/**
 * HashmatiqueTest
 */
public class HashmatiqueTest {

    public static void main(String[] args) {
        Hashmatique hm = new Hashmatique();
        HashMap newHash =  hm.makeHM();

        System.out.println(hm.getByTitle(newHash, "Song 2"));

        hm.printAll(newHash);
    }
}