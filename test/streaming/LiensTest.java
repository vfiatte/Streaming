/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import streaming.entity.Film;
import streaming.entity.Genre;
import streaming.entity.Pays;
import streaming.entity.Realisateur;
import streaming.service.DataBaseService;
import streaming.service.episodeService;
import streaming.service.filmService;
import streaming.service.genreService;
import streaming.service.lienService;
import streaming.service.paysService;
import streaming.service.realisateurService;
import streaming.service.saisonService;
import streaming.service.serieService;

/**
 *
 * @author admin
 */
public class LiensTest {

    private DataBaseService dataBaseService = new DataBaseService();
    private episodeService episodeService = new episodeService();
    private filmService filmService = new filmService();
    private genreService genreService = new genreService();
    private lienService lienService = new lienService();
    private paysService paysService = new paysService();
    private realisateurService realisateurService = new realisateurService();
    private saisonService saisonService = new saisonService();
    private serieService serieService = new serieService();

//    @Before
    public void initialisation() {
        dataBaseService.toutSupprimer();

        Genre g1 = new Genre(1L, "Action");
        Genre g2 = new Genre(2L, "Fantastique");
        Genre g3 = new Genre(3L, "Policier");
        Genre g4 = new Genre(4L, "Romance");
        Genre g5 = new Genre(5L, "Animation");
        Genre g6 = new Genre(6L, "Comedie");
        genreService.ajouter(g2);
        genreService.ajouter(g3);
        genreService.ajouter(g4);
        genreService.ajouter(g5);
        genreService.ajouter(g6);
        genreService.ajouter(g1);

        Pays p1 = new Pays(1L, "France");
        Pays p2 = new Pays(2L, "USA");
        Pays p3 = new Pays(3L, "UK");
        Pays p4 = new Pays(4L, "Espagne");
        Pays p5 = new Pays(5L, "Nouvelle-Zelande");
        paysService.ajouter(p1);
        paysService.ajouter(p2);
        paysService.ajouter(p3);
        paysService.ajouter(p4);
        paysService.ajouter(p5);

        Realisateur r1 = new Realisateur(1L, "Cohen", "Joel");
        Realisateur r2 = new Realisateur(2L, "Cohen", "Ethan");
        Realisateur r3 = new Realisateur(3L, "Jackson", "Peter");
        Realisateur r4 = new Realisateur(4L, "Tarantino", "Quentin");
        Realisateur r5 = new Realisateur(5L, "Maiwenn", null);
        realisateurService.ajouter(r1);
        realisateurService.ajouter(r2);
        realisateurService.ajouter(r3);
        realisateurService.ajouter(r4);
        realisateurService.ajouter(r5);

        Film f1 = new Film(1L, "Django Unchained", 2012L);
        f1.setGenre(g1);
        f1.setPays(p2);
        f1.getRealisateur().add(r4);
        g1.getFilmCrees().add(f1);
        p2.getFilmCrees().add(f1);
        r4.getFilmCrees().add(f1);

        filmService.ajouter(f1);

        Film f2 = new Film(2L, "Kill Bill", 2003L);
        f2.setGenre(g1);
        f2.setPays(p2);
        f2.getRealisateur().add(r4);
        g1.getFilmCrees().add(f2);
        p2.getFilmCrees().add(f2);
        r4.getFilmCrees().add(f2);
        filmService.ajouter(f2);

        Film f3 = new Film(3L, "Kill Bill 2", 2004L);
        f3.setGenre(g1);
        f3.setPays(p2);
        f3.getRealisateur().add(r4);
        g1.getFilmCrees().add(f3);
        p2.getFilmCrees().add(f3);
        r4.getFilmCrees().add(f3);
        filmService.ajouter(f3);

        Film f4 = new Film(4L, "Jackie Brown", 1997L);
        f4.setGenre(g1);
        f4.setPays(p2);
        f4.getRealisateur().add(r4);
        g1.getFilmCrees().add(f4);
        p1.getFilmCrees().add(f4);
        r4.getFilmCrees().add(f4);
        filmService.ajouter(f4);

        Film f5 = new Film(5L, "Sin City", 2005L);
        f5.setGenre(g2);
        f5.setPays(p2);
        f5.getRealisateur().add(r4);
        g2.getFilmCrees().add(f5);
        p2.getFilmCrees().add(f5);
        r4.getFilmCrees().add(f5);
        filmService.ajouter(f5);

        Film f6 = new Film(6L, "Bad Taste", 1987L);
        f6.setGenre(g2);
        f6.setPays(p2);
        f6.getRealisateur().add(r3);
        g2.getFilmCrees().add(f6);
        p5.getFilmCrees().add(f6);
        r3.getFilmCrees().add(f6);
        filmService.ajouter(f6);

        Film f7 = new Film(7L, "Braindead", 1992L);
        f7.setGenre(g2);
        f7.setPays(p2);
        f7.getRealisateur().add(r3);
        g2.getFilmCrees().add(f7);
        p5.getFilmCrees().add(f7);
        r3.getFilmCrees().add(f7);
        filmService.ajouter(f7);

        Film f8 = new Film(8L, "Le Hobbit", 2015L);
        f8.setGenre(g2);
        f8.setPays(p2);
        f8.getRealisateur().add(r3);
        g2.getFilmCrees().add(f8);
        p5.getFilmCrees().add(f8);
        r3.getFilmCrees().add(f8);
        filmService.ajouter(f8);

        Film f9 = new Film(9L, "Polisse", 2011L);
        f9.setGenre(g3);
        f9.setPays(p1);
        f9.getRealisateur().add(r5);
        g3.getFilmCrees().add(f9);
        p1.getFilmCrees().add(f9);
        r5.getFilmCrees().add(f9);
        filmService.ajouter(f9);

        Film f10 = new Film(10L, "Big Lebowski", 1998L);
        f10.setGenre(g6);
        f10.setPays(p2);
        f10.getRealisateur().add(r1);
        f10.getRealisateur().add(r2);
        g2.getFilmCrees().add(f10);
        p5.getFilmCrees().add(f10);
        r1.getFilmCrees().add(f10);
        r2.getFilmCrees().add(f10);
        filmService.ajouter(f10);

        Film f11 = new Film(11L, "Ave Cesar", 2016L);
        f11.setGenre(g6);
        f11.setPays(p2);
        f11.getRealisateur().add(r1);
        f11.getRealisateur().add(r2);
        g6.getFilmCrees().add(f11);
        p5.getFilmCrees().add(f11);
        r1.getFilmCrees().add(f11);
        r2.getFilmCrees().add(f11);
        filmService.ajouter(f11);

    }

//    @Test
    public void filmDuGenreAction() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();

        for (Film f : em.find(Genre.class, 1L).getFilmCrees()) {

            System.out.println(f);
        }

    }

//    @Test 
    public void filmOrdreChrono() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT f.titre FROM Film f ORDER BY f.annee ASC").getResultList());
    }

//    @Test
    public void genreNombre() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Assert.assertEquals(6, em.createQuery("SELECT g FROM Genre g").getResultList().size());
    }

//    @Test
    public void filmsFrancais() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Assert.assertEquals(1, em.createQuery("SELECT f FROM Film f  JOIN f.pays p WHERE p.nom = 'France' ").getResultList().size());
    }

//    @Test
    public void genreNombre2() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        Long nbGenre = (Long) em.createQuery("SELECT COUNT(g) FROM Genre g").getSingleResult();
        Assert.assertTrue(nbGenre == 6L);
    }

//    @Test 
    public void filmsFantasqtiques() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT f FROM Film f JOIN f.genre g WHERE g.nom = 'Fantastique' ORDER BY f.titre ASC").getResultList());
    }

//    @Test
    public void filmsFantastiqueSansJoin() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT f FROM Film f WHERE f.genre.nom = 'Fantastique' ORDER BY f.titre").getResultList());
    }

//    @Test
    public void filmActionCohen() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT f FROM Film f JOIN f.genre g JOIN f.realisateur r WHERE r.nom ='Cohen' AND g.nom = 'Comedie' ORDER BY f.annee ").getResultList());
    }

//    @Test
    public void tousSaufAction() {

        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT f FROM Film f JOIN f.genre g WHERE g.nom <> 'Action'").getResultList());
    }

//    @Test
    public void nbFilmNzSansFantastique() {
        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT COUNT(f) FROM Film f JOIN f.genre g JOIN f.pays p WHERE p.nom = 'Nouvelle Zelande' AND g.nom <> 'Fantastique' ").getResultList());
    }

//    @Test
    public void filmFantastiquePeter() {

        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT f FROM Film f JOIN f.genre g JOIN f.realisateur r WHERE g.nom = 'Fantastique' AND r.prenom = 'Peter'").getResultList());

    }
    
//    @Test
    public void tousFilmsCohen() {

        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT f.titre FROM Film f WHERE f.id IN (SELECT f.id FROM Film f JOIN f.realisateur r WHERE r.prenom = 'Ethan') AND f.id IN (SELECT f.id FROM Film f JOIN f.realisateur r WHERE r.prenom = 'Ethan') ").getResultList());

    }
//    @Test
    public void filmplusAncienPeter() {

        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT f.titre FROM Film f WHERE f.annee IN (SELECT MIN(f.annee) FROM Film f JOIN f.realisateur r WHERE r.nom = 'Jackson')").getParameter(name, type));

    }
    
//    @Test
    public void moyenneAnnee() {

        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        System.out.println(em.createQuery("SELECT AVG(f.annee) FROM Film f").getSingleResult());

    }
    @Test
    public void nbFilmRealisésParReal() {

        EntityManager em = Persistence.createEntityManagerFactory("StreamingPU").createEntityManager();
        List<Object[]> o = em.createQuery("SELECT COUNT(f), r FROM Film f JOIN f.realisateur r GROUP BY r ORDER BY COUNT(f)").getResultList();
        for (Object i[] : o ){
            System.out.println(((Realisateur)i[1]).getPrenom() + " " + ((Realisateur)i[1]).getNom() + " " + "a réalisé" + " " + i[0] + " film(s)");
        }
            
        

    }
    
}
