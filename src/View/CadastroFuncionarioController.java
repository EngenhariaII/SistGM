/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controle.NivelControl;
import Entidade.Nivel;
import Exception.ControlException;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private JFXComboBox<Nivel> cbNivel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        estado(true); 
        
    }    

    @FXML
    private void clkNovo(ActionEvent event) throws ControlException {
        estado(false);
        carregacb();
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
    
    public void estado(boolean estado){
        btCancelar.setDisable(estado);
        btGravar.setDisable(estado);
        btLocalizar.setDisable(estado);
        btExcluir.setDisable(estado);
        txtCPF.setDisable(estado);
        txtCelular.setDisable(estado);
        txtCodigo.setDisable(estado);
        txtEndereco.setDisable(estado);
        txtLogin.setDisable(estado);
        txtNome.setDisable(estado);
        txtSenha.setDisable(estado);
        txtTelefone.setDisable(estado);
        cbNivel.setDisable(estado);
        dpDtadmi.setDisable(estado);
        dpDtdemi.setDisable(estado);
    }
    
    public void carregacb() throws ControlException{
        NivelControl nc = new NivelControl();
        List<Nivel> lista = new ArrayList<>();
        lista = nc.listaniveis();
        ObservableList<Nivel> colection = FXCollections.observableArrayList(lista);
        cbNivel.getItems().addAll(colection);
    }
    
}
