package com.example.secucom;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplement implements UserService {

    private UserRepo userRepo;


    @Override
    public ReponseMessage ajouterUtilisateurU(User user) {
        if (userRepo.findByNom(user.getNom()) == null) {
            userRepo.save(user);

            ReponseMessage message = new ReponseMessage("utilisateur ajouté avec succes", true);

            return message;
        } else {
            ReponseMessage message = new ReponseMessage("Cet utilisateur existe déjà ", false);

            return message;
        }
    }

    @Override
    public ReponseMessage modifierUtilisateur(User user, Long iduser) {
        if (userRepo.findByIduser(iduser) != null) {
            User updateUser = userRepo.findById(iduser).get();
            updateUser.setNom(user.getNom());
            updateUser.setPrenom(user.getPrenom());
            updateUser.setRole(user.getRole());
            userRepo.saveAndFlush(updateUser);
            ReponseMessage message = new ReponseMessage("User modifier avec succes", true);
            return message;
        } else {
            ReponseMessage message = new ReponseMessage("Cet user n'existe pas ", false);

            return message;
        }
    }

    @Override
    public List<User> afficherUtilisateur() {

        return userRepo.findAll();
    }

    @Override
    public ReponseMessage supprimerUtilisateur(Long iduser) {
        if (userRepo.findByIduser(iduser) != null) {
            userRepo.deleteById(iduser);

            ReponseMessage message = new ReponseMessage("utilisateur Supprimer avec succes", true);
            return message;
        } else {
            ReponseMessage message = new ReponseMessage("Cet utilisateur n'existe pas ", false);

            return message;
        }
    }
}