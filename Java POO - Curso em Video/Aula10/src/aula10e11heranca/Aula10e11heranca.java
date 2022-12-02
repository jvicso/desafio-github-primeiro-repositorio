package aula10e11heranca;

public class Aula10e11heranca {

    public static void main(String[] args) {
        
        //Pessoa p1 = new Pessoa(); Não pode ser instanciada pois é uma classe abstrata
        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        Funcionario f1 = new Funcionario();
        Visitante v1 = new Visitante();
        Bolsista b1 = new Bolsista();
        Tecnico t1 = new Tecnico();
        
        //p1.setNome("Pedro");
        
        a1.setNome("Maria");
        p1.setNome("Claudio");
        f1.setNome("Fabiana");
        v1.setNome("Juvenal");
        b1.setNome("Cleber");
        t1.setNome("Rita");
        
        //p1.setSexo("M");
        a1.setSexo("F");
        p1.setSexo("M");
        f1.setSexo("F");
        v1.setSexo("M");
        b1.setSexo("M");
        t1.setSexo("F");
        
        //p1.setIdade(30);
        a1.setIdade(16);
        p1.setIdade(35);
        f1.setIdade(23);
        v1.setIdade(22);
        b1.setIdade(17);
        t1.setIdade(21);
        
        a1.setMatricula(3241);
        a1.setCurso("Java POO");
        b1.setMatricula(3242);
        b1.setCurso("Python");
        b1.setBolsa(12.50);
        t1.setMatricula(3243);
        t1.setCurso("Desenvolvedor FullStack");
        t1.setRegistroProfissional(1111);
        
        p1.setEspecialidade("Java");
        p1.setSalario(2552.64);
        
        f1.setTrabalhando(true);
        f1.setSetor("Estoque");
        
        a1.pagarMensalidade();
        b1.pagarMensalidade();
        t1.pagarMensalidade();
        t1.praticar();
        
        /* Essas linhas não funcionam pois estão sendo referenciadas de forma errada
        p1.receberAumento(550.20); 
        a1.mudarTrabalho();
        f1.cancelarMatricula(); */
        
        //System.out.println(p1.toString());
        System.out.println(a1.toString());
        System.out.println(p1.toString());
        System.out.println(f1.toString());
        System.out.println(v1.toString());
        System.out.println(b1.toString());
        System.out.println(t1.toString());
        
        
        
       
        
        
        
        
    }
    
}
