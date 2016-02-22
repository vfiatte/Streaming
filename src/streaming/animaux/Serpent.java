/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.animaux;

/**
 *
 * @author admin
 */

public class Serpent extends Animal {
    public int r=0;
    
           

    
    @Override
    public String toString(){
        return "Le serpent rampe jusqu'a" + super.toString();
}
    @Override
    public void avance(){
        z++;
        if (r == 0){
            r++;
            x++;
        }
        else { 
            r--;
            x--;
    
        
    }

}
    }