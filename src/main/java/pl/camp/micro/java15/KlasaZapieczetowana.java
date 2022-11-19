package pl.camp.micro.java15;

public sealed class KlasaZapieczetowana permits KlasaDziedziczaca1, KlasaDziedziczaca2 {
    private String name;
    private String race;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
