package aula10e11heranca;

public class Bolsista extends Aluno {
    private double bolsa;
    
    //Métodos especiais
    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
    //Métodos personalizados
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de: " +  this.nome);
    }
    
    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista! Pagamento facilitado.");
    }
    
}
