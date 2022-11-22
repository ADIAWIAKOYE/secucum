package com.example.secucom;

import java.util.List;

public interface UserService {

    //================METHODE PERMETTANT D'AJOUTER UN USER=========================

    ReponseMessage ajouterUtilisateurU(User user);

    //================METHODE PERMETTANT DE MODIFIER UN USER=========================
    ReponseMessage modifierUtilisateur(User user, Long iduser);

    //================METHODE PERMETTANT D'AFFICHER UN USER=========================
    List<User> afficherUtilisateur();

    //================METHODE PERMETTANT DE SUPPRIMER UN USER=========================
    ReponseMessage supprimerUtilisateur(Long iduser);
}
