public class Funcionario {
    private String nome;
    private String sobrenome;
    boolean ativo;
    private float salario;
    int age;

    public Funcionario(String nome,String sobrenome,
    boolean ativo,float salario,int age){

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ativo = ativo;
        this.salario = salario;
        this.age = age;

    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public float getSalario(){
        return this.salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public String nomeCompleto(){
        return this.nome +' '+this.sobrenome;
    }

    public void isActive(){
        if(this.ativo){
            System.out.println("Funcionário ativo");
        }else{
            System.out.println("Funcionário inativo");
        }
    }

}