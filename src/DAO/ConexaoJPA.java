
package DAO;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class ConexaoJPA 

{
    public static EntityManager getEntityManager() 
    {EntityManagerFactory emf= Persistence.createEntityManagerFactory("JHospitalPu");
    EntityManager em = emf.createEntityManager();
    return em;
    }
    
}
