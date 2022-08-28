/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author l222552
 */
public class Veterinario {
    private String nom_vet;
    private String end_vet;
    private String tel_vet;

    public Veterinario(String nom_vet, String end_vet, String tel_vet) {
        this.nom_vet = nom_vet;
        this.end_vet = end_vet;
        this.tel_vet = tel_vet;
    }
    public String getNom_vet() {
        return nom_vet;
    }

    public void setNom_vet(String nom_vet) {
        this.nom_vet = nom_vet;
    }

    public String getEnd_vet() {
        return end_vet;
    }

    public void setEnd_vet(String end_vet) {
        this.end_vet = end_vet;
    }

    public String getTel_vet() {
        return tel_vet;
    }

    public void setTel_vet(String tel_vet) {
        this.tel_vet = tel_vet;
    }
    
    
}
