/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;
import java.util.Calendar;

/**
 *
 * @author Raúl Classe de funcions pròpies utils.
 */
public class MyUtils {

    /**
     *
     * @param cadena String cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        if (cadena == null) {
            return null;
        }

        StringBuilder resultat = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            resultat.append(cadena.charAt(i));
        }
        return resultat.toString();
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int day, int month, int year) {
        // Obtiene la fecha actual
        Calendar hoy = Calendar.getInstance();

        // Validación de fecha
        if (year > hoy.get(Calendar.YEAR) || year < 0) {
            return -2; // Fecha inválida
        }

        if (month < 1 || month > 12) {
            return -2; // Fecha inválida
        }

        if (day < 1 || day > 31) {
            return -2; // Fecha inválida
        }

        // Crea una instancia de la fecha de nacimiento
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(year, month - 1, day);

        // Verifica que la fecha de nacimiento sea anterior a la fecha actual
        if (fechaNacimiento.after(hoy)) {
            return -2; // Fecha inválida
        }

        // Calcula la edad de la persona
        int edad = hoy.get(Calendar.YEAR) - year;
        if (fechaNacimiento.get(Calendar.MONTH) > hoy.get(Calendar.MONTH)
                || (fechaNacimiento.get(Calendar.MONTH) == hoy.get(Calendar.MONTH)
                && fechaNacimiento.get(Calendar.DATE) > hoy.get(Calendar.DATE))) {
            edad--; // Ajusta la edad si aún no ha cumplido años en este año
        }

        // Verifica que la edad no sea mayor a 150 años
        if (edad > 150) {
            return -1; // Edad mayor a 150 años
        }

        return edad;
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static int factorial(int numero) {
        int factorial = 1;
        if (numero < 0) {
            return -1; // si el número es negativo -1
        } else if (numero == 0) {
            return 1; // devuelve 1
        } else {
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
