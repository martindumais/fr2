//import heritage.lives;
package heritage.lives;
abstract class LivingBeing {

 public LivingBeing() {
System.out.println("\n Classe abstraite LivingBeing: je suis un être vivant");
   
}
 public String who() {
//System.out.println(" Classe abstraite LivingBeing: je suis un être vivant");
    return aNom;
}

abstract void eat();

public void drink(){
System.out.println("Je bois");
}

abstract public void communicate();

abstract public void procreate ();

protected String aNom;
protected String aAlimentation;
protected int aAge;
protected int EsperanceVie;
}
