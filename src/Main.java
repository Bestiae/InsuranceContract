import adresy.Adresa;
import userAPI.UserAPI;
import users.User;
import zmluvy.Enums;
import zmluvy.NezivotnePoistenie;
import zmluvy.ZivotnePoistenie;
import zmluvy.Zmluva;
import zmluvy.nezivotne.PoistenieDomuBytu;
import zmluvy.zivotne.CestovnePoistenie;
import zmluvyAPI.ZmluvyAPI;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        vytvaranie lista pouzivatelov
        List<User> users = new ArrayList<>();

        System.out.println("Vytvarame pouzivatela.");
        User user = new User(
                "Stefan",
                "Mrkvicka",
                020305,
                "mrkvicka@gmail.com",
                new Adresa(
                        84104,
                        "Nitra",
                        "Kralovska",
                        345),
                new Adresa(
                        86789,
                        "Bratislava",
                        "Stare Grunty",
                        890));

        System.out.println("Vytvarame Cestovne poistenie.");
        CestovnePoistenie zivotnePoistenie1 = new CestovnePoistenie(LocalDateTime.of(2020, 01, 01, 13, 00),
                LocalDateTime.of(2020, 01, 01, 13, 00),
                LocalDateTime.of(2020, 10, 01, 13, 00),
                300, 30, user, true, Enums.UcelCesty.Ine);

        System.out.println("Vytvarame poistenie domu a bytu.");
        PoistenieDomuBytu nezivotnePoistenie1 = new PoistenieDomuBytu(LocalDateTime.of(2020, 01, 01, 13, 00),
                LocalDateTime.of(2020, 01, 01, 13, 00),
                LocalDateTime.of(2020, 5,1,13,00),
                2000, 200, Enums.TypNehnutelnosti.RodinnyDomMurovany,
                new Adresa(86789, "Bratislava", "Mala ulica", 69), 2000, false);

        ////////////////////////////////////////////////////////////////////////////////////////////////
        // User API to je jedna moznost aplikacie na pracu v systeme z pouzivatelom.
        UserAPI userAPI = new UserAPI();
        System.out.println("Pridavame pouzivatela do systemu.");
        userAPI.PridanieNovehoPouz(user, users);
        System.out.println("---");

        System.out.println("Vypisujeme daneho pouzivatela.");
        userAPI.VypisanieUsera(user);
        System.out.println("---");

        System.out.println("Zmena mena daneho pouzivatela.");
        userAPI.UpravaExistujucehoPouz(user, Enums.PouzivatelParam.Meno, "Miro");
        System.out.println("---");

        System.out.println("Vypisanie vsetkych pouzivatelov.");
        userAPI.VylistovanieVsetkych(users);
        System.out.println("---");

        // Zmluvy API to je druha moznost aplikacie na pracu v systeme so zmluvami.
        ZmluvyAPI zmluvyAPI = new ZmluvyAPI();

        System.out.println("Pridame pouzivatelovi zmluvu.");
        zmluvyAPI.ZalozeniePoistnejZmluvyPouzivatelovi(zivotnePoistenie1, user);
        System.out.println("=====");

        System.out.println("Vypiseme vsetke zmluvy pouzivatela.");
        zmluvyAPI.VylistovanieVsetkychPoistnychZmluv(users);

        System.out.println("Pridame druhu zmluvy pouzivatelovi.");
        zmluvyAPI.ZalozeniePoistnejZmluvyPouzivatelovi(nezivotnePoistenie1, user);
        System.out.println("=====");

        System.out.println("Vypiseme vsetke zmluvy pre daneho pouzivatela!");
        zmluvyAPI.VylistovaniePoistnychZmluvPouzivatela(users, 1);
        System.out.println("=====");

        System.out.println("Spravime zmenu v zmluve, zmenieme vysku mesacnej splatky na 33.");
        zmluvyAPI.UpravaExistujucejZmluvy(zivotnePoistenie1 ,Enums.CestovnePoistenieParam.VyskaMesacnejSplatky, 33);
        System.out.println("=====");

        System.out.println("Vypiseme vsetky poiste zmluvy pre daneho pouzivatela.");
        zmluvyAPI.VylistovaniePoistnychZmluvPouzivatela(users, 1);

    }
}
