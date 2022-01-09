package de.telekom.sea7;
import java.util.Scanner;

public class Terminaleingabe_scanner {

public static void main(String[] args) {

Scanner scanner = new Scanner (System.in);
while (true) {
System.out.println("Bitte um Eingabe");
String eingabe = scanner.next();
if (eingabe.equals("exit"))
break;
System.out.println("Sie haben " + eingabe + " eingegeben" );



}
System.out.println ("Exit eingegeben, das wars");
scanner.close();
}
}
