 package heritage;
public abstract class LivingBeing {

 public LivingBeing() {
System.out.println("\n Classe abstraite LivingBeing: je suis un être vivant");
   
}
 public String who() {
    return aNom;
}

public void drink(){
System.out.println("Je bois");
}

public abstract void eat();
public abstract void communicate();
public abstract void procreate ();

protected String aNom;
protected String aAlimentation;
protected int aAge;
protected int EsperanceVie;
}
