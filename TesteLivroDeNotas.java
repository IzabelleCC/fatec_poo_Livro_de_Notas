public class TesteLivroDeNotas{
    public static void main(String args []){
        //nome completamente modificado
        String nomeDisciplina = javax.swing.JOptionPane.showInputDialog("Digite o nome da disciplina");
        //variavel de referencia
        var livroDeNotas = new LivroDeNotas(nomeDisciplina); // inferencia de tipo
        //livroDeNotas.nomeDisciplina = nomeDisciplina;
        livroDeNotas.exibirMensagem();
        System.out.println("A disciplina e " + livroDeNotas.getNomeDisciplina());
        System.out.println("Ate Logooo!!");
        livroDeNotas.setNomeDisciplina("Portugues");
    }
}