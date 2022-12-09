package com.bolao2022.bolao.selecao;


import javax.persistence.*;

@Entity
public class Selecao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(nullable = false)
    String nome;
    @Column(nullable = false)
    String abreviacao;
    Integer vitorias;
    Integer derrotas;
    Integer empates;
    Integer golsFeitos;
    Integer golsSofridos;
    Integer saldoGols;
    Integer cartaoAmarelo;
    Integer cartaoVermelho;

    public Selecao() {
    }

    public Selecao(Long id, String nome, String abreviacao, Integer vitorias, Integer derrotas, Integer empates, Integer golsFeitos, Integer golsSofridos, Integer saldoGols, Integer cartaoAmarelo, Integer cartaoVermelho) {
        this.id = id;
        this.nome = nome;
        this.abreviacao = abreviacao;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.golsFeitos = golsFeitos;
        this.golsSofridos = golsSofridos;
        this.saldoGols = saldoGols;
        this.cartaoAmarelo = cartaoAmarelo;
        this.cartaoVermelho = cartaoVermelho;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    public Integer getGolsFeitos() {
        return golsFeitos;
    }

    public void setGolsFeitos(Integer golsFeitos) {
        this.golsFeitos = golsFeitos;
    }

    public Integer getGolsSofridos() {
        return golsSofridos;
    }

    public void setGolsSofridos(Integer golsSofridos) {
        this.golsSofridos = golsSofridos;
    }

    public Integer getSaldoGols() {
        return saldoGols;
    }

    public void setSaldoGols(Integer saldoGols) {
        this.saldoGols = saldoGols;
    }

    public Integer getCartaoAmarelo() {
        return cartaoAmarelo;
    }

    public void setCartaoAmarelo(Integer cartaoAmarelo) {
        this.cartaoAmarelo = cartaoAmarelo;
    }

    public Integer getCartaoVermelho() {
        return cartaoVermelho;
    }

    public void setCartaoVermelho(Integer cartaoVermelho) {
        this.cartaoVermelho = cartaoVermelho;
    }

    @Override
    public String toString() {
        return "Selecao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", abreviacao='" + abreviacao + '\'' +
                ", vitorias=" + vitorias +
                ", derrotas=" + derrotas +
                ", empates=" + empates +
                ", golsFeitos=" + golsFeitos +
                ", golsSofridos=" + golsSofridos +
                ", saldoGols=" + saldoGols +
                ", cartaoAmarelo=" + cartaoAmarelo +
                ", cartaoVermelho=" + cartaoVermelho +
                '}';
    }
}
