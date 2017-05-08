package servidor.de.nomes;

import java.rmi.*; // importa pacotes do RMI

public interface ServidorNomes extends Remote {
    
    public RespCadastroServidor registraServidor (ReqCadastroServidor requisicao) throws RemoteException;
    public RespServidorDesliga desligaServidor (ReqServidorDesliga requisicao) throws RemoteException;
    public RespostaClienteServidorNomes buscaServidor (ReqClienteServidorNomes requisicao) throws RemoteException;
    
    // todos os m�todos remotos necessitam lan�ar uma exce��o deste tipo
    public String montaMensagem(String str) throws RemoteException;
}
