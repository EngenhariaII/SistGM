/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import DAO.NivelDAO;
import Exception.DAOException;
import Exception.EntidadeException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabri
 */
public class Nivel {
    private Integer codigo;
    private String nome;

    public Nivel() {
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return codigo + " - " + nome;
    }
    
    
    
    public Nivel select(Connection con) throws EntidadeException{
        try{
            Nivel n = new NivelDAO().select(this, con);
            return n;
        }catch(DAOException ex){
            throw new EntidadeException(ex.getMessage());
        }
    }
    
    public List<Nivel> lista(Connection con) throws EntidadeException{
        try{
            List<Nivel> lista = new ArrayList<>();
            lista = new NivelDAO().lista(con);
            return lista;
        }catch(DAOException ex){
            throw new EntidadeException(ex.getMessage());
        }
    }
    
}
