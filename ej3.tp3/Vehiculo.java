package ej3.tp3;

class Vehiculo {
 protected String patente;
 protected String marca;

 public Vehiculo(String patente, String marca) {
     this.patente = patente;
     this.marca = marca;
 }

 public String getInfo() {
     return patente + " - " + marca;
 }
}
