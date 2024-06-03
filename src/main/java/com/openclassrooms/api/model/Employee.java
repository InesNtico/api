//ici on crée une classe employee correspondant à la table dans la bdd

package com.openclassrooms.api.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data // permet de ne pas ajouter des getters et setters, il le fait tout seul
@Entity //indique que la classe est une table de la bdd
@Table(name = "employees") //nom de la table associée
public class Employee {

    @Id //clé primaire de la table
    @GeneratedValue(strategy = GenerationType.IDENTITY) //la clé primaire est auto incrémentée donc on doit ajouter ça
    private Long id;

    @Column(name = "first_name") //first_name est le nom du champ sql, firstName est le nom de l'attribut java
    /*on met column pour faire le lien entre le nom du champ et la table, car le nom de la colonne bdd et le nom de l'attribut java
     * ne sont pas les mêmes */
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String mail;

    private String password;

}