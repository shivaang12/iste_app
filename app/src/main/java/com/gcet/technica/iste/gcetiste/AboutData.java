package com.gcet.technica.iste.gcetiste;

/**
 * Created by shiva on 9/19/2015.
 */
public class AboutData {
    int pic;
    String name;
    String posi;

    public AboutData(int pic, String name, String posi) {
        this.pic = pic;
        this.name = name;
        this.posi = posi;
    }

    public int getPic() {
        return pic;
    }

    public String getName() {
        return name;
    }

    public String getPosi() {
        return posi;
    }
}
