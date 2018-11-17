
package Controller;
import DAO.PacienteDAO;

import Model.Paciente;
import static Model.Paciente_.doenca;
import static Model.Paciente_.email;
import static Model.Paciente_.endereco;
import static Model.Paciente_.nome;
import static Model.Paciente_.telefone;
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
                String temPlanoDeSaude )
                throws Exception { }
        
                Paciente paciente = new Paciente();
        paciente.setNome (nome);
        paciente.setEmail (email);
        paciente.setTelefone (telefone);
        paciente.setEndereco (endereco);
        paciente.setNumerodoquarto(Integer.parseInt (quarto));
        paciente.setDoenca (doenca);
        paciente.setDiasdeinternacao(Integer.parseInt(diasDeInternacao));
        if (temPlanoDeSaude.equalsIgnoreCase ("sim") ) {paciente.setTemplanodesaude(true);}
        else{ paciente.setTemplanodesaude(false);}
        new PacienteDAO().create(paciente); 
        
             
        
        
           
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
