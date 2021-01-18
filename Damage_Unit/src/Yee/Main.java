package Yee;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Enemy bad = new Enemy();
        Heroes good = new Heroes();
        System.out.println("Enemy HP : " + bad.hp());
        System.out.println("Damage Dealt : " + good.total());
        System.out.println("Remaining HP : " + bad.death());


    }

}