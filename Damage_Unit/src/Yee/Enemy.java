package Yee;

public class Enemy {

    String name;
    int hp, def;
    String att;

    Heroes good = new Heroes();

    void stats(){
        name = "Lune";
        hp = 10320;
        def = 900;
        att = "???";
        System.out.println("=====================================================");
        System.out.println("Enemy Details : ");
        System.out.println("Name = " + name + "\nHp = " + hp + "\nDef = " + def + "\nAttack = " + att);
        System.out.println("=====================================================");
    }
    int hp(){
        hp = 10320;
        return hp;
    }
    int death(){
        int mv = hp();
         mv -= good.total();
         return mv;
    }
}
