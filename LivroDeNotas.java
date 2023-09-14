
public class LivroDeNotas{
    // variavel de instancia
    String nomeDisciplina;

    public void exibirMensagem(){
        System.out.printf("Bem vindo ao livro de notas de %s \n", nomeDisciplina);
    }

    //construtor padrao
    LivroDeNotas(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
}