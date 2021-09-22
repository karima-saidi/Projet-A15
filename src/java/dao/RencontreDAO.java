/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.UtilisateurDAO.session;
import entities.Categorie;
import entities.Rencontre;
import entities.Utilisateur;
import java.util.List;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import systemerencontre.SystemeRencontre;

/**
 *
 * @author Karima
 */
public class RencontreDAO {
    static Session session = null;
    
    public static void insert(Rencontre rencontre){
        
        session = SystemeRencontre.sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        
        session.save(rencontre);
        
        tx.commit();
        session.close();
    }
    
    
     public static void delete(Rencontre rencontre){
     
    session = SystemeRencontre.sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        
        session.delete(rencontre);
        
        tx.commit();
        session.close();
}
 
     public static void updateTitre(Rencontre rencontre,String titreRencontre){
     
    session = SystemeRencontre.sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        
        rencontre.setTitreRencontre(titreRencontre);
        session.update(rencontre);
        
        tx.commit();
        session.close();
}
     
     
       
     public static void allRencontres(){
     
    session = SystemeRencontre.sessionFactory.openSession();
        
     Query query = session.createQuery("from Rencontre");
        List<Rencontre> results = query.list();
        
    for(Rencontre line:results){
        System.out.println("l'identifiant de la rencontre est "+line.getIdRencontre());
        System.out.println("la date de la rencontre est " + line.getDateRencontre());
        System.out.println("l'heure de la rencontre est "+line.getHeureRencontre());
        System.out.println("le titre de le rencontre est "+line.getTitreRencontre());
        System.out.println("la duree de la rencontre est "+line.getDureeRencontre());
        System.out.println("la rencontre est "+line.getEtatRencontre());
        System.out.println("l'utilisateur qui a planifier la rencontre est "+line.getU_N_Planificateur().getNom());
        System.out.println("la categorie de la rencontre est "+line.getIdCategorie());
    }
        session.close();
}
     
     
      public static void singleRencontre(int id){
     
    session = SystemeRencontre.sessionFactory.openSession();
        
     Query query = session.createQuery("from Rencontre R where R.idRencontre= :RencontreID");
        query.setParameter("RencontreID", id);
        List<Rencontre> results = query.list();
        
    for(Rencontre line:results){
        System.out.println("l'identifiant de la rencontre est "+line.getIdRencontre());
        System.out.println("la date de la rencontre est " + line.getDateRencontre());
        System.out.println("l'heure de la rencontre est "+line.getHeureRencontre());
        System.out.println("le titre de le rencontre est "+line.getTitreRencontre());
        System.out.println("la duree de la rencontre est "+line.getDureeRencontre());
        System.out.println("la rencontre est "+line.getEtatRencontre());
        System.out.println("l'utilisateur qui a planifier la rencontre est "+line.getU_N_Planificateur().getNom());
        System.out.println("la categorie de la rencontre est "+line.getIdCategorie().getNomCategorie());
    }
        session.close();
}
      
      public static void PlanifierRencontre(Utilisateur user, int idRencontre,String dateRencontre, String heureRencontre, String titreRencontre, String dureeRencontre, String etatRencontre, Categorie categorie) {

    session = SystemeRencontre.sessionFactory.openSession();
    session.beginTransaction();
    Rencontre rencontre = new Rencontre(idRencontre, dateRencontre,heureRencontre,titreRencontre,dureeRencontre,etatRencontre,categorie,user);
    user.getRencontres().add(rencontre);
    session.save(rencontre);
    session.getTransaction().commit();
     session.close();
}
     
      public static void AnnulerRencontre(Utilisateur user, Rencontre rencontre) {

    session = SystemeRencontre.sessionFactory.openSession();
    session.beginTransaction();

    user.getRencontresAnnules().add(rencontre);
     rencontre.setEtatRencontre("Annulée");
     
        session.update(rencontre);
    
    session.getTransaction().commit();
     session.close();
}
    
}
