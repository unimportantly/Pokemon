package pokemon;

public class Pokemon {

    //attributes
    String name;
    int hp, atk;
    boolean pokemonIsDead = false;

    //constructors
    public Pokemon() {
    }

    public Pokemon(String name, int hp, int atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    //methods
    public boolean isDead() {
        if (this.hp <= 0) {
            pokemonIsDead = true;
            System.out.println(this.name + " is dead!");
        }
        return pokemonIsDead;
    }

    public int attack(Pokemon p) {
        p.hp -= this.atk;
        return p.hp;
    }

    public void roundResult(Pokemon p) {
        while (this.pokemonIsDead == false && p.pokemonIsDead == false) {
            System.out.println(this.name + " has " + this.hp + " hp left. " + this.name +"'s turn!");
            this.attack(p);
            p.isDead();
            System.out.println(p.name + " has " + p.hp + " hp left. " + p.name +"'s turn!");
            p.attack(this);
            this.isDead();

        }
    }
}
