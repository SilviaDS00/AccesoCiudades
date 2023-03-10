package entidades;

public class Pais {

    private String code;
    private String name;
    private String continent;
    private int population;
    private String capital;

    public Pais() {
    }

    public Pais(String code, String name, String continent, int population, String capital) {
        super();
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.capital = capital;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Pais [code=" + code + ", nombre = " + name + ", continente = " + continent + ", population = " + population + ",capital = " + capital;
    }

}
