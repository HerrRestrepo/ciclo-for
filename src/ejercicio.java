import java.util.Scanner;
public class ejercicio {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int c_samsung = 0, c_iphone = 0, c_xioami = 0;
        // muy importante que estas variables esten por fuera o si no, seran borradas cada vez que se repita un nuevo ciclo 
        for (int index = 1; index <= 5; index++){
            int opcion = 0;
            System.out.println("Seleccione el producto que desea comprar: 1) Xioami 18 Fold.  2)Iphone Duo.  3)Samsung Fold 8.");
            System.out.println("Escriba la opción: ");
            opcion = sc.nextInt();
            if (opcion == 1) {
                System.out.println("Usted ha seleccionado el Xioami 18 Fold.");
                c_xioami++;
            } else if(opcion == 2){
                System.out.println("Usted ha seleccionado el Iphone Duo.");
                c_iphone++;
            }else if(opcion == 3){
                System.out.println("Usted ha seleccionado el Samsung Fold 8.");
                c_samsung++;
            }else {
                System.out.println("No contamos con esa referencia");
            }
        }
        System.out.println("El total de ventas de Xioami 18 Fold es: " + c_xioami);
        System.out.println("El total de ventas de Iphone Duo es: " + c_iphone);
        System.out.println("El total de ventas de Samsung Fold 8 es: " + c_samsung);
        sc.close();
    }
}
