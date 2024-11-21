package where.services;

import java.util.Map;

public interface ValidationService {


    void codeActivation(String username);
    void demandeDeNouveauMotDePasse(Map<String, String> parametres);

    void modifierMotDePasse(Map<String, String> parametres);
}
