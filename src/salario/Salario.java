/*
 *Un obrero necesita calcular su salario semanal, 
el cual se obtiene de la sig. manera:
•Si trabaja 40 horas o menos se le paga $5000 por hora
•Si trabaja más de 40 horas se le paga $5000 por cada 
una de las primeras 40 horas y un aumento del 20% por cada hora extra.
 */
package salario;

import java.util.Scanner;

/**
 *
 * josselyne ester chilito galindez cod: 20201187434
 */
public class Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=  new Scanner(System.in);
        int horas,totalpagar,horasex;
        System.out.println("ingre sus horas trabajas");
        horas=entrada.nextInt();
        
        if(horas>=40){
            totalpagar=40*5000+(horas-40)*6000;
            /*100 es el 20%
            1000+5000=6000
            */
            
        }
        else {
           totalpagar=horas*5000;
          
        }
           
        System.out.println("su salario seria  :" + totalpagar);
    }
    
}
