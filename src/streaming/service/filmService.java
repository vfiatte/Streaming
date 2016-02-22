/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.DAO.filmDAO;
import streaming.entity.Episode;
import streaming.entity.Film;

/**
 *
 * @author admin
 */
public class filmService {
     private filmDAO dao = new filmDAO();
    
    public void ajouter(Film f){
        dao.ajouter(f);
    }
    
    public void rechercheParId(long id){
        dao.rechercherParId(id);
    }
    
    public List<Film> listerTous(){
        return dao.listerTous();
}
}
