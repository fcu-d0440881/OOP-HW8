package fcu.iecs.oop.pokemon;

public class Bulbasaur extends Pokemon{

	public Bulbasaur(String nickName, PokemonType type, int cp) {
		super(nickName, cp, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("Tackle¡K");
	}
	
}
