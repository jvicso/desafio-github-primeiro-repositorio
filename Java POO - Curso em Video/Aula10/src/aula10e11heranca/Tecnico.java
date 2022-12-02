package aula10e11heranca;

public class Tecnico extends Aluno {
    private int registroProfissional;
    
    //Métodos especiais
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    //Métodos personalizados
    public void praticar() {
        System.out.println("Aluno técnico: " + this.nome + " está praticando.");
    }
    
}
