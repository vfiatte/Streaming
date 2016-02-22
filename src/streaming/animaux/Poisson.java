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
public class Poisson extends Animal {

  
   
    
  static{
    System.out.print("bloc static");
           
}
  
  
    
  
    public String toString() {
        return "Nage jusqu'a " + super.toString();
    }
   
    

    @Override
    public void avance(){
        z++;
        y--;
    }
    
}


