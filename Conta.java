/*
 * Matheus Coelho           313122409
 * Rômulo Pimentel de Lima  313122410
 */
package pkgControleFinanceiroPessoal;

import pkgException.SaldoInsuficienteException;

/**
 *
 * @author Rômulo
 */
public class Conta {
    private String nome;
    private int numeroIdConta;
    private boolean tipoDeContaBancaria;
    private double saldo;

   public Conta(){
       
   }
    
    public Conta(int numeroIdConta, String nome, double saldo, boolean tipoDeContaBancaria){
        this.numeroIdConta = numeroIdConta;
        this.nome = nome;
        this.saldo = saldo;
        this.tipoDeContaBancaria = tipoDeContaBancaria;
    }
    
    public void sacarDinheiro(double d) throws SaldoInsuficienteException{
        if(saldo < d)
            throw new SaldoInsuficienteException("Saldo insuficiente para operação.");
        this.saldo = this.saldo - d;
        System.out.println("Saque de R$" + d+ " efetuado com sucesso.");
    }
    
    public void depositarDinheiro(double d){
        this.saldo += d;
        System.out.println("Deposito de R$" +d+ " efetuado com sucesso.");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroIdConta() {
        return numeroIdConta;
    }

    public void setNumeroIdConta(int numeroIdConta) {
        this.numeroIdConta = numeroIdConta;
    }

    public boolean isTipoDeContaBancaria() {
        return tipoDeContaBancaria;
    }

    public void setTipoDeContaBancaria(boolean tipoDeContaBancaria) {
        this.tipoDeContaBancaria = tipoDeContaBancaria;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}