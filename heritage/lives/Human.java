package heritage.lives;
public class Human extends Animal{//extends Animal implements Viable

public Human(){
System.out.println("HUMAN : Je suis un homme");
//aNom="Martin";
}
public void eat(){
//super.eat();
  System.out.println("de la viande");
}
public void communicate(){
System.out.println("Je communique");
}
public void procreate(){
System.out.println("Je procrée");
}
public void inhale(){System.out.println("J'inspire");}
public void expire(){System.out.println("J'expire");}
}
