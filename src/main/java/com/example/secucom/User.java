package com.example.secucom;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//transforme cette classe en table
@Entity
//definis le nom de la table
@Table(name = "user")
//permet d'inclure les getter et setter
@Getter
@Setter
@AllArgsConstructor
//paramettre sans arguments
@NoArgsConstructor
public class User {

    @Id//permet de prendre id_user comme id de cette table
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //id de la table User
    private Long iduser;
    private String nom;
    private String prenom;
    private String role;
}
