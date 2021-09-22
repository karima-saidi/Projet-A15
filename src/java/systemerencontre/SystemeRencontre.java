/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemerencontre;

import dao.UtilisateurDAO;
import entities.Utilisateur;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import net.sf.json.JSONObject;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import utilitaires.FileWriter;


/**
 * REST Web Service
 *
 * @author Karima
 */
@Path("rencontre")
public class SystemeRencontre {

    public static SessionFactory sessionFactory=
            new AnnotationConfiguration().configure().buildSessionFactory();
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of SystemeRencontre
     */
    public SystemeRencontre() {
    }

    /**
     * Retrieves representation of an instance of systemerencontre.SystemeRencontre
     * @return an instance of java.lang.String
     */
    @GET
    @Path("insertUser&{user}")
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public String getJson(@PathParam("user")Utilisateur user) {
        UtilisateurDAO.insert(user);
        JSONObject Out = new JSONObject();
        Out.accumulate("Satus","OK");
        Out.accumulate("Message", user +"est ajouter correctement");
        System.out.println(Out);
        return "{\n" +
        "\"Satus\":\"OK\" ,\n" +
        "\"message\":user \"est ajouter correctement\"}";
        
    }  

    @GET
    @Path("SelectUser")
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public String getJson() {
        UtilisateurDAO.allUsers();
        JSONObject Out = new JSONObject();
        Out.accumulate("Satus","OK");
        Out.accumulate("Message", user +"est ajouter correctement");
        System.out.println(Out);
        return "{\n" +
        "\"Satus\":\"OK\" ,\n" +
        "\"message\":user \"est ajouter correctement\"}";
        
    }  


    
}
