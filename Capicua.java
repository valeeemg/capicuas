import java.util.HashSet;
import java.util.Set;

public class Capicua {

    public static void main(String[] args) {
        Set<Integer> capicuas = new HashSet<>();

        for (int i = 1; i <= 9; i++) {
            int num = i * 11;
            capicuas.add(num);
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                int num = i * 101 + j * 10;
                capicuas.add(num);
            }
        }

        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                int num = i * 1001 + j * 110;
                capicuas.add(num);
            }
        }

        System.out.println("Números capicúas de 2, 3 y 4 cifras:");
        for (int capicua : capicuas) {
            System.out.println(capicua);
        }
    }
}
