public class Administrador extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Administrador(){
        this.autenticador = new AutenticacaoUtil();
    }

    private int senha;

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do Administrador");
        return 50;
    }

    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}