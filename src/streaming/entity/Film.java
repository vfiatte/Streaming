/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author admin
 */
@Entity
public class Film implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre;
    private Long annee;
    private String synopsys;
    
    @ManyToOne
    @JoinColumn(name = "PAYS_ID")
    private Pays pays;
    
    @OneToMany(mappedBy = "film")
    private List<Lien> lienCrees = new ArrayList<Lien>();
    
    @ManyToOne
    @JoinColumn(name = "GENRE_ID")
    private Genre genre;
    
    @ManyToMany
    @JoinTable(name = "Film_Realisateur")
    private List<Realisateur> realisateur = new ArrayList<Realisateur>();

    public Film(){
        
    }
    
    public Film(Long id, String titre, Long annee) {
        this.id = id;
        this.titre = titre;
        this.annee = annee;
 
        
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    
    
    
    public String getSynopsys() {
        return synopsys;
    }

    public void setSynopsys(String synopsys) {
        this.synopsys = synopsys;
    }

    public List<Lien> getLienCrees() {
        return lienCrees;
    }

    public void setLienCrees(List<Lien> lienCrees) {
        this.lienCrees = lienCrees;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Realisateur> getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(List<Realisateur> realisateur) {
        this.realisateur = realisateur;
    }

    
    
    
     public String getTitre() {
        return titre;
    }

    
    public void setTitre(String titre) {
        this.titre = titre;
    }
    
    public Long getAnnee() {
        return annee;
    }

    
    public void setAnnee(Long annee) {
        this.annee = annee;
    }
    
 
    
    
    public Long getId() {
        return id;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Film)) {
            return false;
        }
        Film other = (Film) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return titre;
    }

    public void setAnnee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
