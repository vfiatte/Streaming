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
public class Oiseau extends Animal {
    public int r = 0;
    @Override
   
//    public String position(){
//        return x + " " + y + " " + z;
//    }
    
   
    public String toString() {
        return "Vol jusqu'a : " + super.toString() ;
     }
    @Override
    public void avance(){
         z++;
        if (r == 0){
            r++;
            y= (y+1);
        }
        else { 
            r--;
            y= (y-1);
    }
    
}
}
