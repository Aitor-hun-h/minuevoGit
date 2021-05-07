/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/**
 *
 * @author aitor
 */
public class Figura {
    private String [] figura= new String [15];
    
    public Figura(){
        construirFigura();
    }
    
    private void construirFigura(){
        figura[0]=" **********";
        figura[1]=" *        *";
        figura[2]=" *        *";
        figura[3]=" *       * *";
        figura[4]=" *        *";
        figura[5]=" *        *";
        figura[6]=" *        *";
        figura[7]=" *     *******";
        figura[8]=" *        *";
        figura[9]=" *       * *";
        figura[10]=" *      *   *";
        figura[11]=" *     *     *";
        figura[12]=" *         ";
        figura[13]=" *         ";
        figura[14]="* *        ";
        
    }

    public String[] getFigura() {
        return figura;
    }

    public void setFigura(String[] figura) {
        this.figura = figura;
    }

    
    
    
}
