import java.util.logging.Logger;

class ScientificEquipmentArray {
    private static final Logger logger = Logger.getLogger(ScientificEquipmentArray.class.getName());

    public void calibrateSensors() {
        logger.info("Калибровка гидростатических датчиков давления и температуры завершена");
    }

    public void deployManipulatorArm() {
        logger.info("Роботизированный манипулятор выдвинут для забора проб");
    }

    public void retractManipulatorArm() {
        logger.info(" Роботизированный манипулятор сложен в защитный отсек");
    }

    public void recordData() {
        logger.info(" Запись телеметрии и сканирование дна океана активированы");
    }
}