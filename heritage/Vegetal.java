 package heritage;
// import heritage.LivingBeing;
public abstract class Vegetal extends LivingBeing {
    public Vegetal(){
        System.out.println(" Classe abstraite Vegetal: Je suis un végétal");
    }
    public void eat(){
System.out.println("Je me nourris de ");
}
public abstract void germinate();
public abstract void grow();
// public void flower (){
// System.out.println("Je fleuris");
// }
public abstract void dead();
}
