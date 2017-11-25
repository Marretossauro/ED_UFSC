package model;

import java.util.Map;
import java.util.TreeMap;

public class Elemento {

    private String nome;
    private Map<Integer, String> cursos = new TreeMap<>();
    private Map<Integer, String> profissoes = new TreeMap<>();
    private Map<Integer, String> salarios = new TreeMap<>();

    public Elemento(String nome, Map<Integer, String> cursos, Map<Integer, String> profissoes, Map<Integer, String> salarios) {
        this.nome = nome;
        this.cursos = cursos;
        this.profissoes = profissoes;
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public Map<Integer, String> getCursos() {
        return cursos;
    }

    public Map<Integer, String> getProfissoes() {
        return profissoes;
    }

    public Map<Integer, String> getSalarios() {
        return salarios;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "nome='" + nome + '\'' +
                ", cursos=" + cursos +
                ", profissoes=" + profissoes +
                ", salarios=" + salarios +
                '}';
    }
}
