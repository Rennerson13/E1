public class Racao {
    private String marca;
    private String sabor;
    private boolean disponivel;

    public void status(){
        System.out.println("Ração de sabor " + sabor);
        System.out.println("Marca: " + marca);
        System.out.println("Está disponível? " + disponivel);
    }

    public Racao(String marca, String sabor, boolean disponivel){
        this.marca = marca;
        this.sabor = sabor;
        this.disponivel = disponivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    // Métodos
    public void servir(){
        System.out.println("Servindo ração...");
    }

    public void guardar(){
        System.out.println("Ração guardada.");
    }

    public void verificarDisponibilidade(){
        if(disponivel){
            System.out.println("Ração disponível.");
        } else {
            System.out.println("Ração indisponível.");
        }
    }
}
