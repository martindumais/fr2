package heritage;
//import heritage.*; //import obligatoire de la classe qu'il étend

public abstract class Animal extends LivingBeing { // classe abstraite sans méthode abstraite

 public Animal() {
System.out.println(" Classe abstraite Animal : Je suis un animal");
}
public void eat(){
System.out.println("Je mange");
}
//abstract void move();
protected String aSpacimen;
}
