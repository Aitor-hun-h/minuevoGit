/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import io.Consola;
import io.Teclado;
import java.util.Random;

/**
 *
 * @author aitor
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int indice, fallos=0;
        char letra;
        String respuesta;
        
        Figura figura= new Figura();
        Palabras palabras= new Palabras();
        Random rnd=new Random();
        
        indice=rnd.nextInt(palabras.devuelveCuantasPalabrasTiene());
        
        Consola.escribir("Hola, este es el juego del ahorcado");
        for(int i=0;i<15;i++){
            Consola.escribir(figura.getFigura()[i]);
        }
        Consola.escribir("Si no quieres terminar así adivina la siguiente palabra");
        
        Consola.escribir("PALABRA:" + palabras.devuelvePalabra(indice));
        
        do{
            Consola.escribir("Ingresa una letra (solo puede ser consonante)");
            letra=Teclado.leerCaracter();
            
            if(!palabras.letraValida(letra)){
                Consola.escribir("El caracter ingresado no es valido, prueba de nuevo");
            }else{
                if(palabras.comprobarLetra(letra,indice)){
                    Consola.escribir("FELICIDADES: has acertado con la " + letra);
                }else{
                    fallos++;
                    Consola.escribir("LO SIENTO HAS FALLADO: acumulas " + fallos + " fallo");
                    for (int j=0; j<fallos;j++){
                        Consola.escribir(figura.getFigura()[j]);
                    }
                }
                Consola.escribir("PALABRA:" + palabras.getPista());
            }
        }while(fallos<=15 && palabras.getAciertos()<palabras.getNconsonantes());
        
        if(fallos==15){
            Consola.escribir("HAS PERDIDO: acumulaste 15 fallos");
        }else{
            Consola.escribir("TIENES UNA OPORTUNIDAD DE ACERTAR, ¿CUÁL ES LA PALABRA?");
            respuesta=Teclado.leerCadena();
            if(respuesta.equals(palabras.getPalabra(indice))){
                Consola.escribir("FELICIDADES, HAS GANADO: acertaste la palabra");
            }else{
                for (int k=0; k<figura.getFigura().length;k++){
                        Consola.escribir(figura.getFigura()[k]);
                    }
                Consola.escribir("HAS PERDIDO: palabra equivocada");
            }
        }
    }
    
}
