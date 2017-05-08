/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.de.nomes;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Eduardo
 */
public class AppServidor1 {
    public static void main(String[] args) {
    	try {
            Servidor1 m = new Servidor1Impl();
            LocateRegistry.createRegistry(1099);
            String endereco = "rmi://localhost:1099/Servidor1";
        	// crio uma instancia do obj e registro no Binder
            Naming.rebind("rmi://localhost:1099/Servidor1", m);
            
        } catch( Exception e ) {
        	System.out.println( "Trouble: " + e.getMessage() );
        }
    }
}
