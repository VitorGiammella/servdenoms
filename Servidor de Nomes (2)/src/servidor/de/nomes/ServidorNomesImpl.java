/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.de.nomes;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;// necessito do UnicastRemoteObject � Objeto Remoto Unicast

public class ServidorNomesImpl extends UnicastRemoteObject implements ServidorNomes{
    
    String[] Servidores;
    String[] listaServicos;
    // todas as classes remotas (servidores) herdam UnicastRemoteObject e implementam a interface definida
    public ServidorNomesImpl() throws RemoteException {
            super(); 
    }
        
    @Override
    public RespCadastroServidor registraServidor(ReqCadastroServidor requisicao) throws RemoteException {
        RespCadastroServidor resposta = new RespCadastroServidor();
        
        return resposta;
    }

    @Override
    public RespostaClienteServidorNomes buscaServidor(ReqClienteServidorNomes requisicao) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public RespServidorDesliga desligaServidor(ReqServidorDesliga requisicao) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String montaMensagem(String str) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
