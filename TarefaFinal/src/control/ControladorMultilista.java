package control;

import model.DiretorioPrincipal;
import model.Elemento;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ControladorMultilista {

    private DiretorioPrincipal diretorioPrincipal;
    private static ControladorMultilista ctrlMultList;
    private int index = 0;
    private Elemento elemento;

    private ControladorMultilista() {
        this.diretorioPrincipal = new DiretorioPrincipal();
    }
    //singleton
    public static ControladorMultilista getCtrlMultlist() {
        if (ctrlMultList == null) {
            ctrlMultList = new ControladorMultilista();
        }
        return ctrlMultList;
    }
    //fim singleton
    public void insereElemento(String nome, String curso, String profissao, Double salario) {
        Map<Integer, String> cursoMap = new TreeMap<>();
        cursoMap.put(index, curso);
        Map<Integer, String> profissaoMap = new TreeMap<>();
        profissaoMap.put(index, profissao);
        Map<Integer, Double> salarioMap = new TreeMap<>();
        salarioMap.put(index, salario);

        elemento = new Elemento(nome, cursoMap, profissaoMap, salarioMap);
        diretorioPrincipal.getDiretorio().put(index, elemento);
        index++;
    }

    public void carregaElementos() {
        insereElemento("Marcelo", "SIN", "Web Developer", 900.00);
        insereElemento("Rodolfo", "SIN", "Suporte", 1200.00);
        insereElemento("José Eduardo De Lucca", "CCO", "Professor", 5000.00);
        insereElemento("Kauan", "CCO", "Suporte", 720.00);
        insereElemento("Matheus", "SIN", "Web Developer", 4500.00);
        insereElemento("Marcos", "EEL", "Técnico", 1000.45);
        insereElemento("Linus", "CCO", "Engenheiro de Software", 50000.38);
        insereElemento("Raphael", "ADM", "Rapper", 500.29);
    }

    public Map<Integer, Elemento> listaElementos() {
        return diretorioPrincipal.getDiretorio();
    }

    public Map<Integer, Elemento> buscaPorCurso(String curso) {
        Map<Integer, Elemento> cursosMap;
        cursosMap = diretorioPrincipal.getDiretorio().entrySet().stream()
                .filter(c -> c.getValue().getCursos().get(c.getKey()).toLowerCase().contains(curso.toLowerCase()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return cursosMap;
    }

    public Map<Integer, Elemento> buscarPorProfissao(String profissao) {
        Map<Integer, Elemento> profissoesMap;
        profissoesMap = diretorioPrincipal.getDiretorio().entrySet().stream()
                .filter(p -> p.getValue().getProfissoes().get(p.getKey()).toLowerCase().contains(profissao.toLowerCase()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return profissoesMap;
    }

    public Map<Integer, Elemento> buscarPorFaixaDeSalario(double min, double max) {
        Map<Integer, Elemento> salariosMap;
        salariosMap = diretorioPrincipal.getDiretorio().entrySet().stream().
                filter(s -> s.getValue().getSalarios().get(s.getKey()) > min
                        && s.getValue().getSalarios().get(s.getKey()) < max)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return salariosMap;
    }

    public Map<Integer, Elemento> buscarCursoProfissao(String curso, String profissao) {
        Map<Integer, Elemento> cursoProfissaoMap;
        cursoProfissaoMap = diretorioPrincipal.getDiretorio().entrySet().stream()
                .filter(cp -> cp.getValue().getCursos().get(cp.getKey()).toLowerCase().contains(curso.toLowerCase())
                        && cp.getValue().getProfissoes().get(cp.getKey()).toLowerCase().contains(profissao.toLowerCase()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return cursoProfissaoMap;
    }

    public Map<Integer, Elemento> buscarCursoSalario(String curso, double min, double max) {
        Map<Integer, Elemento> cursoSalarioMap;
        cursoSalarioMap = diretorioPrincipal.getDiretorio().entrySet().stream()
                .filter(cs -> cs.getValue().getCursos().get(cs.getKey()).toLowerCase().contains(curso.toLowerCase())
                        && cs.getValue().getSalarios().get(cs.getKey()) > min
                        && cs.getValue().getSalarios().get(cs.getKey()) < max)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return cursoSalarioMap;
    }

    public Map<Integer, Elemento> buscarProfissaoSalario(String profissao, double min, double max) {
        Map<Integer, Elemento> profissaoSalarioMap;
        profissaoSalarioMap = diretorioPrincipal.getDiretorio().entrySet().stream()
                .filter(ps -> ps.getValue().getProfissoes().get(ps.getKey()).toLowerCase().contains(profissao.toLowerCase())
                        && ps.getValue().getSalarios().get(ps.getKey()) > min
                        && ps.getValue().getSalarios().get(ps.getKey()) < max)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        return profissaoSalarioMap;
    }

    public void excluiElemento(Integer id) {
        diretorioPrincipal.getDiretorio().remove(id);
    }

}
