/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Rodrigo
 */
public class CadastroFornecedoresController implements Initializable {

    @FXML
    private Button btNovo;
    @FXML
    private Button btGravar;
    @FXML
    private Button btExcluir;
    @FXML
    private Button btCancelar;
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtEndereco;
    @FXML
    private TextField txtTelefone;
    @FXML
    private TextField txtCelular;
    @FXML
    private TextField txtCodigo;
    @FXML
    private JFXButton btLocalizar;
    @FXML
    private JFXButton btSair;
    @FXML
    private JFXTextField txtEmail;
    @FXML
    private JFXTextField txtSite;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clkNovo(ActionEvent event) {
    }

    @FXML
    private void clkGravar(ActionEvent event) {
    }


    @FXML
    private void clkExcluir(ActionEvent event) {
    }

    @FXML
    private void clkCancelar(ActionEvent event) {
    }

    @FXML
    private void clkLocalizar(ActionEvent event) {
    }

    @FXML
    private void clkSair(ActionEvent event) {
    }
    
}
