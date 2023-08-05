package com.example.model;

public class Cliente {
    private String cpf;
    private String nome;
    private String cidade;
    private double renda;
    private char sexo;
    private boolean especial;

    public Cliente () {
        System.out.println("Criando um Cliente usando um cosntrutor sem parâmetros");
        double aleatorio = Math.random();
        if (aleatorio >= 0.5)
            especial = true;
    }

    public Cliente (double renda, char sexo) {
        this();
        System.out.println("Criando um Cliente usando um cosntrutor com parâmetros");
        setRenda(renda);;
        this.sexo = sexo;
    }

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
        if (nome.isBlank())
        System.out.println("Nome é obrigatório");
        else this.nome = nome.toUpperCase().trim();
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getRenda() {
        return renda;
    }
    
    public void setRenda (double renda) {
        if(renda >= 0)
            this.renda = renda;
        else System.out.println("A renda deve ser maior ou igual a zero!");
        }
    

    public boolean isEspecial() {
        return especial;
    }
    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
  public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo =='F' || sexo == 'm' || sexo == 'f')
            this.sexo = sexo;
        else System.out.println("Sexo inválido");
    }

    public int getAno_nascimento() {
        return ano_nascimento;
    }

    public void setAno_nascimento(int ano_nascimento) {
        this.ano_nascimento = ano_nascimento;
    }

    private int ano_nascimento;
  

}