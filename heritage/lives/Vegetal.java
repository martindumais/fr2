//import heritage.lives.*;
package heritage.lives;
abstract class Vegetal extends LivingBeing {
    public Vegetal(){
        System.out.println(" Classe abstraite Vegetal: Je suis un végétal");
    }
    public void eat(){
System.out.println("Je me nourris de ");
}
abstract void germinate();
abstract void grow();
// public void flower (){
// System.out.println("Je fleuris");
// }
abstract void dead();
}
