package br.com.fiap.agenda.models;

public class Contact {
    private int id;
    private String nome;
    private String celular;
    private String email;
    private String instagram;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "\nContato: " + id +
                "\nNome:" + nome +
                "\nCelular: " + celular +
                "\nEmail: " + email +
                "\nInstagram: " + instagram  +
                "\nTipo do Contato: " + tipo +
                "\n===================================";
    }
}
