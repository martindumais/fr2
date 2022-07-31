public class Registration{
public Registration(String name, int date){//la méthode de classe principale porte le meme nom que la classe et devient un type de donnée à utiliser dans l'appli
  this.aName=name;
  this.aExpirationYear=date;
//System.out.println("\nNombre de Licence autorisé: "+this.numberOfRegistration);
if(numberOfRegistration>0){
System.out.println("\nLa licence de "+this.aName+" est valable jusqu'en "+this.aExpirationYear+".");
numberOfRegistration--;
System.out.println("Nombre de Licence restant: "+this.numberOfRegistration);
}
else{System.out.println("\n Echec de l'enregistrement de "+this.aName+". Vous avez épuisé votre nombre de licences.");}
//return;
}
//déclaration d'attributs et de variables de classe, et création d'accesseurs (méthodes de classes)
private int aExpirationYear=2023;//attribut1 : variable d'instance disponible personnellement pour chaque instance
public void setaExpirationYear(int date){this.aExpirationYear=date;}//setter attribut1
public int getaExpirationYear(){return this.aExpirationYear;}//getter attribut1
private String aName;//attribut2
public void setaName(String name){this.aName=name;} //setter attribut2
public String getaName(){return this.aName;}//getter attribut2
private static int numberOfRegistration=2;//variable de classe: variable unique disponible communément pour toutes les instances
public static int getnumberOfregistration(){return numberOfRegistration;}//getter variable de classe
//private static int validNumberRegistration=2;
}
