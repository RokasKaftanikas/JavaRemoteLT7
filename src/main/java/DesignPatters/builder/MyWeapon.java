package DesignPatters.builder;

import DesignPatters.builder.Weapon;

public class MyWeapon {
    public static void main(String[] args) {
        new Weapon.Builder(3).
                withSize(4).
                withType("Machine gun").
                build();
    }
}
