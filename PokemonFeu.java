package pokemon;

public class PokemonFeu extends Pokemon {

    public PokemonFeu() {
        super();
    }

    public PokemonFeu(String name, int hp, int atk){
        super(name, hp, atk);
    }

    public int attack(Pokemon p) {
        if (p instanceof PokemonEau) {
            p.hp -= this.atk / 2;
            System.out.println("ça ne fonctionne pas très bien");
        } else if (p instanceof PokemonPlante) {
            p.hp -= this.atk * 2;
            System.out.println("c'est super efficace!");
        }else {
            p.hp -= this.atk;
        }
        return p.hp;
    }
}