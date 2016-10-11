package model;

import java.net.URL;

/**
 *
 * @author Evert
 */
public class Image {

    int imageId;
    URL url;

    public Image() {

    }

    public Image(int imageId, URL url) {
        this.imageId = imageId;
        this.url = url;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

}
