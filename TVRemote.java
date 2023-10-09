public class TVRemote {
    
    private TVRemote() {
    }

    private static TVRemote tvRemote;

    public static TVRemote getTVRemote() {
        if (tvRemote == null) {
            tvRemote = new TVRemote();
        }
        return tvRemote;
    }

    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }

    public void changeChannel(int channel) {
        System.out.println("Changing to channel " + channel);
    }
}

