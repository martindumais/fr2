import heritage.*;
import heritage.lives.*;

public class Classification {
public static void main (String[]args){
System.out.println("Classe principale : ");
Human H1= new Human();
System.out.println(("Je m'apelle ").concat(H1.who()));
H1.whos();H1.eat();
H1.drink();H1.communicate();H1.procreate();
Dog dogi= new Dog();
dogi.eat();
// Orchid t=new Orchid();
// t.grow();
//Cherry cerisier=new Cherry();


}
}
