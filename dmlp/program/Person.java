package dmlp.program; //import des packages
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Person{// la classe

public Person() {//Constructeur1
  aIndex=aId;
  InputStreamReader a=new InputStreamReader(System.in);
  BufferedReader b=new BufferedReader(a);
System.out.println("Quel est ton nom ? ");
try{
   aName=b.readLine();
System.out.println("Quel est ta date de naissance ? ");
 aBirthDate=b.readLine();
    int Age=18;
System.out.println("Q'est ce qui fait ton charme ?  ");
 aCharm=b.readLine();
System.out.println("Quels qui ce qui constitue ton atout ? ");
 aAssets=b.readLine();
}
catch(IOException e){
  System.out.println("L'opération n'a pas pu avoir lieu : "+e.getMessage());
}
finally{
System.out.println("\nUtilisateur créé ! \nId: "+this.aIndex+"\nNom: "+aName+"\nDate de naissance: "+aBirthDate+"\nCharme : "+aCharm +"\nAtouts : "+aAssets);
aId++;
}
}

// public Gamer(String name,String arm){//Constructeur2 : Surcharge !
//   aName=name;
//   aIndex=aId;
//   aArm=arm;
// System.out.println("\nId: "+this.aId+"\nNom: "+this.aName+"\nArme : "+this.aArm +"\nVie : "+this.aLife);
// aId++;
// }

// public static void play(Gamer a, Gamer b){//La Méthode qui permet de faire jouer 2 joueurs
// String retour ="";
// String [] tab={"Inconnu","Ciseaux", "Feuille", "Roche"};//Liste d'armes disponibles pour assignation automatique
// System.out.println("\nLes armes disponibles sont: ");
// for(String el:tab) System.out.println(el);
// System.out.println("\nArmes initiaux:\nArme de "+a.aName+": "+a.aArm);
// System.out.println("Arme de "+b.aName+": "+b.aArm);
//
// int i=1;
// System.out.println("\nReady to play ! ok"); //Ca joue!
// if (a.aArm=="Inconnu")
// {System.out.println("\n"+a.aName+" n'a pas d'arme !");
//  while(a.aArm=="Inconnu")//Controle et assignation d'armes
// {
//   System.out.println("\nAssignation d'arme...");
//   a.aArm=(tab[i]);
//   System.out.println("\nNouveaux équipements:\nArme de "+a.aName+": "+a.aArm);
//   System.out.println("Arme de "+b.aName+": "+b.aArm);
//   i++;
//   //play(a,b);
// }}
//  if (b.aArm=="Inconnu")
// {System.out.println("\nLe second joueur n'a pas d'arme !");
// while(b.aArm=="Inconnu")
//  {
//  System.out.println("\nAssignation d'arme...");
// b.aArm=(tab[i]);
// System.out.println("\nNouveaux équipements:\nArme de "+a.aName+": "+a.aArm);
// System.out.println("Arme de "+b.aName+": "+b.aArm);
// i++;
// //play(a,b);
// }}
//  if (a.aArm=="Ciseaux" && b.aArm=="Feuille") //Résultat du jeux
// System.out.println("Le premier joueur a gagné");
//  if (a.aArm=="Ciseaux" && b.aArm=="Roche")
// System.out.println("Le second joueur a gagné");
//  if (a.aArm=="Ciseaux" && b.aArm=="Ciseaux"){
// System.out.println("Match null: recommencer !");
// retour= "rejouer";}
//  if (a.aArm=="Roche" && b.aArm=="Feuille")
// System.out.println("Le second joueur a gagné");
//  if (a.aArm=="Roche" && b.aArm=="Ciseaux")
// System.out.println("Le premier joueur a gagné");
//  if (a.aArm=="Roche" && b.aArm=="Roche"){
// System.out.println("Match null: recommencer !");
// retour= "rejouer";}
//  if (a.aArm=="Feuille" && b.aArm=="Feuille"){
// System.out.println("Match null: recommencer !");
// retour= "rejouer";}
//  if (a.aArm=="Feuille" && b.aArm=="Ciseaux")
// System.out.println("Le second joueur a gagné");
//  if (a.aArm=="Feuille" && b.aArm=="Roche")
// System.out.println("Le premier joueur a gagné");
// if(retour=="rejouer")
// {
//  System.out.println("\nRejouons!");//Pour les matchs nuls
//  a.aArm=(tab[i]);
//    b.aArm=(tab[i+1]);
//    System.out.println("Arme de "+a.aName+": "+a.aArm);
//    System.out.println("Arme de "+b.aName+": "+": "+b.aArm);
//    play(a,b);
// }
// else {System.out.println("\nGame Over !\n");//Fin!
// System.out.println("Id: "+a.aIndex+"\tNom: "+a.aName+"\tArme : "+a.aArm +"\tVie : "+a.aLife);
// System.out.println(("Id: "+b.aIndex+"\tNom: "+b.aName+"\tArme : "+b.aArm +"\tVie : "+b.aLife).concat(".\n"));
// }}

private static int aId=01;
public static int getaId(){return aId;}
protected int aIndex; //Encapsultaion des attributs et accesseurs
protected int getaIndex(){return this.aIndex;}
protected int aAge=18;
public int getaAge(){return this.aAge;}
protected String aName="A definir! ";
public String getaName(){return this.aName;}
protected String aBirthDate="18/01/2004";
protected String aAssets;
public String getaLife(){return this.aAssets;}
public void setaLife(String assets){this.aAssets=assets;}
protected String aCharm;
public String getaCharm(){return this.aCharm;}
public void setaCharm(String charm){this.aCharm=charm;}
}
