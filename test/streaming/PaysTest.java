/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import com.sun.security.ntlm.Client;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Assert;
import org.junit.Test;

import streaming.entity.Genre;
import streaming.entity.Pays;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */
public class PaysTest {
    
    
    
//  @BeforeClass
  public static void avantClasse(){
        
      EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager(); 
      
      //Demarre la transaction
      em.getTransaction().begin();
       
      //Vide toutes tables
      em.createQuery("DELETE FROM Pays p").executeUpdate();
      em.createQuery("DELETE FROM Genre g").executeUpdate();
      em.createQuery("DELETE FROM Realisateur r").executeUpdate();
//      
        
        

        Realisateur r1 = new Realisateur();
        Realisateur r2 = new Realisateur();
        Realisateur r3 = new Realisateur();
        
        Pays p1 = new Pays();
        Pays p2 = new Pays();
        Pays p3 = new Pays();
                
        Genre g1 = new Genre();
        Genre g2 = new Genre();
        Genre g3 = new Genre();             
      
// Instanciation réalisateur
        r1.setId(1L);
        r1.setNom("Tarantino");
        r1.setPrenom("Quentin");
        r2.setId(2L);
        r2.setNom("Lucas");
        r2.setPrenom("Georges");
        r3.setId(3L);
        r3.setNom("Almodovar");
        r3.setPrenom("Pedro");
        
        // Instanciation pays
        p1.setId(1L);
        p1.setNom("France");
        p2.setId(2L);
        p2.setNom("USA");
        p3.setId(3L);
        p3.setNom("Espagne");
        
        
         //Instanciation genre
        g1.setNom("Animation");
        g1.setId(1L);
        g2.setNom("Action");
        g1.setId(2L);
        g3.setNom("SF");
        g1.setId(3L);
        

        // Envoyer les données dans la base
        em.persist(g1); // persist = générer un insert
        em.persist(g2);
        em.persist(g3);
        em.persist(p1); // persist = générer un insert
        em.persist(p2);
        em.persist(p3);
        em.persist(r1); // persist = générer un insert
        em.persist(r2);
        em.persist(r3);

        
        em.getTransaction().commit(); // Valider la transaction
  System.out.println("avantClass")  ;
  }
  
  
    
//  @Test
  public void verifNbTotalPaysEgal3(){
      EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
      
      int n = em.createQuery("SELECT p FROM Pays p").getResultList().size();
      Assert.assertTrue("La taille de la liste n'est pas bonne", n == 3);
//        Assert.assertEquals(3, n); 
//      if (n == 8){
//                   System.out.println("true");             
//              }
//              
  }
  
//  @Test
  public void Test1() {
  
    
}
  
         

//   @Test

     
//   @Test
   public void testTab(){
             
         int[] monTab = new int[10];
         for (int i = 0; i < monTab.length; i++){
             monTab[i] = i*2;
             System.out.println(monTab[i]);
         }
         
         
     }
     

  
  
//  @Test
  public void idTarantinoegale1(){
      EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
      Realisateur r = (Realisateur) em.createQuery("SELECT r FROM Realisateur r WHERE r.nom = 'Tarantino'").getSingleResult();
      Assert.assertEquals(1, (long) r.getId());
  } 
  
  @Test
   public void testMapping(){
  Persistence.createEntityManagerFactory("StreamingPU");
  
  
 
}
   
   

}


   
