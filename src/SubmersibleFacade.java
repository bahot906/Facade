import java.util.logging.Logger;
import java.util.logging.Level;

class SubmersibleFacade {
    private static final Logger logger = Logger.getLogger(SubmersibleFacade.class.getName());

    private final PowerManagementSystem powerSystem;
    private final BallastControlSystem ballastSystem;
    private final ScientificEquipmentArray scienceArray;
    private final HydroacousticComms comms;

    public SubmersibleFacade(PowerManagementSystem powerSystem,
                             BallastControlSystem ballastSystem,
                             ScientificEquipmentArray scienceArray,
                             HydroacousticComms comms) {
        this.powerSystem = powerSystem;
        this.ballastSystem = ballastSystem;
        this.scienceArray = scienceArray;
        this.comms = comms;
    }

    public void startDeepDiveMission(int targetDepthMeters) {
        logger.info("\n=== НАЧАЛО МИССИИ ПОГРУЖЕНИЯ ===");
        try {
            powerSystem.initializeNuclearGenerator();
            powerSystem.routePowerToMotors(true);
            scienceArray.calibrateSensors();
            comms.establishAcousticLink();

            ballastSystem.floodTanks();
            ballastSystem.maintainDepth(targetDepthMeters);

            scienceArray.deployManipulatorArm();
            scienceArray.recordData();

            comms.sendStatusReport("Успешный спуск на глубину " + targetDepthMeters + "м. Начат забор проб.");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Сбой во время старта миссии: " + e.getMessage(), e);
        }
    }

    public void endMissionAndSurface() {
        logger.info("\n");
        try {
            scienceArray.retractManipulatorArm();
            comms.sendStatusReport(" Начинаем всплытие");

            ballastSystem.blowTanks();
            powerSystem.routePowerToMotors(false);
            comms.terminateLink();
            powerSystem.shutdown();

            logger.info();
        } catch (Exception e) {
            logger.log(Level.SEVERE, " " + e.getMessage(), e);
        }
    }
}