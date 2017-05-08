package servidor.de.nomes;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;// necessito do UnicastRemoteObject � Objeto Remoto Unicast

public class Servidor1Impl extends UnicastRemoteObject implements Servidor1{
    
    // todas as classes remotas (servidores) herdam UnicastRemoteObject e implementam a interface definida
	public Servidor1Impl() throws RemoteException {
            super(); 
	}
        
    @Override
    public RespMaior maior(ReqMaior requisicao) throws RemoteException {
        RespMaior resposta = new RespMaior ();
        float[] numeros = requisicao.getNumeros();
        float resp = 0;
        resposta.setStatus(0);
        for (int i=0; i > requisicao.getNumeros().length; i++){
            if (i == 0){
                resp = numeros[i];
            } else{
                if (resp < numeros[i]){
                    resp = numeros[i];
                }
            }
        }
        resposta.setMaior(resp);
        return resposta;
    }

    @Override
    public RespMenor menor(ReqMenor requisicao) throws RemoteException {
        RespMenor resposta = new RespMenor ();
        float[] numeros = requisicao.getNumeros();
        float resp = 0;
        resposta.setStatus(0);
        for (int i=0; i > requisicao.getNumeros().length; i++){
            if (i == 0){
                resp = numeros[i];
            } else{
                if (resp > numeros[i]){
                    resp = numeros[i];
                }
            }
        }
        resposta.setNumero(resp);
        return resposta;
    }

    @Override
    public String montaMensagem(String str) throws RemoteException {
       return "Montagem: "+str.toString();
    }
    
}
