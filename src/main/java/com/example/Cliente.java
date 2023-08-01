package com.example;

class Cliente {
    private double renda;
    private char sexo;
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo =='F')
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

public double getRenda() {
    return renda;
}

public void setRenda (double renda) {
    if(renda >= 0)
        this.renda = renda;
    else System.out.println("A renda deve ser maior que zero!");
    }
}