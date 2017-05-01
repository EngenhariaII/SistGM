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
public class MovimentacaoVendaController implements Initializable {

    @FXML
    private Tab tabItensVenda;
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
    private TableView<?> tvItensVenda;
    @FXML
    private TableColumn<?, ?> colItem;
    @FXML
    private TableColumn<?, ?> colVenda;
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
    private Button btInserirVenda;
    @FXML
    private Button btCancelarVenda;
    @FXML
    private Button btNovoVenda;
    @FXML
    private Button btAlterarVenda;
    @FXML
    private Button btExcluirVenda;
    @FXML
    private ComboBox<?> cbFuncionario;
    @FXML
    private TextField txtTotal;
    @FXML
    private TextField txtCodVenda;
    @FXML
    private Button btBuscaCliente;
    @FXML
    private TextField txtCodCliente;
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
    private void clkInserirVenda(ActionEvent event) {
    }

    @FXML
    private void clkCancelarVenda(ActionEvent event) {
    }

    @FXML
    private void clkNovoVenda(ActionEvent event) {
    }

    @FXML
    private void clkAlterarVenda(ActionEvent event) {
    }

    @FXML
    private void clkExcluirVenda(ActionEvent event) {
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
