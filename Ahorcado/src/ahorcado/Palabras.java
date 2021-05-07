/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Natalia
 */
public class Palabras {
    private String[] palabra= {"MARINA","MARIAJOSEFA","IRENE","ROSARIO","MANUELA",
        "RAQUEL","BEATRIZ","PATRICIA","ANDREA","SARA","INMACULADA","MARIALUISA","ALICIA","NATALIA",  
        "ANGELA","MARIAROSARIO","ESTEFANIA","NEREA","CLAUDIA","CATALINA","NURIA","DANIELA","LORENA","LIDIA","EVA","KHADIJA","ALEJANDRA"
            ,"VICTORIA","TERESA","MARIAMERCEDES" };
    
    private char[] vocabulario={'B','C','D','F','G','H','J','K','L','M','N','Ñ','P','Q','R','S','T','V','W','X','Y','Z'};
    private String pista="";
    private int nconsonantes,aciertos;
    
    StringBuilder pistas= new StringBuilder();
    
    private void calcularConsonantes(int indice){
        Pattern patron = Pattern.compile("[B-DF-HJ-NÑP-TV-Z]");
        
        Matcher match = patron.matcher(palabra[indice]);
          while (match.find()) {
              nconsonantes++;

          }
    }
    
    
    public Palabras(){
        

      
    }
    
    public String getPalabra( int x){
        return palabra[x];
    }
    public int devuelveCuantasPalabrasTiene(){
        return palabra.length;
    }
    
    private void iniciarStringBuilder(){
        pistas.append(pista);
    }
    
    public String devuelvePalabra(int indice){
        calcularConsonantes(indice);
        for(int i=0;i<palabra[indice].length();i++){
            
           pista=pista + "*";
        }
        iniciarStringBuilder();
        return pista;
    }
    
    public boolean letraValida(char letra){
        boolean valida=false;
        for(int i=0;i<vocabulario.length;i++){
            if(letra==vocabulario[i]){
                valida=true;
            }
        }
        return valida;
    }
    
    public boolean comprobarLetra(char letra, int indice){
        boolean correcta=false;
        for (int i=0;i<palabra[indice].length();i++){
            if (letra==palabra[indice].charAt(i)){
                pistas.setCharAt(i, palabra[indice].charAt(i));
                pista=pistas.toString();
                correcta=true;
                aciertos++;
            }
        }
        return correcta;
    }

    public String getPista() {
        return pista;
    }

    public int getNconsonantes() {
        return nconsonantes;
    }

    public int getAciertos() {
        return aciertos;
    }
    
    
    
}
