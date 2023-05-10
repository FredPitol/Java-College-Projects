
package exercise1.pkg3;


public class PessoaFisica extends Pessoa {
    
    protected long cpf;
    protected String estadoCivil;
    
    public void exibirDados(){
        
            System.out.printf("Dados da pessoa fisica: \n"
            + "Nome: %s \n"
            + "CPF: %s \n"
            + "Estado civil: %s \n"
            + "Endereço: %s \n"
            + "Telefone: %s \n"
                    + "\n"
                    + "------------------------------------------------"
                    + "\n"
                    ,nome 
                    ,cpf 
                    ,estadoCivil
                    ,endereco
                    ,telefone);
        
        /**
        System.out.println(nome);
        System.out.println(endereco);
        System.out.println(telefone);
        System.out.println(cpf);
        System.out.println(estadoCivil);
        */
    } 
    
    
    
    
    
}
