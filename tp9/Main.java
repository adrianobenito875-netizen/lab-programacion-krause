package tp_9;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String[][] datosCantantes = {
            {"Taylor Swift", "Pop", "1500000", "18", "Tree Paine"},
            {"Bad Bunny", "Reggaeton", "RECHAZADO", "12", "Noah Assad"},
            {"Coldplay", "Rock", "1200000", "3", "Phil Harvey"},
            {"Duki", "Trap", "500000", "14", null}
        };

        ArrayList<Cantante> cantantes = new ArrayList<>();

        Festival festival = new Festival();

        for (int i = 0; i < datosCantantes.length; i++) {

            try {

                String nombre = datosCantantes[i][0];
                String genero = datosCantantes[i][1];

                int cachet = Integer.parseInt(datosCantantes[i][2]);

                int canciones = Integer.parseInt(datosCantantes[i][3]);

                String manager = datosCantantes[i][4];

                Cantante cantante = new Cantante(nombre, genero, cachet, canciones, manager);

                cantantes.add(cantante);

                festival.realizarSoundcheck(cantante);

                cantante.asignarEscenarios("Escenario Principal");

                cantante.liquidHonorarios(15);

                System.out.println("Manager: " + cantante.getManager().toUpperCase());

            }

            catch (NumberFormatException e) {
                System.out.println("Error numérico: " + e.getMessage());
            }

            catch (EspectaculoCortoException e) {
                System.out.println("Error: " + e.getMessage());
            }

            catch (NullPointerException e) {
                System.out.println("Error de referencia nula: " + e.getMessage());
            }

            catch (IllegalArgumentException e) {
                System.out.println("Argumento inválido: " + e.getMessage());
            }

            finally {
                System.out.println("Procesamiento del artista finalizado.\n");
            }

        }

        System.out.println("Cantantes cargados correctamente: " + cantantes.size());

    }

}