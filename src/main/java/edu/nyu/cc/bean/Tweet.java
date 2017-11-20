package edu.nyu.cc.bean;

import lombok.Data;
import twitter4j.GeoLocation;
/**
 * Created by chaoqunhuang on 11/20/17.
 */
@Data
public class Tweet {
    private final long id;
    private final String text;
    private final String username;
    private final String date;
    private final double[] location;
    public Tweet(long id, String username, String text, String date, GeoLocation location) {
        this.id = id;
        this.username = username;
        this.text = text;
        this.date = date;
        this.location = new double[] {location.getLatitude(), location.getLongitude()};
    }
}
