
package poltergeist.antipattern;


public class PoltergeistAntipattern {

    /*Diseñamos unn programa para sumar
    2 y 3 e imprimir el resultado. 
    Tenemos dos formas de hacerlo, mediante una funcion
    y mediante una operacion basica de java*/
    
    /*Una forma algo lenta pero mas funcional
    de hacerlo seria con el siguiente void: */
    static void opSum(int x,int y){
        int z;
        z=x+y;
        System.out.println("La suma es"+z);
    }
    public static void main(String[] args) {
        int x,y;
        x=2;
        y=3;
        
        /*Una forma mas rapida y sencilla de hacerlo es 
        simplemente realizando la operacion suma en un
        System.out.println*/
        System.out.println("La suma es"+2+3);
        opSum(x,y);
    }
    
    /*Si bien, ambas formas daran el mismo resultado, 
    uno es más sencillo de escribir y rapido de ejecutar.
    Si no es necesario usar esa función en otra parte del codigo, 
    entonces no es importante escribirla. Esto es lo que sucede en un
    poltergeist, debe pensarte si un proceso se ejecuta varias veces
    para implementarlo en un metodo, o si simplemente esta operacion es
    necesaria una unica vez.*/
}
