/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HARNER
 */
public class MenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    public void btnconvertidor(ActionEvent event){
             
        
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/Vista/Inicio.fxml"));
        } catch (Exception e) {
            System.out.println("errorcito");
            System.out.println(e.getMessage());
        }
        if (root != null) {
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }  
    }
    
    @FXML
    public void btnoperacion(ActionEvent event){
             
        
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/Vista/Iniciovista.fxml"));
        } catch (Exception e) {
            System.out.println("errorcito");
            System.out.println(e.getMessage());
        }
        if (root != null) {
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }  
    }
    
    @FXML
    public void btninformacion1(ActionEvent event){
             
        
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/Vista/Mensaje1.fxml"));
        } catch (Exception e) {
            System.out.println("errorcito");
            System.out.println(e.getMessage());
        }
        if (root != null) {
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }  
    }
    
    @FXML
    public void btninformacion2(ActionEvent event){
             
        
        Stage stage = new Stage();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/Vista/Mensaje2.fxml"));
        } catch (Exception e) {
            System.out.println("errorcito");
            System.out.println(e.getMessage());
        }
        if (root != null) {
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }  
    }
}
