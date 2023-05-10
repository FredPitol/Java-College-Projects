
package exercise1.pkg3;


public class PessoaJuridica extends Pessoa{
    protected long cnpj;
    protected String razaoSocial;
    protected String nomeRepresentante;
    
    public void exibirDados(){
    System.out.printf("Dados da empresa: \n"
            + "Razão social: %s \n"
            + "CNPJ: %s \n"
            + "Nome do representante: %s \n"
            + "Endereço: %s \n"
            + "Telefone: %s \n"
            + "\n"
            + "------------------------------------------------"
            + "\n"
            ,razaoSocial
            ,cnpj
            ,nomeRepresentante
            ,endereco
            ,telefone);
    }
}
