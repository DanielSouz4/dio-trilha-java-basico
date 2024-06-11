package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void addTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t:tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }


    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);


    }

    public static void main(String[] args) {
       ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.addTarefa("Tarefa 1");
        listaTarefa.addTarefa("Tarefa 2");
        listaTarefa.addTarefa("Tarefa 1");

        System.out.println("O numero total da lista é : "+ listaTarefa.obterNumeroTotalDeTarefas());

        // ao remover tarefa 1 é para a quantidade de elemntos na lista ser 1
        listaTarefa.removerTarefa("tarefa 1");
        System.out.println("Removendo 'Tarefa 1'");

        System.out.println("O numero total da lista é : "+ listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.obterDescricaoTarefas();


    }

}
