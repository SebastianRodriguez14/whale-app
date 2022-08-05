package com.sebastianrod.whale_app;

public class WhaleModel {
    private String whaleName;
    private String whaleImage;
    private String whaleType;
    private String WhaleLocation;

    public WhaleModel() {
    }

    public WhaleModel(String whaleName, String whaleImage, String whaleType, String whaleLocation) {
        this.whaleName = whaleName;
        this.whaleImage = whaleImage;
        this.whaleType = whaleType;
        WhaleLocation = whaleLocation;
    }

    public String getWhaleName() {
        return whaleName;
    }

    public void setWhaleName(String whaleName) {
        this.whaleName = whaleName;
    }

    public String getWhaleImage() {
        return whaleImage;
    }

    public void setWhaleImage(String whaleImage) {
        this.whaleImage = whaleImage;
    }

    public String getWhaleType() {
        return whaleType;
    }

    public void setWhaleType(String whaleType) {
        this.whaleType = whaleType;
    }

    public String getWhaleLocation() {
        return WhaleLocation;
    }

    public void setWhaleLocation(String whaleLocation) {
        WhaleLocation = whaleLocation;
    }
}
