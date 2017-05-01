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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Rodrigo
 */
public class MovimentacaoContasPagarController implements Initializable {

    @FXML
    private TextField txtValorRecebido;
    @FXML
    private TextField txtCodConta;
    @FXML
    private TextField txtCodCompra;
    @FXML
    private DatePicker dpDtPagto;
    @FXML
    private DatePicker dpDtVenc;
    @FXML
    private TextField txtValorTotal;
    @FXML
    private Button btBuscaFornecedor;
    @FXML
    private TextField txtCodFornecedor;
    @FXML
    private TableView<?> tvContasPagar;
    @FXML
    private TableColumn<?, ?> colConta;
    @FXML
    private TableColumn<?, ?> colCompra;
    @FXML
    private TableColumn<?, ?> colDescricao;
    @FXML
    private TableColumn<?, ?> colValorPago;
    @FXML
    private TableColumn<?, ?> colValorConta;
    @FXML
    private TableColumn<?, ?> colDtPagto;
    @FXML
    private TableColumn<?, ?> colDtVenc;
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
