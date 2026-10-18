import java.util.logging.Logger;

class HydroacousticComms {
    private static final Logger logger = Logger.getLogger(HydroacousticComms.class.getName());

    public void establishAcousticLink() {
        logger.info("");
    }

    public void sendStatusReport(String status) {
        logger.info("" + status);
    }

    public void terminateLink() {
        logger.info("");
    }
}