public class Gamer{
public Gamer(String name){//Constructeur1
  aName=name;
  aIndex=aId;
System.out.println("\nId: "+this.aId+"\nNom: "+this.aName+"\nArme : "+this.aArm +"\nVie : "+this.aLife);
aId++;
}
public Gamer(String name,String arm){//Constructeur2 : Surcharge !
  aName=name;
  aIndex=aId;
  aArm=arm;
System.out.println("\nId: "+this.aId+"\nNom: "+this.aName+"\nArme : "+this.aArm +"\nVie : "+this.aLife);
aId++;
}
public static void play(Gamer a, Gamer b){//La Méthode qui permet de faire jouer 2 joueurs
String retour ="";
String [] tab={"Inconnu","Ciseaux", "Feuille", "Roche"};//Liste d'armes disponibles pour assignation automatique
System.out.println("\nLes armes disponibles sont: ");
for(String el:tab) System.out.println(el);
System.out.println("\nArmes initiaux:\nArme de "+a.aName+": "+a.aArm);
System.out.println("Arme de "+b.aName+": "+b.aArm);

int i=1;
System.out.println("\nReady to play ! ok"); //Ca joue!
if (a.aArm=="Inconnu")
{System.out.println("\n"+a.aName+" n'a pas d'arme !");
 while(a.aArm=="Inconnu")//Controle et assignation d'armes
{
  System.out.println("\nAssignation d'arme...");
  a.aArm=(tab[i]);
  System.out.println("\nNouveaux équipements:\nArme de "+a.aName+": "+a.aArm);
  System.out.println("Arme de "+b.aName+": "+b.aArm);
  i++;
  //play(a,b);
}}
 if (b.aArm=="Inconnu")
{System.out.println("\nLe second joueur n'a pas d'arme !");
while(b.aArm=="Inconnu")
 {
 System.out.println("\nAssignation d'arme...");
b.aArm=(tab[i]);
System.out.println("\nNouveaux équipements:\nArme de "+a.aName+": "+a.aArm);
System.out.println("Arme de "+b.aName+": "+b.aArm);
i++;
//play(a,b);
}}
 if (a.aArm=="Ciseaux" && b.aArm=="Feuille") //Résultat du jeux
System.out.println("Le premier joueur a gagné");
 if (a.aArm=="Ciseaux" && b.aArm=="Roche")
System.out.println("Le second joueur a gagné");
 if (a.aArm=="Ciseaux" && b.aArm=="Ciseaux"){
System.out.println("Match null: recommencer !");
retour= "rejouer";}
 if (a.aArm=="Roche" && b.aArm=="Feuille")
System.out.println("Le second joueur a gagné");
 if (a.aArm=="Roche" && b.aArm=="Ciseaux")
System.out.println("Le premier joueur a gagné");
 if (a.aArm=="Roche" && b.aArm=="Roche"){
System.out.println("Match null: recommencer !");
retour= "rejouer";}
 if (a.aArm=="Feuille" && b.aArm=="Feuille"){
System.out.println("Match null: recommencer !");
retour= "rejouer";}
 if (a.aArm=="Feuille" && b.aArm=="Ciseaux")
System.out.println("Le second joueur a gagné");
 if (a.aArm=="Feuille" && b.aArm=="Roche")
System.out.println("Le premier joueur a gagné");
if(retour=="rejouer")
{
 System.out.println("\nRejouons!");//Pour les matchs nuls
 a.aArm=(tab[i]);
   b.aArm=(tab[i+1]);
   System.out.println("Arme de "+a.aName+": "+a.aArm);
   System.out.println("Arme de "+b.aName+": "+": "+b.aArm);
   play(a,b);
}
else {System.out.println("\nGame Over !\n");//Fin!
System.out.println("Id: "+a.aIndex+"\tNom: "+a.aName+"\tArme : "+a.aArm +"\tVie : "+a.aLife);
System.out.println(("Id: "+b.aIndex+"\tNom: "+b.aName+"\tArme : "+b.aArm +"\tVie : "+b.aLife).concat(".\n"));
}}

private static int aId=01;
public static int getaId(){return aId;}
private int aIndex; //Encapsultaion des attributs et accesseurs
public int getaIndex(){return this.aIndex;}
private String aName;
public String getaName(){return this.aName;}
private String aLife="100%";
public String getaLife(){return this.aLife;}
public void setaLife(String life){this.aLife=life;}
private String aArm="Inconnu";
public String getaArm(){return this.aArm;}
public void setaArm(String arm){this.aArm=arm;}
}
