package dev.jorgelucas.RegistroDePirata.Pirata;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data

public class PirataModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column (name = "idade")
    private int idade;

    @Column(name = "Bando")
    private String bando;

    @Column(name = "Img_Url")
    private String imgurl;

    @Column(name = "Recompensa")
    private int recompensa;

}
