package models;
public class Cliente {

    private String nome;
    private String email;
    private Endereco endereco;
    private int cpf;


    public Cliente(String nome, String email, Endereco endereco, int cpf) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nEmail: " + this.email + "\nEndereco: " + this.endereco + "\nCPF: " + this.cpf;
    }

    public boolean equals(Cliente cliente) {
        return this.nome.equals(cliente.getNome()) && this.email.equals(cliente.getEmail()) && this.endereco.equals(cliente.getEndereco()) && this.cpf == cliente.getCpf();
    }

    public boolean isNull() {
        return this.nome == null && this.email == null && this.endereco == null && this.cpf == 0;
    }

    public Endereco getTelefone() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTelefone'");
    }
    
    
}
