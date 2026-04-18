package ej3.tp3;

public class Main {
    public static void main(String[] args) {

        Vendedor v1 = new Vendedor("Juan", "001");
        Vendedor v2 = new Vendedor("Maria", "002");
        Vendedor v3 = new Vendedor("Pedro", "003");
        
        Vehiculo ve1 = new Moto("224PAOS", "Honda");
        Vehiculo ve2 = new Moto("344JASJ", "Yamaha");
        Vehiculo ve3 = new Moto("666DEMO", "Kawasaki");
        Vehiculo ve4 = new Moto("845PASO", "Suzuki");
        Vehiculo ve5 = new Moto("093DMEF", "Ducati");
        
        Vehiculo ve6 = new Auto("AFB142", "Toyota");
        Vehiculo ve7 = new Auto("PAS343", "Ford");
        Vehiculo ve8 = new Auto("EIR565", "Chevrolet");
        Vehiculo ve9 = new Auto("GEI567", "Volkswagen");
        Vehiculo ve10 = new Auto("IAM696", "Peugeot");

        v1.agregarVehiculo(ve1);
        v1.agregarVehiculo(ve2);
        v1.agregarVehiculo(ve3);

        v2.agregarVehiculo(ve4);
        v2.agregarVehiculo(ve5);
        v2.agregarVehiculo(ve6);

        v3.agregarVehiculo(ve7);
        v3.agregarVehiculo(ve8);
        v3.agregarVehiculo(ve9);
        v3.agregarVehiculo(ve10);

        v1.mostrarVehiculos();
        v2.mostrarVehiculos();
        v3.mostrarVehiculos();
    }
}
