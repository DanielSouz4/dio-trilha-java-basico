package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;
    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }
    public void addLivro(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo,autor,ano));
    }
    public List<Livro> pesquisarAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisaPorInteravloDeAno(int anoInicial,int anoFinal){
        List<Livro>livrosNoIntervalo = new ArrayList<>();
        for(Livro l:livroList){
            if(l.getAnoPublicacao()>=anoInicial && l.getAnoPublicacao()<=anoFinal){
                livrosNoIntervalo.add(l);
            }
        }
        return livrosNoIntervalo;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        for(Livro l:livroList){
            if(l.getTitulo().equalsIgnoreCase(titulo)){
                livroPorTitulo = l;
                break;
            }
        }
        return livroPorTitulo;
    }

}
