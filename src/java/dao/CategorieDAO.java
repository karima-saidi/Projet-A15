/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.RencontreDAO.session;
import entities.Categorie;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import systemerencontre.SystemeRencontre;

/**
 *
 * @author Karima
 */
public class CategorieDAO {
    static Session session = null;
    
    public static void insert(Categorie categorie){
        
        session = SystemeRencontre.sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        
        session.save(categorie);
        
        tx.commit();
        session.close();
    }
    
    public static void delete(Categorie categorie){
     
    session = SystemeRencontre.sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        
        session.delete(categorie);
        
        tx.commit();
        session.close();
}
    
    public static void updateName(Categorie categorie,String name){
     
    session = SystemeRencontre.sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        
        categorie.setNomCategorie(name);
        session.update(categorie);
        
        tx.commit();
        session.close();
}
 
    
     public static void allCategorie() {
        session = SystemeRencontre.sessionFactory.openSession();

        Query query = session.createQuery("from Categorie");
        List<Categorie> results = query.list();

        for (Categorie line : results) {
            
            System.out.println("Id Categorie : " + line.getIdCategorie());
            System.out.println(" Nom categorie : " + line.getNomCategorie());
            System.out.println(" L'Etat de la categorie " + line.getEtatCategorie());
            System.out.println(" Nom administrateur" + line.getAdminUserName());
        }

        
    session.close();
    }
     
     public static void singleCategorie(int idCategorie){
     
    session = SystemeRencontre.sessionFactory.openSession();
        
     Query query = session.createQuery("from Categorie C where C.idCategorie= :CategorieID");
        query.setParameter("CategorieID", idCategorie);
        List<Categorie> results = query.list();
        
    for(Categorie line:results){
        System.out.println("Id Categorie : " + line.getIdCategorie());
            System.out.println(" Nom categorie : " + line.getNomCategorie());
            System.out.println(" L'Etat de la categorie " + line.getEtatCategorie());
            //System.out.println(" Nom administrateur" + line.getAdminUserName());
        }

        
    session.close();
    }
}
