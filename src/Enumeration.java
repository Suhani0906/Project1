enum GAME_DIFFICULTY{
	EASY,
	MEDIUM,
	HARD
}
public class Enumeration {
	public static void main(String args[])
	{
		GAME_DIFFICULTY variable = GAME_DIFFICULTY.MEDIUM;
		
		switch(variable)
		{
		case EASY:{
			System.out.println("You have selected easy game");
			break;
		}
		case MEDIUM:{
			System.out.println("You have selected medium game");
			break;
		}
		case HARD:{
			System.out.println("You have selected hard game");
			break;
		}
		
		}
		
	}

}
