public class PersonalComputer extends Product{

    private ComputerCase computerCase;
    private Motherboard motherboard;
    private Monitor monitor;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Motherboard motherboard, Monitor monitor) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
}
