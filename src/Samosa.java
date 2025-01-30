public class Samosa {
    private static Samosa samosa;

    //Constructor
    private Samosa() {
        if(samosa != null){
            throw new RuntimeException("You are trying to break the singleton Principle");
        }
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
}
