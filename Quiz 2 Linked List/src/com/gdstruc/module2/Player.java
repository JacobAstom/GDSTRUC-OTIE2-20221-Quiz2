package com.gdstruc.module2;

import java.util.Objects;

public class Player {
    private String name;

    public Player(int id, String name, int level) {this.name = name;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}


    @Override
    public String toString() {return name;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return name.equals(player.name);
    }

    @Override
    public int hashCode() {return Objects.hash(name);}
}
