public class ThreadDeposito implements Runnable {
    ContaBancaria conta;
    private double deposito;

    public ThreadDeposito(ContaBancaria conta,double deposito) {
        this.deposito = deposito;
        this.conta = conta;
    }

    public void run() {
        conta.depositar(deposito);
    }
}
