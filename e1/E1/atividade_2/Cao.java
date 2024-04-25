public class Cao {
    private String raca;
    private String cor;
    private int idade;

    public void status(){
        System.out.println("Cão de raça " + raca);
        System.out.println("Cor: " + cor);
        System.out.println("Idade: " + idade);
    }

    public Cao(String raca, String cor, int idade){
        setRaca(raca);
        setCor(cor);
        setIdade(idade);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métodos adicionais
    public void late(){
        System.out.println("Cão latindo...");
    }

    public void dorme(){
        System.out.println("Cão dormindo...");
    }

    public void come(){
        System.out.println("Cão comendo...");
    }
}
