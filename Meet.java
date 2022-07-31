
import java.io.InputStreamReader;
import java.io.BufferedReader;
// import java.util.Scanner;
//import java.util.StringBuilder;
//import java.util.IOException;
import dmlp.program.Person;
import dmlp.program.Girl;
import dmlp.program.Man;

public class Meet {
public static void main (String[]args) throws Exception {

System.out.println("\nPour rencontrer des gens sur cette appli, il fait faire partie du CD23.");
StringBuilder a= new StringBuilder("\nVoulez-vous créer un compte (y or n):");
System.out.println(a);
InputStreamReader c =new InputStreamReader(System.in);
BufferedReader d =new BufferedReader (c);
String reader=d.readLine();
//if (reader=="y"){
Person meet1= new Person();
StringBuilder b= new StringBuilder("\nCompte créé !");
System.out.println(b);
//}

System.out.println(a.insert(22,"autre "));
Person meet2= new Person();
System.out.println(b);

System.out.println(a.insert(10,"autre "));
Girl meet3= new Girl();
System.out.println(b);

System.out.println(a.insert(10,"autre "));
Man meet4= new Man();
System.out.println(b);

System.out.println("\nCalcul de compatibilité");
if(meet1.getaAge()-meet2.getaAge()<10) {
  System.out.println(meet1.getaAge());
  System.out.println(meet2.getaAge());
System.out.println((meet1.getaName()).concat(" et ").concat(meet2.getaName()).concat(" sont compatibles\n"));
}
else{
  System.out.println(meet1.getaAge());
  System.out.println(meet2.getaAge());
System.out.println((meet1.getaName()).concat(" et ").concat(meet2.getaName()).concat(" ne sont pas compatibles\n"));
}
}
}
