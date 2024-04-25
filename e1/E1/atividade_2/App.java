public class App {
    public static void main(String[] args){
        // Cao
        Cao cao = new Cao("Labrador", "Preto", 3);
        System.out.println("\n");
        cao.status();
        cao.late();
        cao.dorme();
        cao.come();



        // Racao
        Racao racao = new Racao("Pedigree", "Carne", true);
        System.out.println("\n");
        racao.status();
        racao.servir();
        racao.guardar();
        racao.verificarDisponibilidade();




        // Casa
        Casa casinha = new Casa("Madeira", "Marrom", true);
        System.out.println("\n");
        casinha.status();
        casinha.entrar();
        casinha.sair();
        casinha.verificarHabitabilidade();
    }
}
//TESTE DE MESA
//Casa casinha = new Casa("Madeira", "Marrom", true);
// No construtor da classe Casa
//this.material = "Madeira";
//this.cor = "Marrom";
//this.habitavel = true;
//String material = casinha.getMaterial(); // retorna "Madeira"
//String cor = casinha.getCor(); // retorna "Marrom"
//boolean habitavel = casinha.isHabitavel(); // retorna verdadeiro
