import java.lang.reflect.Constructor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{
        Samosa s1 = Samosa.INSTANCE;
        System.out.println(s1.hashCode());
        Samosa s2 = Samosa.INSTANCE;
        System.out.println(s2.hashCode());

        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa s3 = constructor.newInstance();
        System.out.println(s3.hashCode());
    }
}