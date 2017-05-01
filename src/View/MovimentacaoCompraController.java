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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Rodrigo
 */
public class MovimentacaoCompraController implements Initializable {

    @FXML
    private Tab tabItensCompra;
    @FXML
    private TextField txtCodItem;
    @FXML
    private TextField txtCodProduto;
    @FXML
    private TextField txtQtde;
    @FXML
    private TextField txtValor;
    @FXML
    private Button btBuscaProduto;
    @FXML
    private TableView<?> tvItensCompra;
    @FXML
    private TableColumn<?, ?> colItem;
    @FXML
    private TableColumn<?, ?> colCompra;
    @FXML
    private TableColumn<?, ?> colProduto;
    @FXML
    private TableColumn<?, ?> colQtde;
    @FXML
    private TableColumn<?, ?> colValor;
    @FXML
    private Tab tabParcelas;
    @FXML
    private TableView<?> tvParcelas;
    @FXML
    private TableColumn<?, ?> colNumParcelas;
    @FXML
    private TableColumn<?, ?> colValorParcela;
    @FXML
    private TableColumn<?, ?> colValorPago;
    @FXML
    private TableColumn<?, ?> colDtPagto;
    @FXML
    private TableColumn<?, ?> colDtVenc;
    @FXML
    private Button btInserirCompra;
    @FXML
    private Button btCancelarCompra;
    @FXML
    private Button btNovoCompra;
    @FXML
    private Button btAlterarCompra;
    @FXML
    private Button btExcluirCompra;
    @FXML
    private ComboBox<?> cbFuncionario;
    @FXML
    private TextField txtTotal;
    @FXML
    private TextField txtCodCompra;
    @FXML
    private Button btBuscaFornecedor;
    @FXML
    private TextField txtCodFornecedor;
    @FXML
    private DatePicker dpDtEmissao;
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
    private void clkInserirCompra(ActionEvent event) {
    }

    @FXML
    private void clkCancelarCompra(ActionEvent event) {
    }

    @FXML
    private void clkNovoCompra(ActionEvent event) {
    }

    @FXML
    private void clkAlterarCompra(ActionEvent event) {
    }

    @FXML
    private void clkExcluirCompra(ActionEvent event) {
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
