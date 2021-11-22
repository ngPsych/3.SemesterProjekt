package domain;

import domain.BatchController;

public class Batch {

    private String id;
    private BatchController batchController;

    public Batch() {

    }

    public Batch(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    //TEST
    public void setId(String id) {
        this.id = id;
    }
}
