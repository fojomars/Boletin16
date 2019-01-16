/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin16_1;

/**
 *
 * @author fojomars
 */
public class Boletin16_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persoa per = new Persoa();
        Canario ca = new Canario();
        Galo ga = new Galo();
        
        per.cantar();
        ca.cantar();
        ga.cantar();
        
        IPodeCantar can = new Persoa();
        can.cantar();
        
        Tenor te = new Tenor();
        te.cantar();
    }
    
}
