package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.print("Modelo: " + this.modelo);
        System.out.print(", uma caneta: " + this.cor);
        System.out.print(", ponta: " + this.ponta);
        System.out.print(", carga: " + this.carga);
        System.out.println(", está tampada? " + this.tampada);
    }
    
    void rabiscar(){
        if (this.tampada == true) {
            System.out.println("Erro! Não posso rabiscar");
        }
        else {
            System.out.println("Estou Rabiscando");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
    
}
