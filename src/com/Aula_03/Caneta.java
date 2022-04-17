package com.Aula_03;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.print("Uma caneta " + this.cor);
        System.out.print(" Está tampada? " + this.tampada);
    }

    void rabiscar() {
        if(this.tampada == true) {
            System.out.println("ERRO: Não posso rabiscar");
        }else {
            System.out.println("Estou rabiscando");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
