
package Controller;

import Model.Paciente;
import java.util.List;


public class PacienteController 

{
    public void inserir 
        (String nome,
                String email,
                String endereco,
                String telefone,
                String quarto,
                String doenca,
                String diasDeInternacao,
                String temPlanoDeSaude)
                throws Exception {}
        
public void alterar
        (Integer id,
                String nome,
                String email,
                String endereco,
                String telefone,
                String quarto,
                String doenca,
                String diasDeInternacao,
                String temPlanoDeSaude)
                throws Exception  {}
        
        public void excluir (Integer id)
                throws Exception  {}
        
        public List <Paciente> buscar (String nome, String email)
                throws Exception  {return null;}
                
        
}
