/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoControle;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Casa
 */
public class PrincipalController extends BancoControleLogin implements Initializable {

      @FXML
    private Button btSair;

    @Override
 
    
    public void initialize(URL url, ResourceBundle rb) {
              btSair.setOnMouseClicked(((MouseEvent e) -> {
             System.exit(0);
         }));
 }
      
 }
 
      
    

