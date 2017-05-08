package servidor.de.nomes;

/**
 *
 * @author Eduardo
 */

import java.io.Serializable;

public class ReqCadastroServidor implements Serializable {
    
    private int porta;
    private String endereço;
    private String[] listaServicos;

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String[] getListaServicos() {
        return listaServicos;
    }

    public void setListaServicos(String[] listaServicos) {
        this.listaServicos = listaServicos;
    }
}
