 package heritage;
// import heritage.Vegetal;
public class Cherry extends Vegetal{
public Cherry (int age){
System.out.println("CHERRY: Je suis un cerisier de "+age+"ans.");
}
public void germinate(){
  System.out.println("Je germe dans les climats chaud et froid");
}
public void grow(){
  System.out.println("Je grandis rapidement");
}
public void flower(){
System.out.println("Je fleuris au printemps");
}
public void dead(){
  System.out.println("Je meure par coupe ou après 150 ans");
}
public void procreate(){
System.out.println("Je donne des fruits");
}
public void communicate(){
System.out.println("Je me pare de couleurs et libère des odeurs ");
}
public void eat(){
super.eat();
  System.out.println("micro-organismes de la terre.");
}
}
