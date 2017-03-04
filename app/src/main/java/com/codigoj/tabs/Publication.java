package com.codigoj.tabs;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by JHON on 21/02/2017.
 */

public class Publication {

    public final static String TYPE_EVENT = "EVENTO";
    public final static String TYPE_PROMOTION = "PROMOCIÓN";

    private String id;
    private String name;
    private String description;
    private String type_publication;
    private int numCupos;
    private String date_start;
    private String date_end;

    public Publication(String id, String name, String description, String type_publication, int numCupos, String date_end) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type_publication = type_publication;
        this.numCupos = numCupos;
        Date hoy = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        date_start = format.format(hoy);
        this.date_end = date_end;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType_publication() {
        return type_publication;
    }

    public void setType_publication(String type_publication) {
        this.type_publication = type_publication;
    }

    public int getNumCupos() {
        return numCupos;
    }

    public void setNumCupos(int numCupos) {
        this.numCupos = numCupos;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public String getDate_end() {
        return date_end;
    }

    public void setDate_end(String date_end) {
        this.date_end = date_end;
    }
}
