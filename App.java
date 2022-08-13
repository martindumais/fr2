import heritage.livingBeing.*;
public class App {
public static void main (String[]args){
System.out.println("Classe principale : ");
Human H1= new Human();
System.out.println(("Je m'apelle ").concat(H1.who()));
H1.eat();
H1.drink();H1.communicate();H1.procreate();


}
}
