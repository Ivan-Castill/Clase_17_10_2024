
public class Vehiculos {

    String modelo;
    int anio;
    String color;
    String tipo;
    int fuerza;

    public Vehiculos(String modelo, int anio, String color) {
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    public Vehiculos(String modelo) {
        this.modelo = modelo;
    }

    public Vehiculos(String modelo,String tipo,int fuerza){
        this.modelo= modelo;
        this.tipo= tipo;
        this.fuerza= fuerza;
    }

    public Vehiculos(String modelo, String tipo, int fuerza, int anio){
        this.modelo= "BMW";
        this.tipo= "Traccion delantera";
        this.fuerza= 6000;
        this.anio= 2024;
    }

    public void imprimir2m3() {
        System.out.println("El modelo es :" + modelo +
                "El tipo de auto es:" + tipo +
                "La fuerza del vehiculo es:" + fuerza+
                "El anio es:"+anio);
    }
    public void imprimir2m(){
        System.out.println("El modelo es :"+modelo+
                "El tipo de auto es:"+tipo+
                "La fuerza del vehiculo es:"+fuerza);
    }
    public void imprimir(){
        System.out.println("El modelo es :"+modelo+
                           "El anio del vehiculo es:"+anio+
                           "El color del vehiculo es:"+color);
    }
    public void imprimirm(){
        System.out.println("El modelo es :"+modelo);
    }

    }

