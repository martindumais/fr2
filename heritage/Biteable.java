 package heritage;
public interface Biteable{
default void Bite(){ //méthode par défaut
System.out.println(" Interface Biteable: Je suis cabpable de mordre ! "); 
}
void cry();
}
