public class ThreadSaque implements Runnable{
    ContaBancaria conta;
    private double saque;

    public ThreadSaque(ContaBancaria conta,double saque) {
        this.saque=saque;
        this.conta=conta;
    }

    public void run() {
        boolean res = conta.sacar(saque);
        if(!res) {
            System.out.println("Saldo indisponivel");
        }
    }
}
