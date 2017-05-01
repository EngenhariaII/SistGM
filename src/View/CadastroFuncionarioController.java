/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Pichau
 */
public class CadastroFuncionarioController implements Initializable {

    @FXML
    private JFXButton btNovo;
    @FXML
    private JFXButton btCancelar;
    @FXML
    private JFXButton btGravar;
    @FXML
    private JFXButton btLocalizar;
    @FXML
    private JFXButton btExcluir;
    @FXML
    private JFXButton btSair;
    @FXML
    private JFXTextField txtCodigo;
    @FXML
    private JFXTextField txtNome;
    @FXML
    private JFXTextField txtEndereco;
    @FXML
    private JFXTextField txtTelefone;
    @FXML
    private JFXTextField txtCelular;
    @FXML
    private JFXTextField txtCPF;
    @FXML
    private JFXTextField txtLogin;
    @FXML
    private JFXPasswordField txtSenha;
    @FXML
    private JFXDatePicker dpDtadmi;
    @FXML
    private JFXDatePicker dpDtdemi;
    @FXML
    private JFXComboBox<?> cbNivel;

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
    private void clkCancelar(ActionEvent event) {
    }

    @FXML
    private void clkGravar(ActionEvent event) {
    }

    @FXML
    private void clkLocalizar(ActionEvent event) {
    }

    @FXML
    private void clkExcluir(ActionEvent event) {
    }

    @FXML
    private void clkSair(ActionEvent event) {
    }
    
}
