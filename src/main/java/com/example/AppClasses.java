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

public class AppClasses {
    public static void main(String[] args) {
        System.out.println("Criando Classes");
        Cliente cliente = new Cliente();
        cliente.setRenda(-10000);
        cliente.setSexo('M');
        cliente.setAno_nascimento(1980);

        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAno_nascimento());
        System.out.println();

        Cliente cliente2 = new Cliente();
        cliente2.setRenda(2000);
        cliente2.setSexo('s');
        cliente2.setAno_nascimento(1970);

        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Ano de Nascimento: " + cliente2.getAno_nascimento());
    }
}
