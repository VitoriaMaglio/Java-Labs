public class Cliente {

    private int id;
    private String nome;
    private String celular;
    private String email;
    private String instagram;
    private String endereco;
    private TipoCliente tipo;

    public Cliente(int id, String nome, String celular, String email, String instagram, String endereco, TipoCliente tipo) {
        this.id = id;
        this.nome = nome;
        this.celular = celular;
        this.email = email;
        this.instagram = instagram;
        this.endereco = endereco;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }



    public String toString() {
        return id + ";" + nome + ";" + celular + ";" + email + ";" + instagram + ";" + endereco + ";" + tipo;
    }
}
