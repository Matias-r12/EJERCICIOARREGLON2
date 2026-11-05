import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MAX = 3;

        AGENTE agentes[] = new AGENTE[MAX];

        for(int i = 0; i < agentes.length; i++){

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Energia: ");
            int energia = Integer.parseInt(sc.nextLine());

            System.out.print("Estado: ");
            String estado = sc.nextLine();

            agentes[i] = new AGENTE(nombre, energia, estado);
        }

        System.out.println("\nAGENTES");

        for(int i = 0; i < agentes.length; i++){
            agentes[i].mostrarEstado();
        }
    }
}