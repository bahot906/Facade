import java.util.logging.Logger;

class BallastControlSystem {
    private static final Logger logger = Logger.getLogger(BallastControlSystem.class.getName());

    public void floodTanks() {
        logger.info("[BallastSystem] Заполнение цистерн водой. Начало погружения.");
    }

    public void blowTanks() {
        logger.info("[BallastSystem] Продувка цистерн сжатым воздухом. Начало всплытия.");
    }

    public void maintainDepth(int meters) {
        logger.info("[BallastSystem] Автоматическое удержание глубины: " + meters + " метров.");
    }
}