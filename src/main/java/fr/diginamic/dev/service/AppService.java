package fr.diginamic.dev.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppService
{
    private static final Logger LOGGER = LoggerFactory.getLogger(AppService.class);


    public void executer(String param)
    {

        LOGGER.info("Traitement 1 : param = {}", param);
        LOGGER.debug("Traitement 1 : param = {}", param);


        /*
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        double time = (double)(start - end )* 1000;
        LOG.info("in {} seconds", time);
        */

    }
}