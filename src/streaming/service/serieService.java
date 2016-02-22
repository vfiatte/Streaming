/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.DAO.episodeDAO;
import streaming.DAO.serieDAO;
import streaming.entity.Episode;
import streaming.entity.Serie;

/**
 *
 * @author admin
 */
public class serieService {
     private serieDAO dao = new serieDAO();
    
    public void ajouter(Serie se){
        dao.ajouter(se);
    }
    
    public void rechercheParId(long id){
        dao.rechercherParId(id);
    }
    
    public List<Serie> listerTous(){
        return dao.listerTous();
}
}
