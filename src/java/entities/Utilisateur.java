/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Karima
 */
public class Utilisateur {
    private String username;
    private String motpasse;
    private String nom;
    private String prenom;
    private String email;
    private String numtel;
    private String adresse;
    private String typeuser;
    private String etatvalidation;
    private String etatactivation;
    private Utilisateur adminValidateur;
    private Utilisateur adminDesactivateur;
    private Set disponibilite = new HashSet(0);
    private Set compteValide = new HashSet(0);
    private Set compteDesactive = new HashSet(0);
    private Set rencontres = new HashSet(0);
    private Set categories = new HashSet(0);
    private Set rencontresAnnules = new HashSet(0);
    private Set evaluationUser = new HashSet(0);

    public Utilisateur() {
    }

    public Utilisateur(String username, String motpasse, String nom, String prenom, String email, String numtel, String adresse, String typeuser, String etatvalidation, String etatactivation, Utilisateur adminValidateur) {
        this.username = username;
        this.motpasse = motpasse;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.numtel = numtel;
        this.adresse = adresse;
        this.typeuser = typeuser;
        this.etatvalidation = etatvalidation;
        this.etatactivation = etatactivation;
        this.adminValidateur = adminValidateur;
        
      }
    
     public Utilisateur(String username, String motpasse, String nom, String prenom, String email, String numtel, String adresse, String typeuser, String etatvalidation, String etatactivation,Utilisateur adminValidateur,Set compteValide,Set compteDesactive,Set disponibilite,Set rencontres) {
        this.username = username;
        this.motpasse = motpasse;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.numtel = numtel;
        this.adresse = adresse;
        this.typeuser = typeuser;
        this.etatvalidation = etatvalidation;
        this.etatactivation = etatactivation;
        this.adminValidateur = adminValidateur;
        this.compteValide = compteValide;
        this.compteDesactive = compteDesactive;
        this.disponibilite = disponibilite;
        this.rencontres = rencontres;
       }

    
    public Utilisateur(String username, String motpasse, String nom, String prenom, String email, String numtel, String adresse, String typeuser, String etatvalidation, String etatactivation) {
        this.username = username;
        this.motpasse = motpasse;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.numtel = numtel;
        this.adresse = adresse;
        this.typeuser = typeuser;
        this.etatvalidation = etatvalidation; 
        this.etatactivation = etatactivation;
    }

    public Utilisateur(String username, String motpasse, String nom, String prenom, String email, String numtel, String adresse, String typeuser, String etatvalidation, String etatactivation, Utilisateur adminValidateur, Utilisateur adminDesactivateur) {
        this.username = username;
        this.motpasse = motpasse;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.numtel = numtel;
        this.adresse = adresse;
        this.typeuser = typeuser;
        this.etatvalidation = etatvalidation;
        this.etatactivation = etatactivation;
        this.adminValidateur = adminValidateur;
        this.adminDesactivateur = adminDesactivateur;
    }

    public Set getCompteValide() {
        return compteValide;
    }

    public void setCompteValide(Set compteValide) {
        this.compteValide = compteValide;
    }

    public Set getCompteDesactive() {
        return compteDesactive;
    }

    public void setCompteDesactive(Set compteDesactive) {
        this.compteDesactive = compteDesactive;
    }

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMotpasse() {
        return motpasse;
    }

    public void setMotpasse(String motpasse) {
        this.motpasse = motpasse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumtel() {
        return numtel;
    }

    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTypeuser() {
        return typeuser;
    }

    public void setTypeuser(String typeuser) {
        this.typeuser = typeuser;
    }

    public String getEtatvalidation() {
        return etatvalidation;
    }

    public void setEtatvalidation(String etatvalidation) {
        this.etatvalidation = etatvalidation;
    }

    public String getEtatactivation() {
        return etatactivation;
    }

    public void setEtatactivation(String etatactivation) {
        this.etatactivation = etatactivation;
    }

    public Utilisateur getAdminValidateur() {
        return adminValidateur;
    }

    public void setAdminValidateur(Utilisateur adminValidateur) {
        this.adminValidateur = adminValidateur;
    }

    public Utilisateur getAdminDesactivateur() {
        return adminDesactivateur;
    }

    public void setAdminDesactivateur(Utilisateur adminDesactivateur) {
        this.adminDesactivateur = adminDesactivateur;
    }

    public Set getDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(Set disponibilite) {
        this.disponibilite = disponibilite;
    }

    public Set getRencontres() {
        return rencontres;
    }

    public void setRencontres(Set rencontres) {
        this.rencontres = rencontres;
    }

    public Set getCategories() {
        return categories;
    }

    public void setCategories(Set categories) {
        this.categories = categories;
    }

    public Set getRencontresAnnules() {
        return rencontresAnnules;
    }

    public void setRencontresAnnules(Set rencontresAnnules) {
        this.rencontresAnnules = rencontresAnnules;
    }

    public Set getEvaluationUser() {
        return evaluationUser;
    }

    public void setEvaluationUser(Set evaluationUser) {
        this.evaluationUser = evaluationUser;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "username=" + username + ", motpasse=" + motpasse + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", numtel=" + numtel + ", adresse=" + adresse + ", typeuser=" + typeuser + ", etatvalidation=" + etatvalidation + ", etatactivation=" + etatactivation + ", adminValidateur=" + adminValidateur + ", adminDesactivateur=" + adminDesactivateur + ", disponibilite=" + disponibilite + ", compteValide=" + compteValide + ", compteDesactive=" + compteDesactive + ", rencontres=" + rencontres + ", categories=" + categories + ", rencontresAnnules=" + rencontresAnnules + ", evaluationUser=" + evaluationUser + '}';
    }
    
    
    
    
}
