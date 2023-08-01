package com.example;

class Cliente {
    double renda;
    char sexo;
    int ano_nascimento;

}

double getRenda () {
    return renda
}

void setRenda (double renda) {

}

public class AppClasses {
    public static void main(String[] args) {
        System.out.println("Criando Classes");
        Cliente cliente = new Cliente();
        cliente.renda = 10000;
        cliente.sexo = 'M';
        cliente.ano_nascimento= 1980;

        System.out.println("Renda: " + cliente.renda);
        System.out.println("Sexo: " + cliente.sexo);
        System.out.println("Ano de Nascimento: " + cliente.ano_nascimento);
        System.out.println();

        Cliente cliente2 = new Cliente();
        cliente2.renda = 2000;
        cliente2.sexo = 'F';
        cliente2.ano_nascimento= 1970;

        System.out.println("Renda: " + cliente2.renda);
        System.out.println("Sexo: " + cliente2.sexo);
        System.out.println("Ano de Nascimento: " + cliente2.ano_nascimento);
    }
    
}
