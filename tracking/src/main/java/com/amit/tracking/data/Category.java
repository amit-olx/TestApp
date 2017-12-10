package com.amit.tracking.data;


import com.amit.tracking.utils.Constant;

/**
 * Created by amit on 10/12/17.
 */

public class Category {

    String name;
    String id;
    String icon;
    int frequency;

    public Category() {
        this.name = Constant.EMPTY_STRING;
        this.name = Constant.EMPTY_STRING;
        this.icon = Constant.EMPTY_STRING;
        this.frequency = Constant.DEFAULT_FREQUENCY;
    }

    public Category(String name, String id, String icon) {
        this.name = name;
        this.name = id;
        this.icon = icon;
        this.frequency = Constant.DEFAULT_FREQUENCY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
