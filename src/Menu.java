import modelos.Peliculas;
import modelos.Podcast;
import modelos.Series;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Menu {
    public void mostrarMenu() {
        int opcion = 0;
        Peliculas peliculaUsuario = new Peliculas();
        Series serieUsuario = new Series();
        Podcast podcastUsiario = new Podcast();
        Scanner eleccion = new Scanner(System.in);

        String menu = """
                    "@****** MENU PRINCIPAL ******@"
                    1.- Película
                    2.- Series
                    3.- Podcast
                    9.- salir
                    """;

        while (opcion != 9) {
            System.out.println(menu);
            System.out.println("Elija una opción por favor:");
            opcion = eleccion.nextInt();
            //eleccion.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Nombre del Titulo: ");
                    String nombre = eleccion.nextLine();
                    eleccion.nextLine();
                    System.out.println("Nombre del Director de la película: ");
                    String director = eleccion.nextLine();
                    System.out.println("Fecha de lanzamiento: ");
                    int fechaLanzamiento = eleccion.nextInt();
                    System.out.println("Ingrese la duración en minutos: ");
                    int duracionEnMinutos = eleccion.nextInt();
                    System.out.println("Califique la pelicula (1 al 10): ");
                    double calificacion = eleccion.nextDouble();

                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setDirector(director);
                    peliculaUsuario.setFechaLanzamiento(fechaLanzamiento);
                    peliculaUsuario.setDuracionMinutos(duracionEnMinutos);
                    peliculaUsuario.setCalificacion(calificacion);
                    peliculaUsuario.muetraFichaTecnica();
                    break;

                case 2:
                    System.out.println("Nombre del titulo: ");
                    nombre = eleccion.nextLine();
                    eleccion.nextLine();
                    System.out.println("Fecha de lanzamiento: ");
                    fechaLanzamiento = eleccion.nextInt();
                    System.out.println("Numero de temporadas: ");
                    int temporada = eleccion.nextInt();
                    System.out.println("Numero de episodios: ");
                    int eposidio = eleccion.nextInt();
                    System.out.println("Ingrese la duración en minutos: ");
                    duracionEnMinutos = eleccion.nextInt();
                    System.out.println("Califique la serie" + nombre + "rango 1 al 10: ");
                    calificacion = eleccion.nextDouble();
                    eleccion.nextLine();

                    serieUsuario.setNombre(nombre);
                    serieUsuario.setFechaLanzamiento(fechaLanzamiento);
                    serieUsuario.setTemporadas(temporada);
                    serieUsuario.setEpisodiosPorTemporada(eposidio);
                    serieUsuario.setDuracionMinutoEpisodio(duracionEnMinutos);
                    serieUsuario.setCalificacion(calificacion);
                    serieUsuario.muetraFichaTecnica();
                    break;

                case 3:
                    System.out.println("Nombre del titulo: ");
                    nombre = eleccion.nextLine();
                    eleccion.nextLine();
                    System.out.println("Nombre del anfitiron(a):");
                    String nombreAnfitrion = eleccion.nextLine();
                    System.out.println("Fecha de lanzamiento: ");
                    fechaLanzamiento = eleccion.nextInt();
                    System.out.println("Ingrese la duración en minutos: ");
                    duracionEnMinutos = eleccion.nextInt();
                    System.out.println("Califique la pelicula (1 al 10): ");
                    calificacion = eleccion.nextDouble();
                    eleccion.nextLine();

                    podcastUsiario.setNombre(nombre);
                    podcastUsiario.setAnfitrion(nombreAnfitrion);
                    podcastUsiario.setFechaLanzamiento(fechaLanzamiento);
                    podcastUsiario.setDuracionMinutos(duracionEnMinutos);
                    podcastUsiario.setCalificacion(calificacion);
                    podcastUsiario.muetraFichaTecnica();
                    break;
                case 9:
                    System.out.println("Saliendo del programa");
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
