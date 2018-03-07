package code.common.log.manager;

import code.common.log.enums.Level;
import code.common.log.factory.LoggerFactory;
import code.common.log.factory.SystemLoggerFactory;
import code.common.log.logger.Logger;

/**
 * QQ群：528344775
 *
 * @author chengchaochao
 * @create 2018-03-07 9:55
 **/
public interface LoggerManager {
    enum Holder {
        INST;
        private LoggerFactory defaultFactory = new SystemLoggerFactory();
    }


    static void setFactory(LoggerFactory newFactory) {
        Holder.INST.defaultFactory = newFactory;
    }

    static LoggerFactory getFactory() {
        return Holder.INST.defaultFactory;
    }


    static Logger getLogger(Class<?> binding) {
        return Holder.INST.defaultFactory.create(binding);
    }

    static Logger getLogger(String binding) {
        return Holder.INST.defaultFactory.create(binding);
    }


    static void setLevel(String path, Level level) {
        Holder.INST.defaultFactory.setLevel(path, level);
    }


    static void setLevel(Class<?> clazz, Level level) {
        Holder.INST.defaultFactory.setLevel(clazz, level);
    }

}
