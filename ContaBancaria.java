/*
 * Matheus Coelho           313122409
 * Rômulo Pimentel de Lima  313122410
 */
package pkgControleFinanceiroPessoal;

/**
 *
 * @author Rômulo
 */
public class ContaBancaria extends Conta{
    private String agencia;
    private int numeroBanco;
    
    public ContaBancaria(int id, String nome, double cash, boolean bancaria, String agencia, int numeroBanco){
        super(id, nome, cash, bancaria);
        this.agencia = agencia;
        this.numeroBanco = numeroBanco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(int numeroBanco) {
        this.numeroBanco = numeroBanco;
    }
}