
public class LivroDeNotas{
    // variavel de instancia
    //encapsulamento (oculta detalhes)
    private String nomeDisciplina;
    
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    public void setNomeDisciplina(Strinq nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public void exibirMensagem(){
        System.out.printf("Bem vindo ao livro de notas de %s \n", nomeDisciplina);
    }

    //construtor padrao
    LivroDeNotas(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

}