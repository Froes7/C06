package Jogo;

public class Arma {
     String nome;
     int poder;
     int resistencia;
     String descricao;
     
    void MostrarInfoArma(){
        
        System.out.printf("Nome: %S%nPoder:%d%nResistência: %d%nDescrição: ", nome, poder, resistencia);
        System.out.println(descricao);
    }
}
