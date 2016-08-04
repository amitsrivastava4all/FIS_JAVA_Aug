// abstract interface IPlayer
// Interface is abstract so we can't create the object of interface
// It is use by implementation
interface IPlayer{
	int TOP_SPEED = 100; //public static final int TOP_SPEED =100;
	int DEFAULT_SPEED = 10;
	// What to Do ?
	int attack(); //public abstract int attack();
	int defense();
	int jump();
	int run();
}
// How to Do?
class RedPlayerImpl implements IPlayer{
	@Override
	public int attack(){
		return 10;
	}

	@Override
	public int defense() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int jump() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public int run() {
		// TODO Auto-generated method stub
		return DEFAULT_SPEED;
	}
}
class BlackPlayerImpl implements IPlayer{

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int defense() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public int jump() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int run() {
		// TODO Auto-generated method stub
		return DEFAULT_SPEED;
	}
	
}
class Game
{
	public void callPlayer(IPlayer iplayer){
		System.out.println("Attack "+iplayer.attack());
		System.out.println("Defense "+iplayer.defense());
		System.out.println("Run "+iplayer.run());
		System.out.println("Jump "+iplayer.jump());
		if(iplayer instanceof GreenPlayerImpl){
			GreenPlayerImpl g = (GreenPlayerImpl) iplayer;
			g.extraPower();
			g.moreBonusPoints();
		}
		
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		game.callPlayer(new RedPlayerImpl());
		game.callPlayer(new BlackPlayerImpl());
		System.out.println("****************************");
		game.callPlayer(new GreenPlayerImpl());

	}

}
