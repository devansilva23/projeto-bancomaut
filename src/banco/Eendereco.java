package banco;

public class Eendereco {
    private String rua;
    private String cep;
    private int numerodacasa;
    private String bairro;
    private String cidade;
    private String estado;
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public int getNumerodacasa() {
        return numerodacasa;
    }
    public void setNumerodacasa(int numerodacasa) {
        this.numerodacasa = numerodacasa;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
