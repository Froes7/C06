package Slide_07.Conta_e_cliente;

public class Conta {
    
    private int numero;
    private float saldo;
    private float limite;
    Cliente clientes[];

    public Conta(){
        clientes = new Cliente[3];
    }

    public void sacar(float quantia){
        if (saldo >= quantia){ 

            saldo -= quantia;
            System.out.println("Saque concluído com êxito, finalizando operação.");
        }
        else System.out.println("Impossível sacar, saldo indisponível.");
    }

    public void deposita(float quantia){
        saldo += quantia;
        System.out.println("Depósito concluído com êxito, finalizando operação.");
    }
}
