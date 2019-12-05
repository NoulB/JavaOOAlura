public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(100);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorImposto cdi = new CalculadorImposto();
        cdi.registra(cc);
        cdi.registra(seguro);



        System.out.println(cdi.getTotalImposto());
    }
}
