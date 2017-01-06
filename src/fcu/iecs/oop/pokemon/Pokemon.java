package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable{
	private String nickName;
	private int cp;
	private PokemonType type;
	public Pokemon(String nickName, int cp, PokemonType type) {
		this.nickName = nickName;
		this.cp = cp;
		this.type = type;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public PokemonType getType() {
		return type;
	}
	
}
