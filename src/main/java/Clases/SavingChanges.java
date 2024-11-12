/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import com.mycompany.login.SaveForm;

/**
 *
 * @author Brandon
 */
public class SavingChanges {
       
    
    public void Change(int numero){
        try{
            SaveForm objetoGuardar = new SaveForm();
            
            if (numero==1){
                objetoGuardar.setVisible(true);
            }
            
            
            
        } catch (Exception e){
            
        }
    }
    
}
