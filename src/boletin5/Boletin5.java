/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

/**
 *
 * @author finfanterodal
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta1 = new Conta("Fran", "2234", 100);
        conta1.ingreso(600);
        conta1.reintegro(100);
        conta1.amosar();
        Conta conta2 = new Conta("Parcero", "Moaña34545", 100);
        conta2.ingreso(0);
        conta2.reintegro(0);
        conta2.amosar();
        conta1.transferencia(conta2, 300);
        
        
        
    }

}
