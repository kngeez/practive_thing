public class Car {

    private String toggle = "up";

    public String boop() {
        return "BOOP!";
    }
    public void toggleWindow() {
        if (toggle == "up")
            toggle = "down";
        else
            toggle = "up";
    }
    public String getWindowStatus() {
        return toggle;
    }
}
