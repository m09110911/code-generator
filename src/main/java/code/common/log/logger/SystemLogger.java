package code.common.log.logger;

import code.common.log.formatter.LoggerFormatter;

/**
 * 简单的logger 实现
 *
 * @version 1.0
 * @create 2018-03-07 15:34
 **/
public final class SystemLogger extends AbstractLogger {

    @Override
    protected void outPrint(String msg) {
        System.out.println(msg);
    }

    public SystemLogger(String name, LoggerFormatter loggerFormatter) {
        super(name, loggerFormatter);
    }
}
