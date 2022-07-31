import java.util.*;
import java.io.*;
//import java.io.InputStreamReader;
//import java.util.StringBuilder;
import dmlp.program.CalendarMonth;

public class Calendar{
public static void main(String[]args) {
  String c="\n Je suis un Calendrier";
  String c1="inachevé";
  String c2= "\n Au  revoir          Utilisateur  !  ";
System.out.println("Entrer le chiffre du mois que voulez afficher ?");
try{
BufferedReader myReader=new BufferedReader(new InputStreamReader(System.in));
String choice= myReader.readLine();
System.out.println("Vous avez choisi : ".concat(choice));
System.out.println("Retaper votre choix");
Scanner myScanner=new Scanner(System.in);
int choix=myScanner.nextInt();
System.out.println("Vous avez bien choisi : "+(choix));
CalendarMonth jan=new CalendarMonth(choix);
}
catch(IOException e){
  System.out.println("Mauvais chiffre !");
}
catch (InputMismatchException e){
  System.out.println("Vous avez rentré des données non valides: "+e.getMessage());
}
catch (Exception e){
  System.out.println("Erreur détéctée!");
}
finally{
System.out.println(("\nAttention:").concat(c.replace("un calendrier","").trim()).concat(" ").concat(c1.toUpperCase()).concat("."));
System.out.println(("\nAttention:").concat(c.replace("un calendrier","").trim()).concat(" ").concat(c1).concat(".").length()+" caractères dans la chaine ci-dessus.");
System.out.println(c2.toUpperCase());System.out.println(c2.toLowerCase());System.out.println(c2.trim());
System.out.println(("\nLe caractère 28 de la chaines est: ")+("Attention: ").concat(c.replace("un calendrier","").trim()).concat(" ").concat(c1).concat(".").charAt(27));
System.out.println(c2.substring(22,33));//substring -> (noDebut-1,noFin)=>par rapport au curseur. \n -> est considéré comme un caractère!
System.out.println(c1.substring(1,1));System.out.println(c1.substring(1,2));System.out.println(c1.substring(1,3));
System.out.println(c1==c2);System.out.println(c1.equals(c2));
System.out.println(c1.compareTo(c2));System.out.println(c1.compareTo("inachevé"));
}
}}
