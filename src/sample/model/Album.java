package sample.model;

public class Album {

    private int id;
    private String name;
    private int artistID;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getArtistID() {
        return artistID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtistID(int artistID) {
        this.artistID = artistID;
    }
}
