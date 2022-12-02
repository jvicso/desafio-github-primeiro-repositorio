package aula12;

public class Aula12 {

    public static void main(String[] args) {
        // Animal a1 = new Animal();
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave av1 = new Ave();
        Canguru cang1 = new Canguru();
        Cachorro cach1 = new Cachorro();
        Cobra cobr1 = new Cobra();
        GoldFish gold1 = new GoldFish();
        Arara ara1 = new Arara();
        
                
        m1.setPeso(35.3);
        m1.setCorPelo("Marrom");
        m1.setIdade(8);
        m1.setMembros(4);
        m1.alimentar();
        m1.locomover();
        m1.emitirSom();
        
        av1.setPeso(0.35);
        av1.setCorPena("Branco");
        av1.setIdade(2);
        av1.setMembros(2);
        av1.alimentar();
        av1.locomover();
        av1.emitirSom();
        
        p1.locomover();
        r1.locomover();
        
        cang1.locomover();
        cang1.usarBolsa();
        
        cach1.locomover();
        cach1.abanarRabo();
        cach1.enterrarOsso();
        cach1.emitirSom();
        
        
    }
    
}
