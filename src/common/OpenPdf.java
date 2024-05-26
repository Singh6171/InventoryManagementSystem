/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import dao.InventoryUtils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author gurdeepsingh
 */
public class OpenPdf {
    public static void openByID(String id){
        try {
            if((new File(InventoryUtils.billPath+id+".pdf")).exists()){
                Process p = Runtime.getRuntime().exec("open "+ InventoryUtils.billPath +""+id+".pdf");
            }
            else{
                JOptionPane.showMessageDialog(null, "PDF File Does Not Exist");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        
        }
    }
    
}
