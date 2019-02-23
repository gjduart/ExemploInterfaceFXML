package bancoControle;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class BancoControleLogin implements Initializable {
    
  //Declaracoes dos Componentes
 @FXML   private Button btCadastro;

 @FXML   private Button btSair;
 
 @FXML   private Button btLogin;

 @FXML  private Label label;

 @FXML private Label label1;

 @FXML private TextField txLogin;

 
 
 
 
 @FXML public void botaoLogin(ActionEvent event) {
      
    }
 
 
 @FXML public void btCadastro(ActionEvent event){
    
 }
 @FXML public void fecharApp(ActionEvent event) {
                  System.exit(0);
       
    }


   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO  
        btCadastro.setOnMouseClicked((MouseEvent e) -> {
          
      });
           
        btLogin.setOnMouseClicked(((MouseEvent e) -> {
             System.out.println("Loguei");
         }));
           
           btSair.setOnMouseClicked(((MouseEvent e) -> {
             System.exit(0);
         }));
 }
 
        
    }    
    
    

