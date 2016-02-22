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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author admin
 */
@Entity
public class Episode implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long numEpisode;
    private String titre;

    @ManyToOne
    @JoinColumn(name = "SAISON_ID")
    private Saison saison;
    
    @OneToMany(mappedBy = "episode")
    private List<Lien> lienCrees = new ArrayList<Lien>();

    public Episode(){
        
    }
    
    public Episode(Long id, Long numEpisode, String titre, Saison saison) {
        this.id = id;
        this.numEpisode = numEpisode;
        this.titre = titre;
        this.saison = saison;
    }

    
    
    public Long getNumEpisode() {
        return numEpisode;
    }

    public void setNumEpisode(Long numEpisode) {
        this.numEpisode = numEpisode;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Saison getSaison() {
        return saison;
    }

    public void setSaison(Saison saison) {
        this.saison = saison;
    }

    public List<Lien> getLienCrees() {
        return lienCrees;
    }

    public void setLienCrees(List<Lien> lienCrees) {
        this.lienCrees = lienCrees;
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
        if (!(object instanceof Episode)) {
            return false;
        }
        Episode other = (Episode) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "streaming.entity.Episode[ id=" + id + " ]";
    }
    
}
