package Periodo3ejercicio7;
import java.util.Scanner;

public class Periodo3ejercicio7 {

public static void main(String[] args) {

System.out.print("Unidad3_Semana1_Clase3_Ejercicio1");

Scanner entrada = new Scanner (System.in);
double nota;

System.out.print("Ingresar un valor entre 1 y 10");
nota=entrada.nextDouble();

while (nota<1 | nota>10)
{
System.out.print("Lo siento mucho pero el valor proporcionado no es correcto");
nota=entrada.nextDouble();
}

}

}
