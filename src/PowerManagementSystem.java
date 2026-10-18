import java.util.logging.Logger;

class PowerManagementSystem {
    private static final Logger logger = Logger.getLogger(PowerManagementSystem.class.getName());

    public void initializeNuclearGenerator() {
        logger.info(" Реактор запущен. Напряжение стабильное");
    }

    public void routePowerToMotors(boolean enable) {
        if (enable) {
            logger.info("Питание подано на маневровые двигатели");
        } else {
            logger.info("Питание двигателей отключено");
        }
    }

    public void shutdown() {
        logger.info("[Перевод системы в режим минимального энергопотребления");
    }
}