/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Karima
 */

public class Rencontre  {
    private int idRencontre;
    private Date dateRencontre;
    private Date heureRencontre;
    private String titreRencontre;
    private Date dureeRencontre;
    private String etatRencontre;
    private Utilisateur U_N_Planificateur;
    private Utilisateur userName;
    private Categorie idCategorie;
    private Set evaluationRencontre = new HashSet(0);

    public Rencontre() {
    }

       
    public Rencontre(int idRencontre, Date dateRencontre, Date heureRencontre, String titreRencontre, Date dureeRencontre, String etatRencontre, Utilisateur U_N_Planificateur, Categorie idCategorie) {
        this.idRencontre = idRencontre;
        this.dateRencontre = dateRencontre;
        this.heureRencontre = heureRencontre;
        this.titreRencontre = titreRencontre;
        this.dureeRencontre = dureeRencontre;
        this.etatRencontre = etatRencontre;
        this.U_N_Planificateur = U_N_Planificateur;
        this.idCategorie = idCategorie;
    }
    
    public Rencontre(int idRencontre, String dateRencontre, String heureRencontre, String titreRencontre, String dureeRencontre, String etatRencontre, Categorie idCategorie, Utilisateur U_N_Planificateur) {
        this.idRencontre = idRencontre;
        try {
            this.dateRencontre = new SimpleDateFormat("yyyy-MM-dd").parse(dateRencontre);
        } catch (ParseException ex) {
            Logger.getLogger(Rencontre.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            this.heureRencontre =new SimpleDateFormat("HH:mm").parse(heureRencontre);
        } catch (ParseException ex) {
            Logger.getLogger(Rencontre.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.titreRencontre = titreRencontre;
        try {
            this.dureeRencontre = new SimpleDateFormat("HH:mm").parse(dureeRencontre);
        } catch (ParseException ex) {
            Logger.getLogger(Rencontre.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.etatRencontre = etatRencontre;
        this.idCategorie = idCategorie;
        this.U_N_Planificateur = U_N_Planificateur;
    }
    
    public Categorie getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Categorie idCategorie) {
        this.idCategorie = idCategorie;
    }

    
    public int getIdRencontre() {
        return idRencontre;
    }

    public void setIdRencontre(int idRencontre) {
        this.idRencontre = idRencontre;
    }
    
    public Date getDateRencontre() {
        return dateRencontre;
    }

    public void setDateRencontre(Date dateRencontre) {
        this.dateRencontre = dateRencontre;
    }
    
    public Date getHeureRencontre() {
        return heureRencontre;
    }

    public void setHeureRencontre(Date heureRencontre) {
        this.heureRencontre = heureRencontre;
    }
    
    public String getTitreRencontre() {
        return titreRencontre;
    }

    public void setTitreRencontre(String titreRencontre) {
        this.titreRencontre = titreRencontre;
    }

    public Date getDureeRencontre() {
        return dureeRencontre;
    }

    public void setDureeRencontre(Date dureeRencontre) {
        this.dureeRencontre = dureeRencontre;
    }

    public String getEtatRencontre() {
        return etatRencontre;
    }

    public void setEtatRencontre(String etatRencontre) {
        this.etatRencontre = etatRencontre;
    }

    public Utilisateur getU_N_Planificateur() {
        return U_N_Planificateur;
    }

    public void setU_N_Planificateur(Utilisateur U_N_Planificateur) {
        this.U_N_Planificateur = U_N_Planificateur;
    }

   
    public Utilisateur getUserName() {
        return userName;
    }

    public void setUserName(Utilisateur userName) {
        this.userName = userName;
    }

    public Set getEvaluationRencontre() {
        return evaluationRencontre;
    }

    public void setEvaluationRencontre(Set evaluationRencontre) {
        this.evaluationRencontre = evaluationRencontre;
    }

    @Override
    public String toString() {
        return "Rencontre{" + "idRencontre=" + idRencontre + ", dateRencontre=" + dateRencontre + ", heureRencontre=" + heureRencontre.getHours()+"h"+ heureRencontre.getMinutes()+"mn" + ", titreRencontre=" + titreRencontre + ", dureeRencontre=" + dureeRencontre.getHours()+"h"+ heureRencontre.getMinutes()+"mn" + ", etatRencontre=" + etatRencontre + ", U_N_Planificateur=" + U_N_Planificateur.getNom() + ", userName=" + userName + ", idCategorie=" + idCategorie.getIdCategorie() + ", evaluationRencontre=" + evaluationRencontre + '}';
    }
    
    
    
}
