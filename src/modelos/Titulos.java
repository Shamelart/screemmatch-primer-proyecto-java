package modelos;

public class Titulos {
    private String nombre;
    private String sinopsis;
    private int fechaLanzamiento;
    private int duracionMinutos;
    private double calificacion;
    private boolean incluidoPlanBasico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public boolean isIncluidoPlanBasico() {
        return incluidoPlanBasico;
    }

    public void setIncluidoPlanBasico(boolean incluidoPlanBasico) {
        this.incluidoPlanBasico = incluidoPlanBasico;
    }

    public String clasificacion() {
        if (this.calificacion < 4) {
                return "Tiene una calificación muy mala";
        } else if (this.calificacion >= 4 && this.calificacion <= 6) {
                return "Tiene una calificación regular";
        } else {
                return "Calificación excelente";
        }
    }

    public void muetraFichaTecnica() {
        System.out.println("@****** Ficha Técnica ******@");
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaLanzamiento);
        System.out.println("Duración en minutos: " + getDuracionMinutos() + " minutos");
        System.out.println("Calificación: " + calificacion);
        System.out.println(clasificacion());
    }

}
