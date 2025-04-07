package fr.diginamic.dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppService
{
    private static final Logger LOGGER = LoggerFactory.getLogger(AppService.class);


    public void executer(String param)
    {

        LOGGER.debug("Traitement 1 : param = {}", param);
        LOGGER.debug("Traitement 2 : param = {}", param);

    }

    public void executeWithTimeStamp(String param){

        long start = System.currentTimeMillis();
        executer(param);
        long end = System.currentTimeMillis();
        LOGGER.info("Finished executer() in {} seconds", (end - start) / 1000.0);

    }
}