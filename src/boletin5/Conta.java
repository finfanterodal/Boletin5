package boletin5;

/**
 *
 * @author finfanterodal
 */
public class Conta {

    //Atributos
    private String nome;
    private String numConta;
    private double saldo;
    private double saldoReintegro;
    private double saldoIngreso;
    private double saldoFinal;

    //Constructor
    public Conta() {

    }

    public Conta(String nome, String numConta, double saldo) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
        saldoFinal = saldo;
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
        saldoFinal = saldo;
    }
    //Getters

    public String getnome() {
        return nome;
    }

    public String getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldoFinal;
    }

    //Método Ingreso
    public Boolean ingreso(float cantidade) {
        if (cantidade >= 0) {
            saldoIngreso = getSaldo() + cantidade;
            saldoFinal = saldoIngreso;
            return true;
        } else {
            return false;
        }
    }

    public Boolean reintegro(float cantidade) {
        if (cantidade >= 0) {
            saldoReintegro = getSaldo() - cantidade;
            saldoFinal = saldoReintegro;
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
                + "\nSaldo coa cantidade ingresada: " + saldoIngreso
                + "\nSaldo despois do reintegro: " + saldoReintegro
                + "\nSaldo Final: " + saldoFinal);
    }

    //Transferencia
    public void transferencia(Conta c, float cantidade) {
        if (cantidade < saldoFinal) {
            reintegro(cantidade);
            c.ingreso(cantidade);
            System.out.println("\nTotal saldo tras transferencia en su cuenta: " + saldoFinal);
            System.out.println("\nTotal saldo tras transferencia en la cuenta de destino: " + c.getSaldo());
        } else {
            System.out.println("\nNon se pode realizar a operación.");
        }
    }
}
