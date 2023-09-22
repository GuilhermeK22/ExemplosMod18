package anotacao;

@PrimeiraAnotacao(value = "Zé", bairros = "teste", numeroCasa = 20)
public class ClasseComAnotacao {
    @PrimeiraAnotacao(value = "Souza", bairros = {"teste", "teste1"}, numeroCasa = 20, valores = 100d)
    private String nome;
    @PrimeiraAnotacao(value = "Zé", bairros = "teste", numeroCasa = 20)
    public ClasseComAnotacao() {

    }
}
