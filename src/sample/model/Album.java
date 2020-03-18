package sample.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Album {

    private SimpleIntegerProperty id;
    private SimpleIntegerProperty artistID;
    private SimpleStringProperty name;

    public Album() {
        this.id = new SimpleIntegerProperty();
        this.artistID = new SimpleIntegerProperty();
        this.name = new SimpleStringProperty();
    }

    public int getId() {
        return id.get();
    }

    public String getName() {
        return name.get();
    }

    public int getArtistID() {
        return artistID.get();
    }

    public void setId(int id) {
        this.id.set(id);;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public void setArtistID(int artistID) {
        this.artistID.set(artistID);
    }
}
