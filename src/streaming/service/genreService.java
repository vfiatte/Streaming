/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.DAO.genreDAO;
import streaming.entity.Genre;

/**
 *
 * @author admin
 */
public class genreService {
     private genreDAO dao = new genreDAO();
    
    public void ajouter(Genre g){
        dao.ajouter(g);
    }
    
    public void rechercheParId(long id){
        dao.rechercherParId(id);
    }
    
    public List<Genre> listerTous(){
        return dao.listerTous();
}
}
