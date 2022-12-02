package aula04;

public class Caneta {
   private String modelo;
   private String cor;
   private float ponta;
   private boolean tampada;
   
   public Caneta(String m, String c, float p) { //Este é o método construtor
       this.setModelo(m);
       this.setCor(c);
       this.setPonta(p);
       this.tampar();
   }
   
   public String getModelo() {
       return this.modelo;
   }
  
   public void setModelo (String m) {
       this.modelo = m;
   }
   
   public float getPonta() {
       return this.ponta;
   }
   
   public void setPonta(float p) {
       this.ponta = p;
   }
   
   public void status() {
       System.out.println("SOBRE A CANETA");
       System.out.println("Modelo: " + this.getModelo());
       System.out.println("Ponta: " + this.getPonta());
       System.out.println("Cor: " + this.cor);
       System.out.println("Está tampada? " + this.tampada);
   }
   
   public void tampar() {
       this.tampada = true;
   }
   
   public void destampar() {
       this.tampada = false;
   }
   
   public String getCor() {
       return this.cor;
   }
  
   public void setCor(String c) {
       this.cor = c;
   }
   
   public boolean getTampada() {
       return this.tampada;
   }
   
   public void setTampada(boolean t) {
       this.tampada = t;
   }
}
