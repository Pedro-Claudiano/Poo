public class Main {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta1 = new ContaBancaria(0);
        Thread deposito = new Thread(new ThreadDeposito(conta1, 10));
        Thread saque = new Thread(new ThreadSaque(conta1, 30));
        deposito.start();
        saque.start();

        try {
            deposito.join();
            saque.join();
        } catch (Exception e){
            System.out.println("Thread interrompido");
        }

        System.out.println(conta1.getSaldo());
    }
}
    

