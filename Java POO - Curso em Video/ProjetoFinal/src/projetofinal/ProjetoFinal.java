package projetofinal;

public class ProjetoFinal {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 10 de HTML");
        v[2] = new Video("Aula 3 de Python");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Joao", 22, "M", "joao321");
        g[1] = new Gafanhoto("Maria", 33, "F", "mariazinha777");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]); // Joao assiste Python
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(g[0], v[1]); // Joao assiste HTML
        vis[1].avaliar(87.00);
        System.out.println(vis[1].toString());
        
        
        
        
        /*System.out.println("VÍDEOS\n---------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n---------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/
    }
    
}
