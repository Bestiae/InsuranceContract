package userAPI;

import users.User;
import zmluvy.Enums;

import java.util.List;

public interface IUser {
    public void VylistovanieVsetkych(List<User> Users);
    public void VypisanieUsera(User user);
    public void PridanieNovehoPouz(User user, List<User> Users);
    public void UpravaExistujucehoPouz(User user, Enums.PouzivatelParam pouzivatelParam, Object value);
}
