/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class genreDAO {
    
   
        
    public void ajouter(Genre g){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(g);
        em.getTransaction().commit();
    }
    

 public List<Genre> listerTous(){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.createQuery("SELECT g FROM Genre g").getResultList();
    }
 
public Genre rechercherParId(long id){
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        return em.find(Genre.class, id);
        
    }


    
}
