package exercise1.pkg3;

public class PessoasMain {
    
    public static void main(String[] args) {
        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.nome = "Mercearia do alberto";
        pj1.cnpj = 1234567809;
        pj1.endereco = "Rua das margaridas";
        pj1.nomeRepresentante = "Alberto de nobrega";
        pj1.razaoSocial = "Alberto serviços";
        pj1.telefone = "3339-8181";
        
        PessoaFisica pf1 = new PessoaFisica();
        pf1.cpf = 00000000001;
        pf1.endereco = "Rua das rosas n 40 ";
        pf1.nome = "Alfredo Berghain";
        pf1.estadoCivil = "Casado";
        pf1.telefone = "27-33399521";
        
        pf1.exibirDados();
        pj1.exibirDados();
        
        
    }
    
}