public class Main {
    public static void main(String[] args) {
        PowerManagementSystem power = new PowerManagementSystem();
        BallastControlSystem ballast = new BallastControlSystem();
        ScientificEquipmentArray science = new ScientificEquipmentArray();
        HydroacousticComms comms = new HydroacousticComms();

        SubmersibleFacade submersible = new SubmersibleFacade(power, ballast, science, comms);

        submersible.startDeepDiveMission(4000);

        System.out.println("\n Выполнение научных работ на дне...\n");

        submersible.endMissionAndSurface();
    }
}