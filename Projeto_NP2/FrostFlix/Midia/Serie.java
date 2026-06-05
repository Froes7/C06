package Midia;
import java.util.*;

public class Serie extends Conteudo {
    
    List<Temporada> temporadas;

    public Serie(String titulo, String descricao, String genero, String diretor, int anoDeLancamento, float nota){

        super(titulo, descricao, genero, diretor, anoDeLancamento, nota);
    }


}
