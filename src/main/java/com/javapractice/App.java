package com.javapractice;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG= LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
	LOG.info("HI");
        String message= "Hello vamshi|||!" ;
        LOG.debug(message+" Will be Printed On Debug");
        LOG.info(message +"will be printed on info");
        LOG.info("Print something");
        System.out.println(message);
    }
}
