package heritage;
public interface Viable{
default void breathe(){
System.out.println("Je respire de l'air");
}
void inhale();
void expire();
}
