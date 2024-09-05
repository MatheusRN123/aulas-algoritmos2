 novo Cliente => Mateus <br>
 
 novo Produto: <br>
 => Camiseta R$ 80,00 <br>
 => Calça R$ 301,00 <br>
 => Sapato R$ 150,00 <br>
 => Chapeu R$ 600,00 <br>
 => Bolsa R$ 21.000,00 <br>

 novo Carrinho<br>

 Carrinho.adicionarProduto(camiseta) = ordem 0 <br>
Carrinho.adicionarProduto(chapeu) = ordem 1 <br>
Carrinho.getValorTotal() == 880,00 <br>
Carrinho.removerProduto(0); <br>
Carrinho.getValorTotal() == 800,00 <br>

<p>
Cliente: <br>
String nome <br>

getNome(); <br>
setNome(nome);
</p>

<p>
Produto: <br>
String nome <br>
Integer valor <br>

getNome() <br>
setNome(nomeProduto) <br>
double getValor() <br>
setValor(double valor)
</p>

<p>
Carrinho: <br>
Cliente cliente <br>
Integer valorTotal <br>
Array[produto] produtos <br>

int AdicionarPriduto(Produto prod); <br>
    removerProduto(int ordem); <br>
double getValorTotal();
</p>