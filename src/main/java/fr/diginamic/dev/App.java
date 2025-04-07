package fr.diginamic.dev;

import fr.diginamic.dev.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App
{
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args)
    {
        LOGGER.info("Hello!");
        LOGGER.info("Implementation Logback");


        int temp = 20;
        StringBuilder msg = new StringBuilder();
        msg.append("Current temp is ").append(temp);

        LOGGER.info(msg.toString());
        LOGGER.info("Temp is {}", temp);

        AppService a = new AppService();
//        a.executer("Message de test");

        a.timeStamp("Test message");
    }
}