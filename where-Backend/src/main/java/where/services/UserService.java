package where.services;

import where.enitites.User;

import java.util.Map;

public interface UserService {

    User loadUserByUsername(String username);
    void registerUser(User user);
    void validateCode(Map<String, String> parametres);
}
