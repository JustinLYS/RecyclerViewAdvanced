package com.example.recyclerviewadvanced;

// TODO Set Data Type
public class Profile {
    private String name, number, img;
    private boolean isPinned;

    public Profile(String name, String number, String img) {
        this.name = name;
        this.number = number;
        this.img = img;
        this.isPinned = false;
    }

    public Profile(String name, String number) {
        this.name = name;
        this.number = number;
        this.img = null;
        this.isPinned = false;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public boolean getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(boolean pinned) {
        this.isPinned = pinned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
