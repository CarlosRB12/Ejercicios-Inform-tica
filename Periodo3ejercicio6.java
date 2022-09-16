package Periodo3ejercicio6;
import java.util.Scanner;
public class Periodo3ejercicio6 {
public static void main(String[] args){
Scanner keyboard = new Scanner(System.in);
int password;
do {
System.out.print("Introduzca la contraseña numerica: ");
password = keyboard.nextInt();
if (password != 12345)
System.out.println("La contraseña introducida no es valida");
}
while (password !=12345);
}
}