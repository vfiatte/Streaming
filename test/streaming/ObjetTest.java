/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import java.util.Collection;
import streaming.animaux.Animal;
import org.junit.Test;
import static org.junit.Assert.*;
import streaming.animaux.Oiseau;
import streaming.animaux.Poisson;
import streaming.animaux.Serpent;
import streaming.animaux.Terminal;
import static streaming.animaux.Terminal.creation;
import streaming.enumerations.TypeUtil;
import streaming.interfaces.Ensemble;
import streaming.interfaces.Liste;

/**
 *
 * @author admin
 */
public class ObjetTest {

//    @Test
    public void test1() {
//    Animal p = new Poisson();
//    p.avance();
//    System.out.println(p);

        Oiseau o2 = new Oiseau();
        o2.avance();
        o2.avance();
        o2.avance();
        o2.avance();

        System.out.println(o2);

        Serpent s1 = new Serpent();
        s1.avance();
        s1.avance();
        System.out.println(s1);

//    Animal a = new Animal();
//    Animal a1 = new Animal();
//    new Animal();
//    new Animal();
//    
//    a.avance(8);
////    a.gauche();
////    System.out.println(a);
//    System.out.println(a);
    }

//    @Test
    public void test2() {
        Animal[] tab = new Animal[5];
        tab[0] = new Oiseau();
        tab[1] = new Oiseau();
        tab[2] = new Serpent();
        tab[3] = new Poisson();
        tab[4] = new Serpent();

        tab[2].avance(9);

        for (Animal a : tab) {
            a.avance(5);
            System.out.println(a);
        }

    }

//@Test
    public void testPoisson() {
        Poisson p = new Poisson();
        p.avance();
        System.out.println(p);
    }

    @Test
    public void ensembleTest() {
        Ensemble e = new Ensemble();
        Liste l = new Liste();
        Object o = new Object();
        Object p = "on dechire tout";
        Object t = "on est des pro de java";
       
        
        e.ajouter(o);
        e.ajouter(t);
        e.ajouter(p);
        
        e.afficher();
        
        l.ajouter(o);
        l.afficher();
        
        System.out.println(e.taille());

    }
    
    public void testUtil(){
        TypeUtil tu = TypeUtil.MODERATEUR;
        
        if (tu == TypeUtil.MODERATEUR){
            System.err.println("Modérateur");
        }
    }
}

