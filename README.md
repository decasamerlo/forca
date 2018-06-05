# Jogo Da Forca

UFSC - Universidade Federal de Santa Catarina
CTC - Centro Tecnológico
CCO - Ciência da Computação
Trabalho Final de Programação Orientada a Objetos II - 2018.1

Funcionalidades do Jogo da Forca:

# (0) Página inicial:
        * Cadastro para jogar(1);
        * Jogar sem login(2);
        * Logar em uma conta ja existente(3);
        * Sair da aplicação.

# (1) Interface gráfica de cadastro de login:
        * Nome do Usuário;
        * Data de nascimento;
        * CPF para identificação única;
        * Uma senha;
        * Confirmação de senha.
        * Após isso ele será direcionado novamente para a página inicial(0).

# (2) Jogo da Forca:
        * Será selecionada uma palavra aleatória e o usuário começa chutando uma letra na aplicação através de um teclado virtual;
        * Conforme o usuário for chutando, as letras vão ficando escuras no teclado virtual;
        * Se errar a tecla fica vermelha e verde se a palavra conter a letra;
        * O usuário tem 10 chances para acertar a palavra;
        * Se o usuário tiver dificuldade de acertar a palavra, pode escolher entre dois níveis de dicas;
        * Jogadores serão diferenciados entre os que usam dicas e os que não usam;
        * Erros ou acertos pontuam diferentemente: erro -1 e acerto +3;
        * É possível tentar acertar a palavra completa em qualquer momento do jogo, somando uma pontuaçãode acordo com o estado do jogo;
        * A pontuação e o número de jogadas de usuários cadastrados são salvos nas respectivas contas;
        * Usuários sem login não podem salvar a pontuação e o número de jogadas;
        * No final do jogo, jogadores logados vão para sua Dashboard(3), enquanto que os sem login vão para  a página inicial.

# (3) Dashboard:
		Esta tela mostra as seguintes informações dos usuários cadastrados:
        * Os pontos acumulados nos jogos do usuário;
        * Quantos jogos o usuário já participou;
        * Uma classificação do nível do jogador;
        * O recorde pessoal;
        * O recorde de todos os usuários;
        * Um ranking dos usuários cadastrados;
        * Opção de deslogar da sua conta;
        * Também a opção para iniciar um novo jogo.