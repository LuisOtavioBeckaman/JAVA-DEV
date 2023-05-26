package POOIntroducao;

public class App {
    public static void main(String[] args) {
        //criando o objeto
        RegistraAluno aluno1 = new RegistraAluno();
        RegistraAluno aluno2 = new RegistraAluno();
        //setando os atributos do objeto
        aluno1.setNome("Ana Carla Pereira");
        aluno2.setNome("Flavinho do Pneu");
        aluno1.setIdade(17);
        aluno2.setIdade(15);
        aluno1.setEndereco("Rua qualquer , Jd. Qualquer coisa , nºX");
        aluno2.setEndereco("Rua Paraguai , Jd. Piaui  , nºX");
        aluno1.setNotaCiencias(8);
        aluno2.setNotaCiencias(9.5);
        aluno1.setNotaMatematica(10);
        aluno2.setNotaMatematica(10);
        aluno1.setNotaPortugues(6.5);
        aluno2.setNotaPortugues(1);
        //mostrando os atributos com o get
        System.out.println("Nome: "+aluno1.getNome());
        System.out.println("Idade: "+aluno1.getIdade());
        System.out.println("Endereço: "+aluno1.getEndereco());
        System.out.println("Média: "+aluno1.getMedia());
        System.out.println("Nome: "+aluno2.getNome());
        System.out.println("Idade: "+aluno2.getIdade());
        System.out.println("Endereço: "+aluno2.getEndereco());
        System.out.println("Média: "+aluno2.getMedia());
    }
}