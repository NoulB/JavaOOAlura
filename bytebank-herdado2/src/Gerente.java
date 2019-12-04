public class Gerente extends Funcionario implements Autenticavel {

    private int senha;
    private AutenticacaoUtil autenticador;

    public Gerente(){
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do Gerente");
        return super.getSalario();
    }

    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}