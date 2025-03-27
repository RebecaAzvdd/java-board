# Java Board

## Descrição
Java Board é um projeto de console desenvolvido em Java utilizando Gradle. Ele permite a criação e manipulação de quadros (boards) com funcionalidades como:
- Criar um board
- Deletar um board
- Adicionar cards
- Mover cards entre listas
- Deletar cards

## Requisitos
Antes de iniciar, certifique-se de ter os seguintes requisitos instalados:
- Java 17 ou superior
- Gradle 8+

## Instalação
1. Clone o repositório:
   ```sh
   git clone https://github.com/RebecaAzvdd/java-board.git
   ```
2. Acesse o diretório do projeto:
   ```sh
   cd java-board
   ```
3. Compile o projeto:
   ```sh
   gradle build
   ```

## Uso
Para executar o projeto, utilize um dos seguintes comandos:
```sh
gradle run
```
Se encontrar problemas com entrada no console, tente executar diretamente com:
```sh
java -cp build/classes/java/main me.dio.Main
```
Isso iniciará o aplicativo de console, permitindo interagir com os quadros e cards.

### **Exemplo de Uso**
Após executar o programa, você verá um menu como este:
```
Bem-vindo ao gerenciador de Boards, escolha a opção desejada:
1 - Criar Board
2 - Selecionar Board
3 - Excluir Board
4 - Sair
```
Digite o número correspondente à ação desejada e pressione Enter.

## Estrutura do Projeto
- `src/main/java`: Contém o código-fonte principal.
- `src/main/resources`: Contém arquivos de configuração.
- `build.gradle.kts`: Arquivo de configuração do Gradle.

## Licença
Este projeto está sob a licença MIT.

