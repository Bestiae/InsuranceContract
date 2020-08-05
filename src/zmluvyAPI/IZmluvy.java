package zmluvyAPI;

import users.User;
import zmluvy.Enums;
import zmluvy.Zmluva;

import java.util.List;

public interface IZmluvy {
    public void ZalozeniePoistnejZmluvyPouzivatelovi(Zmluva zmluva, User user);
    public void VylistovanieVsetkychPoistnychZmluv(List<User> users);
    public void VylistovaniePoistnychZmluvPouzivatela(List<User> users, int id);

    public void UpravaExistujucejZmluvy(Zmluva zmluva, Enums.PoistenieDomacnostiParam poistenieDomacnostiParam, Object value);
    public void UpravaExistujucejZmluvy(Zmluva zmluva, Enums.PoistenieDomuBytuParam poistenieDomuBytuParam, Object value);
    public void UpravaExistujucejZmluvy(Zmluva zmluva, Enums.CestovnePoistenieParam cestovnePoistenieParam, Object value);
    public void UpravaExistujucejZmluvy(Zmluva zmluva, Enums.UrazovePoistenieParam urazovePoistenieParam, Object value);

}
