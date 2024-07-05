import javax.swing.JOptionPane;

public class Pessoa3 {
    //Atributos
    public String nome;
    public int idade;
    protected double renda;

    public Pessoa3() {}

    public Pessoa3 (String n, int i, double r) {

        this.nome = n;
        this.idade = i;
        this.renda = r;
    }

    //métodos
    public void imprimeDados() {
        JOptionPane.showMessageDialog(null,"nome:" + nome
        +"\nIdade: "+idade
        +"\nRenda: "+renda);
    }
    //metodos de acesso
    public String getNome () {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getrenda () {
        return renda;
    }
    public void setNome (String n) {
        nome = n;
    }
    public void setidade (int i) {
        idade = i;
    }
    public void setRenda (double r) {
        renda = r;
    }
   


}


