package sample.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Artist {
    private SimpleIntegerProperty id;
    private SimpleStringProperty name;

    public SimpleIntegerProperty getId() {
        return id;
    }

    public SimpleStringProperty getName() {
        return name;
    }

    public void setId(SimpleIntegerProperty id) {
        this.id = id;
    }

    public void setName(SimpleStringProperty name) {
        this.name = name;
    }
}
