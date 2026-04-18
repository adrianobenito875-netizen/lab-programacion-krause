package ej2.tp3;

public class Main {
 public static void main(String[] args) {

     Libro l1 = new Libro(183728920, "1984");
     Libro l2 = new Libro(227437491, "El Principito");
     Libro l3 = new Libro(308394817, "Don Quijote");
     Libro l4 = new Libro(478932784, "Cien años de soledad");
     Libro l5 = new Libro(598317499, "La Odisea");
     Libro l6 = new Libro(678438747, "Crimen y castigo");
     Libro l7 = new Libro(775291378, "Orgullo y prejuicio");
     Libro l8 = new Libro(898743879, "Matar a un ruiseñor");
     Libro l9 = new Libro(901398809, "Fahrenheit 451");
     Libro l10 = new Libro(108437184, "El gran Gatsby");
     Libro l11 = new Libro(117284784, "La metamorfosis");
     Libro l12 = new Libro(122748729, "Los juegos del hambre");
     Libro l13 = new Libro(139217918, "El señor de los anillos");
     Libro l14 = new Libro(149274893, "Harry Potter y la piedra filosofal");
     Libro l15 = new Libro(154187743, "El código Da Vinci");
     
     Socio s1 = new Socio(1, "Juan");
     Socio s2 = new Socio(2, "María");
     Socio s3 = new Socio(3, "Pedro");

     s1.agregarLibro(l1);
     s1.agregarLibro(l2);
     s1.agregarLibro(l3);
     s1.agregarLibro(l4);
     s1.agregarLibro(l5);
     
     s2.agregarLibro(l6);
     s2.agregarLibro(l7);
     s2.agregarLibro(l8);
     s2.agregarLibro(l9);
     s2.agregarLibro(l10);

     s3.agregarLibro(l11);
     s3.agregarLibro(l12);
     s3.agregarLibro(l13);
     s3.agregarLibro(l14);
     s3.agregarLibro(l15);

     s1.mostrarLibros();
     s2.mostrarLibros();
     s3.mostrarLibros();
 }
}
