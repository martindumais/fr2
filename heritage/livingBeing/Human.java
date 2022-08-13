package heritage.livingBeing;
public class Human extends Animal{

public Human(){
System.out.println("HUMAN : Je suis un homme");
aNom="Martin";
}
public void eat(){
super.eat();
  System.out.println("de la viande");
}
public void communicate(){
System.out.println("Je communique");
}
public void procreate(){
System.out.println("Je procrée");
}
}
