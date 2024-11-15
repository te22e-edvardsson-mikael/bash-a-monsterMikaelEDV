public class Main {
    public static void main(String[] args) {

    Hero hero = new Hero();
    Enemy enemy = new Enemy();

    //namn av hero
    hero.name = "Hero!";

    //namn av enemy
    enemy.name = "enemy!";


        System.out.println(hero.name + " meets" + enemy.name + " who has " + enemy.hp + "hp");


        enemy.hp -= 10;

        System.out.println(hero.name + " hits" + enemy.name );
        System.out.println(enemy.name + " has " + enemy.hp + " hp left");

    }

}
