package modelos;

public class Series extends Titulos {
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionMinutoEpisodio;

    @Override
    public int getDuracionMinutos() {
        return duracionMinutoEpisodio * episodiosPorTemporada * temporadas;
    }

    public int temporadas() {
        return temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }


    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracionMinutoEpisodio() {
        return duracionMinutoEpisodio;
    }

    public void setDuracionMinutoEpisodio(int duracionMinutoEpisodio) {
        this.duracionMinutoEpisodio = duracionMinutoEpisodio;
    }

}
