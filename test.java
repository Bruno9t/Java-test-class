import java.text.MessageFormat;

public class test{
    public static void main(final String[] args) {

        Funcionario f1 = new Funcionario("Bruno","Medeiros",true,6000,19);
        Funcionario f2 = new Funcionario("Sherlock","Holmes",true,6000,19);

        Funcionario[] funcionarios = new Funcionario[2];

        funcionarios[0] = f1;
        funcionarios[1] = f2;

        for(int i=0;i<funcionarios.length;i++){
            System.out.println(MessageFormat.format(
                "Nome Completo: {0} {1}",
                funcionarios[i].getNome(),
                funcionarios[i].getSobrenome()
            ));
        }
        

    }
}