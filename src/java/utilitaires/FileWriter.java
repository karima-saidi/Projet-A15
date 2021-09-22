/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitaires;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Utilisateur
 */
public class FileWriter {
   
    public static void saveStringIntoFile(String contentToSave, String filePath) {
        File file = new File(filePath);
        
        try {
            FileUtils.writeStringToFile(file, contentToSave, "utf-8");
        } catch (IOException ex) {
            Logger.getLogger(FileWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
