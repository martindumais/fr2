package heritage.livingBeing;
abstract class LivingBeing {

 public String who() {
System.out.println("Classe abstraite : ");
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
