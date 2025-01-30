import java.io.Serializable;

public class Samosa implements Serializable {
    private static Samosa samosa;

    //Constructor
    private Samosa() {
    }
    // Lazy way of creating single object
    public static Samosa getSamosa() {
        if(samosa == null){
            synchronized (Samosa.class){
                if(samosa == null){
                    samosa = new Samosa();
                }
            }
        }
        return samosa;
    }

    public Object readResolve() {
        return samosa;
    }
}
