
public class llamarclase {
    public static void main(String[] args) {
        // Crear instancias de Vehiculos
        Vehiculos auto1 = new Vehiculos("Toyota", 2024, "Negro");
        Vehiculos auto2 = new Vehiculos("Chevrolet", 2012, "Plateado");
        Vehiculos auto3 = new Vehiculos("Ferrari");
        Vehiculos auto4 = new Vehiculos("Tesla", "Traccion tracera", 4000 );
        Vehiculos auto5 = new Vehiculos();
        // Imprimir detalles de los vehículos
        auto1.imprimir();
        auto2.imprimir();
        auto3.imprimirm();
        auto4.imprimir2m();
        auto5.imprimir2m3();
    }
}
