package aula10e11heranca;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    //Métodos especiais

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    //Métodos personalizados
    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;
    }
    
}
