import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Daffy", 8),
                new Duck("Laffy", 6),
                new Duck("Daffy", 9),
                new Duck("Adam", 900000),
        };
        System.out.println("BEFORE:");
        display(ducks);
        System.out.println("AFTER:");
        Arrays.sort(ducks);
        display(ducks);
    }

    public static void display (Duck[] ducks){
        for (Duck d :
                ducks) {
            System.out.println(d);
        }
    }
}
