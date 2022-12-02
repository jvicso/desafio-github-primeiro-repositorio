package exercicio1;

public class Tenis {
    String marca;
    String modelo;
    String cor;
    int tamanho;
    double valor;
    boolean calcado;
    
    void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Valor: R$" + this.valor);
        System.out.println("Ele está calçado? " + this.calcado);
    }
    
    void colocar() {
        this.calcado = true;
    }
    
    void retirar() {
        this.calcado = false;
    }
    
    void ficarDeTenis() {
        if(this.calcado == true) {
            System.out.println("*Você pode ficar de tênis, pois está calçado com ele.");
            System.out.println();
        }
        else {
            System.out.println("*ERRO! Você não pode ficar de tênis, pois não está calçado com ele.");
            System.out.println();
        }
    }
    
    
    
    
}
