public class AGENTE {

    private String nombre;
    private int nivelEnergia;
    private String estado;

    public AGENTE(String nombre, int nivelEnergia, String estado) {
        this.nombre = nombre;

        if(nivelEnergia >= 0 && nivelEnergia <= 100)
            this.nivelEnergia = nivelEnergia;
        else
            this.nivelEnergia = 0;

        this.estado = estado;
    }

    public void mostrarEstado(){

        System.out.println("Nombre: " + nombre);
        System.out.println("Energia: " + nivelEnergia);
        System.out.println("Estado: " + estado);
        System.out.println();
    }
}
