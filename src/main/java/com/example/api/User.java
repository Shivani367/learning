package com.example.api;

public class User {
    private int id;
    private String name;
    private String email;

    // ✅ ADD THIS — Jackson needs it to deserialize JSON
    public User() {}

    // Constructor
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters & Setters
    public int getId()            { return id; }
    public String getName()       { return name; }
    public String getEmail()      { return email; }

    public void setId(int id)          { this.id = id; }
    public void setName(String name)   { this.name = name; }
    public void setEmail(String email) { this.email = email; }
}