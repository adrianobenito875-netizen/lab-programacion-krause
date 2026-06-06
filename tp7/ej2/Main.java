package tp7_ej2;

public class Main {

	public static void main (String[] args) {
		String[][] Dat = {
				{"El Principito", "9789504000044", "3200"},
				{"Donde viven los monstruos", "9789877381501", "2800"},
				{"Matilda", "9788420432885", "4500"},
				{"Charlie y la fábrica de chocolate", "9788420432878", "4500"},
				{"El árbol generoso", "9789877380125", "2600"},
				{"Harriet, la espía", "9788420401164", "5100"},
				{"El ratón que se comió la luna", "9788416648931", "2200"},
				{"Las aventuras de Pippi Mediaslargas", "9788420400891", "3900"},
				{"El mago de Oz", "9789504000815", "3500"},
				{"El hobbit", "9788445000687", "6200"}
				};
		
		Libro[] libros = new Libro[Dat.length];
		
		for (int i = 0; i < Dat.length; i++) {
            libros[i] = new Libro(
                Dat[i][0],
                Dat[i][1],
                Integer.parseInt(Dat[i][2])
            );
        }

		Biblioteca biblioteca = new Biblioteca();
		
			 for (Libro libro : libros) {
		            biblioteca.agregarLibros(libro);
		        }
			 
			 biblioteca.listarLibros();

		        System.out.println("Cantidad de libros: "
		                + biblioteca.cantidadLibros());			
		}
	}
