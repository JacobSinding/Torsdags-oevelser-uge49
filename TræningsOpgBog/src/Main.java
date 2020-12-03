import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {

        Bog bog = new Bog("1", "Aleksander Storm", 2020);
        Bog bog1 = new Bog("2", "Vejen til succes: Aleksander Storm", 2021);
        Bog bog2 = new Bog("3", "Faldet: Aleksander Storm", 2022);
    Bibliotek bibliotek = new Bibliotek();

    bibliotek.getBøger().add(bog);
    bibliotek.getBøger().add(bog1);
    bibliotek.getBøger().add(bog2);


        System.out.println(bibliotek.tjekForBog(bog));

    }
}
