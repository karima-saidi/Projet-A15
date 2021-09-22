/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entities.Utilisateur;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import systemerencontre.SystemeRencontre;

/**
 *
 * @author Karima
 */
public class UtilisateurDAO {
    
    static Session session = null;
    
    public static void insert(Utilisateur utilisateur){
        
        session = SystemeRencontre.sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        
        session.save(utilisateur);
        
        tx.commit();
        session.close();
    }
    
     public static void delete(Utilisateur utilisateur){
     
    session = SystemeRencontre.sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        
        session.delete(utilisateur);
        
        tx.commit();
        session.close();
}
 
     public static void updateName(Utilisateur utilisateur,String name){
     
    session = SystemeRencontre.sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        
        utilisateur.setNom(name);
        session.update(utilisateur);
        
        tx.commit();
        session.close();
}
     
     public static void updateTypeUser(Utilisateur utilisateur,String typeUser){
     
    session = SystemeRencontre.sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        
        utilisateur.setTypeuser(typeUser);
        session.update(utilisateur);
        
        tx.commit();
        session.close();
}
     
     public static void allUsers(){
     
    session = SystemeRencontre.sessionFactory.openSession();
        
     Query query = session.createQuery("from Utilisateur");
        List<Utilisateur> results = query.list();
        
    for(Utilisateur line:results){
        System.out.println("le Nom d'utilisateur est "+line.getUsername());
        System.out.println("le Nom est " + line.getNom());
        System.out.println("le Prenom  est "+line.getPrenom());
        System.out.println("le Mail  est "+line.getEmail());
        System.out.println("le numero de telephone  est "+line.getNumtel());
        System.out.println("l'Adresse  est "+line.getAdresse());
        System.out.println("le Type utilisateur  est "+line.getTypeuser());
        System.out.println("l'état de validation est "+line.getEtatvalidation());
        System.out.println("l'état d'activation  est "+line.getEtatactivation());
        System.out.println("l'administrateur validateur est  "+line.getAdminValidateur().getNom());
        System.out.println("l'administrateur désactivateur  est "+line.getAdminDesactivateur().getNom());
    }
        session.close();
}
     
     
      public static void singleUser(String id){
     
    session = SystemeRencontre.sessionFactory.openSession();
        
     Query query = session.createQuery("from Utilisateur U where U.username= :UserID");
        query.setParameter("UserID", id);
        List<Utilisateur> results = query.list();
        
    for(Utilisateur line:results){
        System.out.println("le Nom d'utilisateur est "+line.getUsername());
        System.out.println("le Nom est " + line.getNom());
        System.out.println("le Prenom  est "+line.getPrenom());
        System.out.println("le Mail  est "+line.getEmail());
        System.out.println("le numero de telephone  est "+line.getNumtel());
        System.out.println("l'Adresse  est "+line.getAdresse());
        System.out.println("le Type utilisateur  est "+line.getTypeuser());
        System.out.println("l'état de validation est "+line.getEtatvalidation());
        System.out.println("l'état d'activation  est "+line.getEtatactivation());
        System.out.println("l'administrateur validateur est  "+line.getAdminValidateur().getNom());
        System.out.println("l'administrateur désactivateur  est "+line.getAdminDesactivateur().getNom());
    }
        session.close();
}
}
