package dmlp.program;
public class CalendarMonth{
public CalendarMonth(int monthNumber){
switch(monthNumber){
case 1:System.out.println("Janvier");
month31();
break;
case 2:System.out.println("Février");
fev28();
break;
case 3:System.out.println("Mars");
month31();
break;
case 4:System.out.println("Avril");
month30();
break;
case 5:System.out.println("Mai");
month31();
break;
case 6:System.out.println("Juin");
month30();
break;
case 7:System.out.println("Juillet");
month31();
break;
case 8:System.out.println("Aout");
month31();
break;
case 9:System.out.println("Septembre");
month30();
break;
case 10:System.out.println("Octobre");
month31();
break;
case 11:System.out.println("Novembre");
month30();
break;
case 12:System.out.println("Décembre");
month31();
break;
default: System.out.println("Votre mois n'existe pas :)");
}
}
private void month31(){
  int[][] month=new int [6][7];
  int k=1;int i=0;int j=0;
  for (k=1; k<32;k++){System.out.println(month[i][j]=k);}
}
private void month30(){
  int[][] month=new int [6][7];
  int k=1;int i=0;int j=0;
  for (k=1; k<31;k++){System.out.println(month[i][j]=k);}
}
private void fev28(){
  int[][] month=new int [6][7];
  int k=1;int i=0;int j=0;
  for (k=1; k<29;k++){System.out.println(month[i][j]=k);}
}
private void fev29(){
  int[][] month=new int [6][7];
  int k=1;int i=0;int j=0;
  for (k=1; k<30;k++){System.out.println(month[i][j]=k);}
}
private int[][] Month=new int [6][7];
private int []tab={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
private int aDate=1;
private String aDay="Dimanche";
private String aMonth="Janvier";
private int aYear=2022;
}
