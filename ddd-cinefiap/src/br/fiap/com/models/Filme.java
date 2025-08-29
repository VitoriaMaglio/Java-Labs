package br.fiap.com.models;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Filme {

    //atributtes
    private Long id;
    private double avaliacao;
    private LocalTime duracao;

    public Filme() {
    }

    public Filme(Long id, double avaliacao, LocalTime duracao) {
        this.id = id;
        this.avaliacao = avaliacao;
        this.duracao = duracao;
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public double getAvaliacao() {return avaliacao;}

    public void setAvaliacao(double avaliacao) {this.avaliacao = avaliacao;}

    public LocalTime getDuracao() {return duracao;}

    public void setDuracao(LocalTime duracao) {this.duracao = duracao;}
}
