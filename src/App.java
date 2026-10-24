import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int edad = 0;
        for(int index = 1; index <=5; index++){
            System.out.println("repeticion del ciclo en la vuelta " + index);
            System.out.println("ingrese su edad");
            edad = sc.nextInt();
            if (edad>18) {
                System.out.println("Es mayor de edad");
            }
        }
        
        sc.close();
    }
}
