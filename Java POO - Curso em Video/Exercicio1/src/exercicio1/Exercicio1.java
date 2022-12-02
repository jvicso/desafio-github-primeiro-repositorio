package exercicio1;

public class Exercicio1 {

    public static void main(String[] args) {
        Tenis t1 = new Tenis();
        t1.marca = "Nike";
        t1.modelo = "Air force 1";
        t1.cor = "Braco/Vermelho";
        t1.tamanho = 40;
        t1.valor = 800.00;  
        t1.colocar();
        
        t1.status();
        t1.ficarDeTenis();
        
        Tenis t2 = new Tenis();
        t2.marca = "Adidas";
        t2.modelo = "uPath Run";
        t2.cor = "Off white";
        t2.valor = 350.00;
        t2.retirar();
        
        t2.status();
        t2.ficarDeTenis();
    }
    
}
