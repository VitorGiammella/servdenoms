
package servidor.de.nomes;
import java.io.Serializable;

public class RespCadastroServidor implements Serializable{
    
    private int status;
    private String mensagem;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
