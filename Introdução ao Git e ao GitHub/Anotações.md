### :black_circle:Link para download do Git: Clique [AQUI](https://git-scm.com/downloads)

:large_blue_circle: O GitBash é um terminal extendido para otimizar o uso do Git.

:black_circle:Link para slides: Clique [AQUI](https://drive.google.com/file/d/1IZu0qohv1JOmxjEra1lknDiiStU68bl4/view?usp=sharing)



## Comandos Git Básicos

### 1. git config

Quando você está utilizando o Git pela primeira vez ou com uma instalação nova, em um projeto colaborativo, esse comando é fundamental para configurar sua identidade de usuário, inserindo informações como nome e email que serão empregadas em cada *commit*.

Exemplo:

**$ git config –global user.name “Seu nome”**

**$ git config –global user.email “Seu email”**



### 2. git init

Esse é o comando que você irá utilizar para criar um novo projeto de git. O comando irá criar um repositório novo em branco e, a partir daí, será possível armazenar seu código fonte, alterar, salvaguardar alterações etc.

Exemplo:

**$ git init**

Se você já possui um repositório anterior ou deseja criar um repositório com um nome em específico, você pode passar o nome como parâmetro do comando:

**$ git init <O nome do seu repositório>**



### 3. git clone

Esse comando Git cria uma cópia exata de um repositório já existente.

Então… quando usar git init e quando usar git clone? O git clone é mais avançado, uma vez que ele mesmo executa um comando git init internamente. Além disso, ele verifica todo o conteúdo do projeto.

Exemplo:

**git clone <URL do seu projeto>**



### 4. git add

Esse comando Git adiciona os arquivos especificados de código ao seu repositório, sejam arquivos novos ou arquivos anteriores que foram alterados. Oferece diferentes possibilidades de sintaxe.

Exemplo:

**$ git add seu_arquivo** (esse comando irá adicionar o arquivo em específico ao repositório)

**$ git add \*** (esse comando irá adicionar todos os arquivos novos e/ou modificados ao repositório)



### 5. git commit

É fundamental se estabelecer uma diferença entre git add e git commit:

- git add adiciona seus arquivos modificados à fila para serem submetidos a um commit posteriormente. Os arquivos **não** passaram por um commit.
- O git commit executa o commit dos arquivos que foram adicionados e cria uma nova revisão com um log. Por outro lado, se você não adicionar nenhum arquivo, o git não fará o commit de nada.

É possível combinar as duas ações em um único comando: **$ git commit -a**.

Também é possível adicionar uma mensagem para a execução de um commit. Exemplo:

**$ git commit -m “seu comentário”**



### 6. git branch

É comum na maior parte do tempo possuir múltiplas variações em seu repositório Git, chamadas de *branches* (“ramificações”). A grosso modo, um *branch* é um caminho independente de desenvolvimento, uma alternativa.

A princípio pode parecer fácil se perder em diversos caminhos, mas o comando git branch facilita o gerenciamento de tudo isso. Com diferentes parâmetros, é possível listar, criar ou apagar os *branches**.*

Exemplos:

**$ git branch** (lista todas as ramificações)

**$ git branch <nome_do_branch>** (cria um *branch* com o nome especificado)

**$ git branch -d <nome_do_branch>** (deleta o *branch* com o nome especificado)



### 7. git checkout

Ainda sobre *branches*, esse comando Git pode ser utilizado para trocar de uma ramificação para outra.

Exemplo:

**$ git checkout <nome_do_branch>**

Também é possível combinar operações, criando e fazendo o checkout de um novo *branch* com um único comando:

**$ git checkout -b <nome_do_branch_novo>**



### 8. git remote

O comando Git remote estabelece uma conexão entre seu repositório local e um repositório remoto.

Exemplo:

**$ git remote add <nomecurto> <url>**



### 9. git push

Esse comando serve para subir suas modificações para um repositório **remoto** conectado anteriormente com git remote.

Exemplo:

**$ git push -u <nome_curto> <nome_do_branch>**

É importante especificar a origem e o *upstream* antes de usar o git push. Veja o exemplo:

**$ git push –set-upstream <nome_curto> <nome_do_branch>**



#### Para ver comandos intermediários e avançados acesse o link da pesquisa:

:chart: Clique [AQUI](https://www.codigofonte.com.br/artigos/top-25-comandos-do-git)

