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
public abstract class Animal {
    
    abstract public void avance();
//    private static int nbInstance = 0;
    int x=0, y=0, z=0;
    
    public void avance(int n) {
        for(int i = 0; i<n; i++){
            avance();
        }
    }
     
//  public String position(){
//     return x + " " + y;
//  }
  
  
     public String toString(){
            return this.getClass().getSimpleName() + " " + x + " " + y + " " + z;
        }
}

//    public Animal(){
//        nbInstance++;
//    }
//    
//    public static int getNbInstance(){
//        return nbInstance;
    
//    public void changePosition(){
//        y++;
//    }
//        public void avance(int p){
//            y = y + p;
//        }    
//        public void avance(){
//            y++;
//        }    
        
//        public void recule(int p) {
//            y = y - p;
//        }
//        public void recule() {
//            y--;
//        }
//        
//        public void gauche(int t) {
//            x = x - t;
//        }
//        public void gauche() {
//            x--;
//        }
//        
//        public void droite(int t) {
//            x = x + t;
//        }
//        public void droite() {
//            x++;
//        }
        
       
        
     
        
    
//    public Animal(){
//        System.out.println("Animal()");
//    }
//    
//    public Animal(int p){
//        System.out.println("Animal(int p)");
//    }
//    
//    public Animal(String p){
//        System.out.println("Animal(String p)");
//    }
    
    

