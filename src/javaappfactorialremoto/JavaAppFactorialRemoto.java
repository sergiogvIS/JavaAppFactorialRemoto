/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappfactorialremoto;

/**
 *
 * @author entrar
 */
public class JavaAppFactorialRemoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(devuelveFactorial(5));
    }

    private static long devuelveFactorial(int arg0) {
        org.factorial.WSFactorial_Service service = new org.factorial.WSFactorial_Service();
        org.factorial.WSFactorial port = service.getWSFactorialPort();
        return port.devuelveFactorial(arg0);
    }
    
}
