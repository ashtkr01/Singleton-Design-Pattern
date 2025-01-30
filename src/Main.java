import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{
        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(s1);

        System.out.println("Serialization Done");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        Samosa s2 = (Samosa) ois.readObject();
        System.out.println(s2.hashCode());
    }
}