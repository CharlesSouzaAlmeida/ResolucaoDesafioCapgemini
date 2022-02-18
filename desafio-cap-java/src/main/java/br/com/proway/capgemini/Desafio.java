package br.com.proway.capgemini;

import java.util.ArrayList;
import java.util.List;

public class Desafio {
    public void questaoUm(int n) {

        StringBuilder character = new StringBuilder();



        for (int i = 0; i < n; i++) {
            character.append("*");
            if (i == 0)
                System.out.print(character);
            else
                System.out.print("\n" + character);
        }
    }

    public void questaoDois(String senha) {

        final int TAMANHO_MINIMO = 6;

        if (isValido(senha)) {
            System.out.println("senha forte");
        } else {
            int aux = TAMANHO_MINIMO - senha.length();
            if (aux >= 0) {
                System.out.println(aux);
            } else {
                System.out.println("senha fraca");
            }
        }
    }
    
    private boolean isValido(String senha) {

        if (senha.length() < 6) return false;

        boolean minusculo = false;
        boolean maiusculo = false;
        boolean numero = false;
        boolean simbolo = false;

        for (char aux : senha.toCharArray()) {
            if (aux >= '0' && aux <= '9') {
                numero = true;
            } else if (aux >= 'A' && aux <= 'Z') {
                maiusculo = true;
            } else if (aux >= 'a' && aux <= 'z') {
                minusculo = true;
            } else {
                simbolo = true;
            }
        }
        return numero && maiusculo && minusculo && simbolo;
    }


    public void questaoTres(String palavra) {

        System.out.println(contarAnagramas(palavra));
    }


    private Integer contarAnagramas(String palavra) {
        List<Integer[]> index = verificarLetrasRepetidas(palavra);
        return contarSubString(index);
    }

    private List<Integer[]> verificarLetrasRepetidas(String palavra) {
        List<Integer[]> index = new ArrayList<>();
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i + 1; j < palavra.length(); j++) {
                if (palavra.charAt(i) == palavra.charAt(j)) {
                    Integer[] aux = new Integer[2];
                    aux[0] = i;
                    aux[1] = j;
                    index.add(aux);
                }
            }
        }
        return index;
    }

    private Integer contarSubString(List<Integer[]> index) {

        int cont = 0;

        if (index.size() == 1) {
            return 3;
        }
        for (int i = 0; i < index.size(); i++) {
            if (index.get(i)[1] - index.get(i)[0] > 1) {
                cont += 2;
            } else {
                cont++;
            }
        }
        return cont;

    }


}
