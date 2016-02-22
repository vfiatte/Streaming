/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.interfaces;

/**
 *
 * @author admin
 */
public class Ensemble implements Collection, Affichable {

    public int nbElement = 0;
    int i = 0;
    int a = 0;
            

    Object[] tabObjets = new Object[10];

    @Override
    public void ajouter(Object o) {
        boolean trouve = false;

        while (a < nbElement && trouve == false) {

            if (tabObjets[a] == o) {
                trouve = true;
            } 
            else {
                a++;
            }
        }
        if (trouve == false) {
            tabObjets[nbElement] = o;
            nbElement++;
            System.out.println("L'objet a été ajouté");
        } else {
            System.out.println("L'objet est déjà présent");
        }

    }

    @Override
    public int taille() {
        return nbElement;
    }

    @Override
    public Object getObject(int i) {
        return tabObjets[i];
    }
    
    @Override
    public void afficher(){
         for (int i = 0; i<nbElement; i++){
            System.out.println(tabObjets[i]);
    }
}
}
