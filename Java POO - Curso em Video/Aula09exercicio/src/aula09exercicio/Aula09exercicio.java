package aula09exercicio;

public class Aula09exercicio {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro [] l = new Livro [3];
        
        p[0] = new Pessoa("Joao", 21, "Masculino");
        p[1] = new Pessoa("Flavia", 24, "Feminino");
        p[2] = new Pessoa("Ana", 33, "Feminino");
        
        l[0] = new Livro("O poder do hábito", "Charles Duhigg", 408, p[2]);
        l[1] = new Livro("Ponto de inflexão", "Fávio Augusto", 208, p[0]);
        l[2] = new Livro("O Último Desejo", "Andrzej Sapkowski", 320, p[1]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
        System.out.println(l[2].detalhes());
        
        System.out.println(l[3].detalhes());
    }
}
