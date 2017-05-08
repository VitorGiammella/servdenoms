package servidor.de.nomes;
// INTERFACE
import java.rmi.*; // importa pacotes do RMI

public interface Servidor1 extends Remote // necessita herdar para obter invoca��o remota
{
    public RespMaior maior (ReqMaior requisicao) throws RemoteException;
    public RespMenor menor (ReqMenor requisicao) throws RemoteException;
	// todos os m�todos remotos necessitam lan�ar uma exce��o deste tipo
	public String montaMensagem(String str) throws RemoteException;
}
