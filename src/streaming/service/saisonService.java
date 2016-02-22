/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.DAO.saisonDAO;
import streaming.entity.Saison;

/**
 *
 * @author admin
 */
public class saisonService {
     private saisonDAO dao = new saisonDAO();
    
    public void ajouter(Saison s){
        dao.ajouter(s);
    }
    
    public void rechercheParId(long id){
        dao.rechercherParId(id);
    }
    
    public List<Saison> listerTous(){
        return dao.listerTous();
}
}
