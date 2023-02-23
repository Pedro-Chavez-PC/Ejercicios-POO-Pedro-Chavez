
package poo;
import java.util.Scanner;
public class CuentasBanco {
    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in);
        POO cuenta1 = new POO(500);
        POO cuenta2 = new POO(300);
        boolean banco = true;
        
        int accion2;
        
        while (banco){
            System.out.println("\n+------------------------------------------+");
            System.out.println("|             Menu principal               |");
            System.out.println("+------------------------------------------+");
            System.out.println("| 1. Ingresar dinero.                      |");
            System.out.println("| 2. Retirar dinero.                       |");
            System.out.println("| 3. Mostrar saldo.                        |");
            System.out.println("| 4. Salir.                                |");
            System.out.println("+------------------------------------------+");
            
            System.out.println("Elige tu opcion: ");
            int accion = opcion.nextInt();
            
            switch (accion){
                case 1:
                    System.out.println("\n+------------------------------------------+");
                    System.out.println("|            Depositar dinero              |");
                    System.out.println("+------------------------------------------+");
                    System.out.println("| A que cuenta desea ingresar dinero       |");
                    System.out.println("| 1. Cuenta No. 1                          |");
                    System.out.println("| 2. Cuenta No. 2                          |");
                    System.out.println("+------------------------------------------+");
                    System.out.println("Elige tu opcion: ");
                    accion2 = opcion.nextInt();
                    
                    switch (accion2) {
                        case 1: {
                            System.out.println("+------------------------------------------+");
                            System.out.print("| Ingrese la cantidad a depositar: ");
                            float deposito = opcion.nextFloat();
                            cuenta1.ingresar(deposito);
                            System.out.println("+------------------------------------------+");
                            break;
                        }
                        case 2: {
                            System.out.println("+------------------------------------------+");
                            System.out.print("| Ingrese la cantidad a depositar: ");
                            float deposito = opcion.nextFloat();
                            cuenta2.ingresar(deposito);
                            System.out.println("+------------------------------------------+");
                            System.out.printf("%.2f\n", cuenta2.mostrar());
                            break;
                        }
                        default:
                            System.out.println("+------------------------------------------+");
                            System.out.println("| Opcion no valida.                       |");
                            System.out.println("+------------------------------------------+");
                            break;
                    }
                    
                    break;
                case 2:
                    System.out.println("\n+------------------------------------------+");
                    System.out.println("|             Retirar dinero               |");
                    System.out.println("+------------------------------------------+");
                    System.out.println("| A que cuenta desea retirar dinero        |");
                    System.out.println("| 1. Cuenta No. 1                          |");
                    System.out.println("| 2. Cuenta No. 2                          |");
                    System.out.println("+------------------------------------------+");
                    System.out.println("Elige tu opcion: ");
                    accion2 = opcion.nextInt();

                    switch (accion2) {
                        case 1: {
                            System.out.println("+------------------------------------------+");
                            System.out.print("| Ingrese la cantidad a retirar: ");
                            float retiro = opcion.nextFloat();
                            if (retiro > cuenta1.mostrar()) {
                                System.out.println("+------------------------------------------+");
                                System.out.println("| Fondos insuficientes.                   |");
                                System.out.println("+------------------------------------------+");

                            } else {
                                cuenta1.retirar(retiro);
                                System.out.println("+------------------------------------------+");
                            }
                            break;
                        }
                        case 2: {
                            System.out.println("+------------------------------------------+");
                            System.out.print("| Ingrese la cantidad a retirar: ");
                            float retiro = opcion.nextFloat();
                            if (retiro > cuenta2.mostrar()) {
                                System.out.println("+------------------------------------------+");
                                System.out.println("| Fondos insuficientes.                   |");
                                System.out.println("+------------------------------------------+");

                            } else {
                                cuenta2.retirar(retiro);
                                System.out.println("+------------------------------------------+");
                            }
                            break;
                        }
                        default:
                            System.out.println("+------------------------------------------+");
                            System.out.println("| Opcion no valida.                       |");
                            System.out.println("+------------------------------------------+");
                            break;
            }
                    break;
                case 3:
                    System.out.println("\n+------------------------------------------+");
                    System.out.println("|             Mostrar dinero               |");
                    System.out.println("+------------------------------------------+");
                    System.out.println("| A cual cuenta deseas verle el saldo      |");
                    System.out.println("| 1. Cuenta No. 1                          |");
                    System.out.println("| 2. Cuenta No. 2                          |");
                    System.out.println("+------------------------------------------+");
                    System.out.println("Elige tu opcion: ");
                    accion2 = opcion.nextInt();
                    
                    switch (accion2){
                        case 1:
                            System.out.println("\n+------------------------------------------+");
                            System.out.println("El saldo de la cuenta 1 es: "+cuenta1.mostrar());
                            System.out.println("+------------------------------------------+");
                            break;
                        case 2:
                            System.out.println("\n+------------------------------------------+");
                            System.out.println("El saldo de la cuenta 1 es: "+cuenta2.mostrar());
                            System.out.println("+------------------------------------------+");
                            break;
                        default:
                            System.out.println("\n+------------------------------------------+");
                            System.out.println("| Opcion no valida.                       |");
                            System.out.println("+------------------------------------------+");
                            break;
                    }

                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
        
        System.out.println("---------------------------------");
        System.out.println("Saldo de la cuenta No.1 : "+cuenta1);
        System.out.println("\nSaldo de la cuenta No.2 : "+cuenta2);
        System.out.println("---------------------------------");
        
        System.out.println("\nIngrese un valor para abonar la cuenta No.1 : ");

        
        
        
    }
   
    
    
    
    
}
