package model;

import java.util.Map;
import java.util.TreeMap;

public class DiretorioPrincipal {

    private Map<Integer, Elemento> diretorioPrincipal;

    public DiretorioPrincipal() {
        this.diretorioPrincipal = new TreeMap<>();
    }

    public Map<Integer, Elemento> getDiretorio() {
        if (diretorioPrincipal.size() == 0) {
            this.diretorioPrincipal = new TreeMap<>();
        }
        return diretorioPrincipal;
    }

}
