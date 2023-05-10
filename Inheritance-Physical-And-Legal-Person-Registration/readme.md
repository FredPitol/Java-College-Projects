
![Pasted image 20230510112112](https://github.com/FredPitol/Inheritance-Physical-And-Legal-Person-Registration/assets/61964787/239024d1-f953-44cb-91a3-cce21ce495b3)

## [Link para Códigos](https://github.com/FredPitol/Java-College-Projects/tree/main/Inheritance-Physical-And-Legal-Person-Registration/src/exercise1/pkg3)
# Passo a passo
Primeiro exercício sobre herança, me foi passado esse diagrama de classe para a criação de um software a partir dele. 

1. Criei a classe pai `Pessoa` com seus respectivos atributos e método 
2. Criei a classe `PessoaFisica` como filha da classe `Pessoa` com seus respectivos atributos e métodos 
3. Utilizando da propriedade de *polimorfismo* sobrescrevi (*Overriding*) o método ```exibirDados()``` mudando seu comportamento com o objetivo de se adequar aos atributos especializados da classe `PessoaFisica`
4. Fiz o mesmo procedimento citado acima com a classe `PessosJuridica` 
5. Estanciei objetos e atribui informações aos atributos para testar a implementação 
6. Utilizei o método sobrescrito `exibirDados()` para printar as informações no console

>A tipagem para `cnpj` descrita no diagrama é `double`, troquei para `String`, já que ele inclui pontos, barras e dígitos verificadores e nunca será utilizado para cálculos matemáticos, alem de ter a possibilidade de começar com zeros a esquerda o que pode ocasionar em problemas quando utilizamos tipagem numérica. o mesmo vale para `cpf` da `PessoaFisica`
## Saída

![Pasted image 20230510123959](https://github.com/FredPitol/Inheritance-Physical-And-Legal-Person-Registration/assets/61964787/c9e73340-1412-44ed-9395-ef4425bab285)
