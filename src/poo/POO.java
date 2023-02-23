package poo;
public class POO {
    double saldo;

    public POO(int saldo) {
        this.saldo = saldo;
    }
   
    
    public void ingresar(double saldo){
        this.saldo += saldo;
    }
    
    public void retirar(double saldo){
        this.saldo -= saldo;
    }
    
    public double mostrar(){
        return this.saldo;
    }
    
}
