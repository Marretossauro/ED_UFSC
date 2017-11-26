package control;

import model.Elemento;

import javax.print.attribute.IntegerSyntax;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ControladorMultilista {

    Map<Integer, Elemento> diretorioPrincipal = new TreeMap<>();
    private int index = 0;
    private Elemento elemento;

    public void insereElemento(String nome, String curso, String profissao, Double salario) {
        Map<Integer, String> cursoMap = new TreeMap<>();
        cursoMap.put(index, curso);
        Map<Integer, String> profissaoMap = new TreeMap<>();
        profissaoMap.put(index, profissao);
        Map<Integer, Double> salarioMap = new TreeMap<>();
        salarioMap.put(index, salario);

        elemento = new Elemento(nome, cursoMap, profissaoMap, salarioMap);
        diretorioPrincipal.put(index, elemento);
        index++;
    }

    public Map<Integer, Elemento> listaElementos() {
        return diretorioPrincipal;
    }

    public Map<Integer, Elemento> buscaPorCurso(String curso) {
        Map<Integer, Elemento> cursosMap;
        cursosMap = diretorioPrincipal.entrySet().stream()
                .filter(c -> c.getValue().getCursos().get(c.getKey()).equals(curso))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return cursosMap;
    }

    public Map<Integer, Elemento> buscarPorProfissao(String profissao) {
        Map<Integer, Elemento> profissoesMap;
        profissoesMap = diretorioPrincipal.entrySet().stream()
                .filter(p -> p.getValue().getProfissoes().get(p.getKey()).equals(profissao))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return profissoesMap;
    }

    public Map<Integer, Elemento> buscarPorFaixaDeSalario(double min, double max) {
        Map<Integer, Elemento> salariosMap;
        salariosMap = diretorioPrincipal.entrySet().stream().
                filter(s -> s.getValue().getSalarios().get(s.getKey())>min
                        && s.getValue().getSalarios().get(s.getKey())<max)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return salariosMap;
    }
    public Map<Integer, Elemento> buscarCursoProfissao(String curso, String profissao){
        Map<Integer, Elemento> cursoProfissaoMap;
        cursoProfissaoMap = diretorioPrincipal.entrySet().stream()
                .filter(cp -> cp.getValue().getCursos().get(cp.getKey()).equals(curso)&&cp.getValue().getProfissoes().get(cp.getKey()).equals(profissao))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return cursoProfissaoMap;
    }
    public Map<Integer, Elemento> buscarCursoSalario(String curso, double min, double max){
        Map<Integer, Elemento> cursoSalarioMap;
        cursoSalarioMap = diretorioPrincipal.entrySet().stream()
                .filter(cs -> cs.getValue().getCursos().get(cs.getKey()).equals(curso)&&cs.getValue().getSalarios().get(cs.getKey())>min
                        && cs.getValue().getSalarios().get(cs.getKey())<max)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return cursoSalarioMap;
    }
    public Map<Integer, Elemento> buscarProfissaoSalario(String profissao, double min, double max){
        Map<Integer, Elemento> profissaoSalarioMap;
        profissaoSalarioMap = diretorioPrincipal.entrySet().stream()
                .filter(ps -> ps.getValue().getProfissoes().get(ps.getKey()).equals(profissao)&&ps.getValue().getSalarios().get(ps.getKey())>min
                        && ps.getValue().getSalarios().get(ps.getKey())<max)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return profissaoSalarioMap;
    }
    public void excluiElemento(Integer id){
        diretorioPrincipal.remove(id);
    }
}
