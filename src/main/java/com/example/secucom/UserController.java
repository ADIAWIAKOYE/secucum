package com.example.secucom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //================DEBUT DE LA METHODE PERMETTANT D'AJOUTER UN UTILISATEUR======================
    @PostMapping("/ajouterUser/{nomrole}")
    public ReponseMessage creerUserI(User user){

        return userService.ajouterUtilisateurU(user);
    }//================FIN DE LA METHODE PERMETTANT D'AJOUTER UN UTILISATEUR======================

    //================DEBUT DE LA METHODE PERMETTANT DE MODIFIER UN UTILISATEUR======================
    @PutMapping("/modifierUser/{iduser}")
    public ReponseMessage updateUser(@RequestBody User user, @PathVariable Long iduser){

        return userService.modifierUtilisateur(user, iduser);
    }//================FIN DE LA METHODE PERMETTANT DE MODIFIER UN UTILISATEUR======================

    //================DEBUT DE LA METHODE PERMETTANT DE SUPPRIMER UN UTILISATEUR======================
    @DeleteMapping("/supprimerUser/{iduser}")
    public ReponseMessage supprimerUser(@PathVariable Long iduser){

        return userService.supprimerUtilisateur(iduser);
    }//================FIN DE LA METHODE PERMETTANT DE SUPPRIMER UN UTILISATEUR======================

    //================DEBUT DE LA METHODE PERMETTANT D'AFFICHER LES UTILISATEURS DE LA BASE DE DONNER======================
    @GetMapping("/afficherUser")
    public List<User> afficherUser(){

        return userService.afficherUtilisateur();
    }//================FIN DE LA METHODE PERMETTANT D'AFFICHER LES UTILISATEURS DE LA BASE DE DONNER======================


}
