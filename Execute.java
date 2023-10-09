public class Execute {

	public static void main(String[] Args){

		TVRemote tvRemote = TVRemote.getTVRemote();
		tvRemote.turnOn();
		tvRemote.changeChannel(5);
		tvRemote.turnOff();
	}

}

