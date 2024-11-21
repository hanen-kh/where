package where.controllers;

import io.jsonwebtoken.lang.Assert;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;
import where.Config.JwtService;
import where.enitites.AuthentificationDto;
import where.enitites.User;
import where.repositories.UserRepository;
import where.services.servicesIMPL.UserServiceImpl;
import where.services.servicesIMPL.ValidationServiceImpl;

import java.util.Map;

@RestController

@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    //@Autowired
    //private AuthenticationManager authenticationManager;
    @Autowired
    private UserRepository userRepository;



    @Autowired
    private JwtService jwtService;

    @Autowired
    private ValidationServiceImpl validationService;

    @PostMapping(path="changerpass")
    public void changerPass (@RequestBody Map<String,String> parametres){
        validationService.modifierMotDePasse(parametres);
    }

   /* @PostMapping(path="demande-nouveau-pass")
    public void demandenouveauPass(@RequestBody Map<String,String> parametres){
        validationService.demandeDeNouveauMotDePasse(parametres);}*/

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        try {
            userService.registerUser(user);
            return ResponseEntity.ok("User registered successfully. Please check your email for the activation code.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

    // Endpoint pour valider le code d'activation de l'utilisateur
   /* @PostMapping("/validateCode")
    public ResponseEntity<String> validateCode(@RequestBody Map<String, String> parametres) {
        try {
            userService.validateCode(parametres);
            return ResponseEntity.ok("User activated successfully.");
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("An unexpected error occurred.");
        }
    }

    @PostMapping("/connexion")
    public Map<String, String> connexion(@RequestBody AuthentificationDto authentificationDto) {
        // Verify that jwtService is not null
        Assert.notNull(jwtService, "jwtService is null");

        // Generate the token
        Map<String, String> tokenMap = jwtService.generate(authentificationDto.username());
        return tokenMap;
    }*/
}
