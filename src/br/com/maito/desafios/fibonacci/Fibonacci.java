package br.com.maito.desafios.fibonacci;

import java.util.ArrayList;
import java.util.List;


public class Fibonacci {

    public static List<Integer> fibonacci() {
        int primeiroFib = 0;
        int segundoFib = 1;
        int aux;
        List <Integer> fibonacci = new ArrayList<Integer>();
        fibonacci.add(primeiroFib);
        for (int i = 0; i <= 100; i++) {
            aux = primeiroFib;
            primeiroFib = primeiroFib + segundoFib;
            segundoFib = aux;
            fibonacci.add(primeiroFib);
            if (primeiroFib > 350) {
                return fibonacci;
            }
        }
        return null;
    }
    public static Boolean isFibonacci(Integer numeroEsta) {
        return fibonacci().contains(numeroEsta);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci());
        System.out.println(isFibonacci(89));
    }

}
