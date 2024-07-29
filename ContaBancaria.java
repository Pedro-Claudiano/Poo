public class ContaBancaria{
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public synchronized void depositar(double quantia){
        saldo += quantia;
    }

    public synchronized boolean sacar(double quantia){
        boolean res;;
        if(quantia <= saldo){
            saldo -= quantia;
            res = true;
        }else {
            res = false;
        }
        return res;
    }
    public double getSaldo(){
        return saldo;
    }
}   