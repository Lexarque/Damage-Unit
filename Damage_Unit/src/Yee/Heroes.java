package Yee;

public class Heroes {

    String name;
    int level = 0, damage = 0;

    String name() {
        name = "Kross";
        return name;
    }
    int level(){
        level = 30;
        return level;
    }
    int total(){
        damage = level() * 120;
        return damage;
    }
    void hasil(){
        System.out.println("Total damage " + name + " = " + damage);
    }
}
