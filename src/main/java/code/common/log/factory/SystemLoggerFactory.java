package code.common.log.factory;

import code.common.log.formatter.LoggerFormatter;
import code.common.log.logger.Logger;
import code.common.log.logger.SystemLogger;

/**
 * @version 1.0
 * @create 2018-03-07 16:18
 **/
public class SystemLoggerFactory extends  AbstractLoggerFactory {
    @Override
    public Logger make(String binding, LoggerFormatter formatter) {
        return new SystemLogger(binding,formatter);
    }

    @Override
    public Class<SystemLoggerFactory> loggerClass() {
        return SystemLoggerFactory.class;
    }
}
