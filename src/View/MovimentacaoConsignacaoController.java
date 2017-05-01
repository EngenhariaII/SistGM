/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Rodrigo
 */
public class MovimentacaoConsignacaoController implements Initializable {

    @FXML
    private Button btBuscaCliente;
    @FXML
    private TableView<?> tvContasReceber;
    @FXML
    private TableColumn<?, ?> colConsignacao;
    @FXML
    private TableColumn<?, ?> colCliente;
    @FXML
    private TableColumn<?, ?> colDtConsignacao;
    @FXML
    private TableColumn<?, ?> colDtVenc;
    @FXML
    private DatePicker dpDtVenc;
    @FXML
    private Button btNovo;
    @FXML
    private Button btGravar;
    @FXML
    private Button btLimpar;
    @FXML
    private Button btExcluir;
    @FXML
    private Button btCancelar;

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
    private void clkLimpar(ActionEvent event) {
    }

    @FXML
    private void clkExcluir(ActionEvent event) {
    }

    @FXML
    private void clkCancelar(ActionEvent event) {
    }
    
}
