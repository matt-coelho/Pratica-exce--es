/*
 * Matheus Coelho           313122409
 * Rômulo Pimentel de Lima  313122410
 */
package pkgControleFinanceiroPessoal;

import java.util.ArrayList;
import pkgException.DadosIncompletosException;
import pkgException.LimiteMaximoException;

public class ControleFinanceiroPessoal {
    private ArrayList<Conta> listaDeContas = new ArrayList<>();
    private Conta c;
    
    public void insereConta(Conta c) throws DadosIncompletosException, LimiteMaximoException{
        if(c.isTipoDeContaBancaria() == true && c.getNumeroIdConta() == 0 || c.getNome().equals(""))
            throw new DadosIncompletosException("Dados incompletos para conta comum");
        if(listaDeContas.size() >= 5)
            throw new LimiteMaximoException("Limite máximo de contas inseridas.");
        listaDeContas.add(c);
    }
    
    public void insereContaBancaria(ContaBancaria c) throws DadosIncompletosException, LimiteMaximoException{
        if(c.getAgencia().equals("") && c.getNumeroIdConta()==0)
            throw new DadosIncompletosException("Dados Incompletos para conta bancaria.");
        if(listaDeContas.size() >= 5)
            throw new LimiteMaximoException("Limite máximo de contas inseridas.");
        listaDeContas.add(c);
    }
    
    public void removeConta(int numeroConta){
        for(int i=0; i<listaDeContas.size(); i++){
            c = listaDeContas.get(i);
            if(c.getNumeroIdConta() == numeroConta)
                listaDeContas.remove(i);
        }
    }
    
    public Conta buscaConta(int numeroConta){
        for(int i=0; i<listaDeContas.size(); i++){
            c = listaDeContas.get(i);
            if(c.getNumeroIdConta() == numeroConta)
                return c;
        }
        return c=null;
    }
}