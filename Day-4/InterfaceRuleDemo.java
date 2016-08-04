interface IStarPlayer
{
	void extraPower();
}
interface IBonusPlayer{
	void moreBonusPoints();
}
interface Hybrid extends IPlayer, IStarPlayer, IBonusPlayer{
	
}
class GreenPlayerImpl implements Hybrid{
//class GreenPlayerImpl implements IStarPlayer, IBonusPlayer,IPlayer{

	@Override
	public int attack() {
		// TODO Auto-generated method stub
		return 70;
	}

	@Override
	public int defense() {
		// TODO Auto-generated method stub
		return 40;
	}

	@Override
	public int jump() {
		// TODO Auto-generated method stub
		return 90;
	}

	@Override
	public int run() {
		// TODO Auto-generated method stub
		return DEFAULT_SPEED;
	}

	@Override
	public void moreBonusPoints() {
		// TODO Auto-generated method stub
		System.out.println("Green Bonus Point...");
	}

	@Override
	public void extraPower() {
		System.out.println("Green Extra Power...");
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceRuleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
