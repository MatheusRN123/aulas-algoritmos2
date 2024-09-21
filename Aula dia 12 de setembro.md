Class Livro:
String titulo;
String autor;
Integer anoPublicacao;
Boolean emprestado;

estaDisponivel();
todosLivrosEmprestados();

Class Emprestimo:
String nomeLeitor;
Date dataDevolucao;

registrarNovoEmprestimo(Livro livro, String leitor, Date devolucao);