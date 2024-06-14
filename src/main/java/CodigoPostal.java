import java.net.URI;

public class CodigoPostal {

    int cp;
    String endereco;

    String bairro;
    String localidade;

    public CodigoPostal(int cp, String bairro, String localidade) {
        this.cp = cp;
        this.bairro = bairro;
        this.localidade = localidade;
    }

    //metodos getters setters


    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }



    @Override
    public String toString() {
        return "CodigoPostal{" +
                " cp = " + cp +
                ", endereco = " + endereco +
                ", bairro = " + bairro +
                ", localidade = " + localidade +
                '}';
    }
}
