/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.DAO.lienDAO;
import streaming.entity.Episode;
import streaming.entity.Lien;

/**
 *
 * @author admin
 */
public class lienService {
     private lienDAO dao = new lienDAO();
    
    public void ajouter(Lien l){
        dao.ajouter(l);
    }
    
    public void rechercheParId(long id){
        dao.rechercherParId(id);
    }
    
    public List<Lien> listerTous(){
        return dao.listerTous();
}
}
