
![[Pasted image 20230510112112.png]]


Temos como primeiro exercício esse diagrama de classe que me foi dado para a criação de um software a partir dele. 

1. Criei a classe pai com seus respectivos atributos e método 
2. Criei a classe ```PessoaFisica``` como filha da classe ```Pessoa``` com seus respectivos atributos e métodos 
3. Utilizando da propriedade de *polimorfismo* sobrescrevi (*Overriding*) o método ```exibirDados()``` mudando seu comportamento com o objetivo de se adequar aos atributos especializados da classe ```PessoaFisica```
4. Fiz o mesmo procedimento citado acima com a classe ```PessosJuridica``` 
>A tipagem para `cnpj` descrita no diagrama é `double`, troquei para `String`, já que ele inclui pontos, barras e dígitos verificadores e nunca será utilizado para cálculos matemáticos, alem de ter a possibilidade de começar com zeros a esquerda o que pode ocasionar em problemas quando utilizamos tipagem numérica. o mesmo vale para `cpf` da `PessoaFisica`
5. Estanciei objetos e atribui informações aos atributos para testar a implementação 
6. Utilizei o método sobrescrito `exibirDados()` para printar as informações no console

## Saída
![[Pasted image 20230510123959.png]]

## Duvidas 
