/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.DAO.realisateurDAO;
import streaming.entity.Realisateur;

/**
 *
 * @author admin
 */
public class realisateurService {
     private realisateurDAO dao = new realisateurDAO();
    
    public void ajouter(Realisateur r){
        dao.ajouter(r);
    }
    
    public void rechercheParId(long id){
        dao.rechercherParId(id);
    }
    
    public List<Realisateur> listerTous(){
        return dao.listerTous();
}
}
