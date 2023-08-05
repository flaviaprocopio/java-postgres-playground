package com.example;

import com.example.model.Cliente;

public class AppClasses {
    public static void main(String[] args) {
        var cliente = new Cliente();
        cliente.setRenda(-10000);
        cliente.setSexo('M');
        cliente.setAno_nascimento(1980);
        cliente.setNome("Flávia Procopio");
        cliente.setCpf("25119737234");
        cliente.setCidade("Palmas");

        var vetorNome = cliente.getNome().split(" ");
        System.out.println(vetorNome [0]);
        System.out.println(vetorNome [1]);

        System.out.println("Primeiro caractere do nome: " + cliente.getNome().charAt(0));

        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAno_nascimento());
        System.out.println("Cliente especial: " + cliente.isEspecial());
        
        Cliente cliente2 = new Cliente(2000, 'F');
        cliente2.setNome("      ");
        //cliente2.setCpf(new String("25119737234"));
        cliente2.setCpf("88255144292");
        cliente2.setCidade("PALMAS");
        System.out.println();

        if (cliente.getCpf().equals(cliente2.getCpf()))
        System.out.println("Cliente 1 e 2 têm o mesmo CPF");
        else System.out.println("CPFs Diferentes");

        if (cliente.getCidade().equalsIgnoreCase(cliente2.getCidade()))
        System.out.println("Cliente 1 e 2 moram na mesma Cidade");
        else System.out.println("Cliente 1 e 2 moram em Cidades Diferentes");


        System.out.println();
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Renda: " + cliente2.getRenda());
        System.out.println("Sexo: " + cliente2.getSexo());
        System.out.println("Ano de Nascimento: " + cliente2.getAno_nascimento());
        System.out.println("Cliente especial: " + cliente2.isEspecial());
        
    }
}
