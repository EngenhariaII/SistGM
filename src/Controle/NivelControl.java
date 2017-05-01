
package Controle;

import Entidade.Nivel;
import Exception.ControlException;
import Exception.EntidadeException;
import Sql.Banco;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


public class NivelControl {
    
    public List<Nivel> listaniveis() throws ControlException{
    Connection con = Banco.getConexao();
    List<Nivel> lista = new ArrayList<>();
            try{
                lista = new Nivel().lista(con);
                return lista;   
            }catch(EntidadeException ex){
                throw new ControlException(ex.getMessage());
                
            }
    }
}
