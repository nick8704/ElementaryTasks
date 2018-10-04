package com.anikonets.task2;

public class Cover {

    private double height;
    private double width;

    public Cover() {
    }

    public Cover(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public boolean canPut (Cover otherCover) {
        return (this.width < otherCover.width && this.height < otherCover.height)
                || (this.width < otherCover.height && this.height < otherCover.width);
    }

}