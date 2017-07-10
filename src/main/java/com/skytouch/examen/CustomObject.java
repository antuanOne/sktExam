package com.skytouch.examen;


import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class CustomObject {
    private int id;
    private String key = "";
    private String value = "";
    private String description = "";

    public void build() {
        setId(new Random().nextInt(100) + 1);
        setKey(new BigInteger(130,  new SecureRandom()).toString(32));
        setValue(new BigInteger(130,  new SecureRandom()).toString(32));
        setDescription(new BigInteger(130,  new SecureRandom()).toString(32));
    }

    @Override
    public String toString() {
        return "ConfigurationType [id=" + getId() + ", key=" + getKey() + ", value=" + getValue()
                + ", description=" + getDescription() +"]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
