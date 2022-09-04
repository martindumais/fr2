 package heritage;
public interface Viable{
default void breathe(){ //méthode par défaut
System.out.println(" Interface Viable: Je respire, donc je vis"); 
}
void inhale();
void expire();
}
