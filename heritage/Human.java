 package heritage;
// import heritage.*;
public class Human extends Animal implements Viable{//étend la classe abstraite Animal et implémente l'interface Viable

public Human(){
  aNom="Martin";
System.out.println(("HUMAN : Je suis un homme. je m'appelle ").concat(aNom));
}
public void eat(){
super.eat();
  System.out.println("de la viande");
}
public void communicate(){
System.out.println("Je parle");
}
public void procreate(){
System.out.println("Je fais des enfants");
}
public void inhale(){System.out.println("J'inspire de l'O2");}
public void expire(){System.out.println("J'expire du CO2");}
}
