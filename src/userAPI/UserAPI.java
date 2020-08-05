package userAPI;

import adresy.Adresa;
import users.User;
import zmluvy.Enums;

import java.util.List;

public class UserAPI implements IUser {
    @Override
    public void VylistovanieVsetkych(List<User> Users) {
        boolean over = Users.isEmpty();
        if(over == true){
            System.out.println("Zatial nema ziadnych pouzivovatelov v systeme. Pridaj noveho pouzivatela.\n");
        }else {
            for (User user : Users) {
                System.out.println(user.getUserInfo());
            }
        }
    }

    @Override
    public void VypisanieUsera(User user) {
        System.out.println(user.getUserInfo());
    }

    @Override
    public void PridanieNovehoPouz(User user, List<User> Users) {
        // zadavame unikatne cislo pre pouzivatela.
        int id = Users.size() + 1;
        user.setId(id);
        // pridavanie pouzivatela
        Users.add(user);
        System.out.println("Pridanie noveho uzivatela stalo sa uspesne.\n");
    }

    @Override
    public void UpravaExistujucehoPouz(User user, Enums.PouzivatelParam pouzivatelParam, Object value) {
        if(pouzivatelParam == null){
            System.out.println("User nema take udaje. Zadajte spravne udaje.\n");
            return;
        }else {
            switch (pouzivatelParam) {
                case Meno:
                    user.setMeno((String) value);
                    break;
                case Email:
                    user.setEmail((String) value);
                    break;
                case AdresaKor:
                    user.setAdresaKor((Adresa) value);
                    break;
                case AdresaTrv:
                    user.setAdresaTrv((Adresa) value);
                    break;
                case Priezvisko:
                    user.setPriezvisko((String) value);
                    break;
                case RodneCislo:
                    user.setRodneCislo((Integer) value);
                    break;
            }
        }
    }

}
