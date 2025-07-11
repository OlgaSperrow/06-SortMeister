package de.upteams.sortmeister.model;

public class Advert {
    private Long id;
    private String title;
    private String description;
    private String photo;

    public Advert() {
    }

    public Advert(String description, String photo, String title) {
        this.description = description;
        this.photo = photo;
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
