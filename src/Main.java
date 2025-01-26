//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Samosa samosa1 = Samosa.getSamosa();
        System.out.println(samosa1.hashCode());

        Samosa samosa2 = Samosa.getSamosa();
        System.out.println(samosa2.hashCode());

        Jalebi jalebi1 = Jalebi.getJalebi();
        System.out.println(jalebi1.hashCode());
    }
}