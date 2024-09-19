public abstract class Cliente {
    private String nome;
    private String cpf;
    Endereco endereco;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {

    }
    public Endereco getEndereco() {
        return endereco;
    }
}
