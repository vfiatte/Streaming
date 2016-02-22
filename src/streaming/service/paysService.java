/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.DAO.paysDAO;
import streaming.entity.Pays;

/**
 *
 * @author admin
 */
public class paysService {
     private paysDAO dao = new paysDAO();
    
    public void ajouter(Pays p){
        dao.ajouter(p);
    }
    
    public void rechercheParId(long id){
        dao.rechercherParId(id);
    }
    
    public List<Pays> listerTous(){
        return dao.listerTous();
}
}
