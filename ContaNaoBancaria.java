/*
 * Matheus Coelho           313122409
 * Rômulo Pimentel de Lima  313122410
 */
package pkgControleFinanceiroPessoal;

/**
 *
 * @author Rômulo
 */
public class ContaNaoBancaria extends Conta{
    
    public ContaNaoBancaria(int numeroIdConta, String nome, double saldo, boolean tipoDeContaBancaria){
        super(numeroIdConta, nome, saldo, tipoDeContaBancaria);
    }
}