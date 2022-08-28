//import heritage.lives.*;
package heritage.lives;
//import heritage.LivingBeing;


abstract class Animal extends LivingBeing { //extends LivingBeing
  //--> classe abstraite sans méthode abstraite

 public Animal() {
System.out.println(" Classe abstraite Animal : Je suis un animal");
}
public void eat(){
System.out.println("Je mange");
}
//abstract void move();
protected String aSpacimen;
}
