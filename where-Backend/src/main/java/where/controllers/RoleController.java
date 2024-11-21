package where.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import where.enitites.Role;
import where.enitites.TypeRole;
import where.repositories.RoleRepository;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/role")
public class RoleController {
    RoleRepository roleRepository;
    RoleController(RoleRepository roleRepository){
        this.roleRepository=roleRepository;
    }

    @PostMapping("/createRole")
   // @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")

    public ResponseEntity<?> createRole(@RequestBody Role role) {
        TypeRole typeRole = role.getLibelle();
        Optional<Role> existingRole = roleRepository.findByLibelle(typeRole);

        // Check if the role already exists
        if (existingRole.isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("Role avec libelle " + typeRole + " existe déja.");
        }

        // Save the new role
        Role savedRole = roleRepository.save(role);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedRole);
    }


}
