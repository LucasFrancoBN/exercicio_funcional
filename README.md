# Exercício
O programa nesse exercício deve fazer a leitura dos dados (nome, email e salário) de funcionários de um arquivo em formato .csv. As regras do exercício são:

1. **Mostrar, em ordem alfabética, o email dos funcionários cujo salário seja superior a um dado valor fornecido pelo usuário.**
2. **Mostrar também a soma dos salários dos funcionários cujo nome começa com a letra 'M'.**
3. **Criar uma classe Employee com os atributos privados name (String), email (String) e salary (Double)**
    

## Exemplo
```plaintext
// input file
Maria,maria@gmail.com,3200.00
Alex,alex@gmail.com,1900.00
Marco,marco@gmail.com,1700.00
Bob,bob@gmail.com,3500.00
Anna,anna@gmail.com,2800.00
```
```plaintext
// Execution
Enter full file path: c:\temp\in.txt
Enter salary: 2000.00
Email of people whose salary is more than 2000.00:
anna@gmail.com
bob@gmail.com
maria@gmail.com
Sum of salary of people whose name starts with 'M': 4900.00
```

## Ferramentas
Desafio desenvolvido utilizando a linguagem Java e a IDE Intellij Community.


## Instruções de Uso
Antes de prosseguir com as instruções de uso, é requerido que você tenha em sua máquina o Java 20 e o git.

### Instalação
Antes de tudo, recomendo que você, pelo terminal, navegue até o diretório Desktop e rode o comando
```bash
# Clone o repositório
git clone https://github.com/LucasFrancoBN/exercicio_funcional.git

# Acesse o diretório da classe Program
cd exercicio_fixacao_arquivos/src/application
```
Agora basta você digitar no seu terminal
```bash
# Compile o projeto
javac Program.java ../entities/Employee.java
```
Retroceda ao diretório src e compile o programa
```
# Retroceda ao diretório src
cd ../

# Execute o programa
java application.Program
```
