/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.DAO.episodeDAO;
import streaming.entity.Episode;

/**
 *
 * @author admin
 */
public class episodeService {
    private episodeDAO dao = new episodeDAO();
    
    public void ajouter(Episode e){
        dao.ajouter(e);
    }
    
    public void rechercheParId(long id){
        dao.rechercherParId(id);
    }
    
    public List<Episode> listerTous(){
        return dao.listerTous();
}
}
