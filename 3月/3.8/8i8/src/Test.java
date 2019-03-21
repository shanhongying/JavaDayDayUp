import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Test {
    public static final Logger logger = LogManager.getLogger(Test.class);

    public static void main(String args[])
    {
        logger.info("测试");
        logger.warn("警告");
        logger.debug("记录一下");
    }
}
