package com.atduyar.rental.Domain.Entity;

import com.atduyar.rental.Domain.Enums.TitleType;

import java.util.Objects;

public class Music extends Title {
    private String producer;
    private String singer;
    private int duration;
    private int tracks;

    public Music(int rentalCode, String name, String description, TitleType type, String producer, String singer,
            int duration, int tracks) {
        super(name, description, rentalCode, type);
        this.producer = producer;
        this.singer = singer;
        this.duration = duration;
        this.tracks = tracks;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Music music = (Music) o;
        return duration == music.duration && tracks == music.tracks && Objects.equals(producer, music.producer)
                && Objects.equals(singer, music.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), producer, singer, duration, tracks);
    }

    @Override
    public String toString() {
        return "Domain.Entity.Music{" +
                "producer='" + producer + '\'' +
                ", singer='" + singer + '\'' +
                ", duration=" + duration +
                ", tracks=" + tracks +
                '}';
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public double getLateFeePerDay(int day) {
        int price = 0;

        // calculate with day

        return price;
    }
}
