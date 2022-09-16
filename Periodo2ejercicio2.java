package Periodo2ejercicio2;
public class Periodo2ejercicio2 {
public static void main(String[] args) {
// programa Java parademostrar switch case
// con tipo de datos primitivos (int)
int day = 5;
String dayString;
// instruccion de switch con tipo de datos int
switch (day) 
{
    case 1: dayString = "Lunes";
            break;
    case 2: dayString = "Martes";
            break;
    case 3: dayString = "Miercoles";
            break;
    case 4: dayString = "Jueves";
            break;
    case 5: dayString = "Viernes";
            break;
    default: dayString = "Dia inválido";
            break;

        }   
        System.out.println(dayString);
    }
}