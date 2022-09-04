
import heritage.*;

public class Classification {
public static void main (String[]args){
System.out.println(" \n****** Classe principale : Bienvenue dans le programme de la Classifiaction ******");
Dog dogi= new Dog();
Orchid t=new Orchid();
Cherry cerisier=new Cherry(5);
BergerAllemand Popy = new BergerAllemand();
Human H1= new Human();
Biteable[] espece = {new Dog(), new Lion()};
Viable[] genre = {new Human(), new Human()};
System.out.println(("Je m'apelle ").concat(H1.who()));
// System.out.println("Je suis "+ H1.who());
//System.out.println(H1.who());
H1.eat();
H1.drink();
H1.communicate();
H1.procreate();
H1.expire();
dogi.eat();
t.grow();
 Popy.eat();
 Popy.procreate();
dogi.procreate();
for(Biteable e: espece) e.cry();
for(Viable e : genre) e.inhale();
}
}
