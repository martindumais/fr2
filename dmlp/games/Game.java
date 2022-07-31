
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;
//import java.util.StringBuilder;
//import java.util.IOException;

public class Game {
public static void main (String[]args) throws Exception{
  InputStreamReader a=new InputStreamReader(System.in);
  BufferedReader b=new BufferedReader(a);
  //BufferedReader c=new BufferedReader(a);

  System.out.println("\nCréer votre 1er joueur: Entrer un nom (obligatoire)"); //et une arme initiale (facultatif)
  String readerG= b.readLine();
  System.out.println("\nVoulez-vous choisir une arme de début de jeu? (y ou n): "); //et une arme initiale (facultatif)
  String response= b.readLine();

  if (response.equals ("y")) {
    System.out.println("Entrer une Arme:");
    String readerA=b.readLine();
    Gamer player1=new Gamer(readerG, readerA);
  }
else{
Gamer player1= new Gamer(readerG);
}
Gamer player1= new Gamer(readerG);

System.out.println("\nCréer votre 2e joueur: Entrer un nom");
 readerG=b.readLine();
System.out.println(readerG);
Gamer player2=new Gamer(readerG);
b.readLine();
  StringBuilder show=new StringBuilder("");
System.out.println("\nListe des joueurs:");

//Gamer player2=new Gamer("Nadia", "Feuille");
// Gamer player3= new Gamer("Marti","Feuille");
// Gamer.play(player2, player3);
Gamer.play(player1, player2);
}
}
