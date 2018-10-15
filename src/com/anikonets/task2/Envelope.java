package com.anikonets.task2;

import java.util.Objects;

public class Envelope {

    private double height;
    private double width;

    public Envelope() {
    }

    public Envelope(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public boolean isSmaller(Envelope otherEnvelope) {
        return (this.width < otherEnvelope.width && this.height < otherEnvelope.height)
                || (this.width < otherEnvelope.height && this.height < otherEnvelope.width);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Envelope envelope = (Envelope) o;
        return Double.compare(envelope.height, height) == 0 &&
                Double.compare(envelope.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

}