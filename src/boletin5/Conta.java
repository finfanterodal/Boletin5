package boletin5;

/**
 *
 * @author finfanterodal
 */
public class Conta {

    //Atributos
    private String nome;
    private String numConta;
    private double saldoActual;
    private double saldo;

    //Constructor
    public Conta() {

    }

    public Conta(String nome, String numConta, double saldo) {
        nome = "";
        numConta = "";
        saldo = 0;
    }
    //Métodos
    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //Getters

    public String getnome() {
        return nome;
    }

    public String getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    //Método Ingreso
    public Boolean ingreso(float cantidade) {
        if (cantidade >= 0) {
            saldo = getSaldo() + cantidade;
            return true;
        } else {
            return false;
        }
    }

    public Boolean reintegro(float cantidade) {

        saldo = getSaldo() - cantidade;
        if (cantidade >= 0) {
            saldo = getSaldo() - cantidade;
            return true;
        } else {
            return false;
        }
    }

    //Visualizar
    public void amosar() {
        System.out.println("\nNome: " + nome
                + "\nNúmero de conta: " + numConta
                + "\nSaldo inicial: " + saldo
                + "\nSaldo coa cantidade ingresada: " + saldo
                + "\nSaldo despois do reintegro: " + saldo);
    }
    //Transferencia
    public void transferencia(String cuentaDestino,float cantidade){
        
    }
}
