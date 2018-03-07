package code.common.log;

import code.common.log.logger.Logger;
import code.common.log.manager.LoggerManager;
import org.junit.Before;
import org.junit.Test;

/**
 * @version 1.0
 * @create 2018-03-07 16:35
 **/
public class LoggerTest {
    private static Logger LOG ;

    @Before
    public void before(){
        LOG = LoggerManager.getLogger(LoggerTest.class);
    }

    @Test
    public void testInfo(){
        LOG.info("测试----------");
        LOG.info("123456789");
        LOG.info("测试两个参数 %s%a","哈哈",99.99);
    }
}
