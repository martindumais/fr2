public class SoftwareRegistration{
public static void main(String[]args){
  System.out.println("\nNombre de Licence autorisé: "+Registration.getnumberOfregistration());
Registration L1= new Registration("RH", 2024);
Registration L2=new Registration("DISC",2025);
Registration L3=new Registration("MDPH",2026);
L1.setaExpirationYear(2030);
System.out.println("\nVotre Licence a été mis à jour avec succès. La licence de "+L1.getaName()+" est valable jusqu'en "+L1.getaExpirationYear()+".");
}
}
