package exercise1.pkg3;


public class Pessoa {
    protected String nome;
    protected String endereco;
    protected String telefone;
    
    public void exibirDados(){
        System.out.printf("Nome: %s\n"
                        + "Endereço: %s \n"
                        + "Telefone: %s", nome, endereco, telefone);
    }  
}
