package code.common.log.formatter;

import code.common.log.enums.Level;

import java.time.Instant;

/**
 * 格式化 实现
 * @version 1.0
 * @create 2018-03-07 15:08
 **/
public class BaseFormatter implements LoggerFormatter{

    private static int rowLength = 5;

    @Override
    public String apply(Level level, String name, String message) {
        return new StringBuilder()
                .append(Instant.now().toString())
                .append(" ")
                .append(level.toText())
                .append(" [")
                .append(Thread.currentThread().getName())
                .append("] ")
                .append(name)
                .append(" -")
                .append(adjustWidth(message))
                .toString();
    }

    private String adjustWidth(String message){
        StringBuilder stringBuilder = new StringBuilder();
        if(message.length() > rowLength){
            int count = message.length() / rowLength;
            int remainder = message.length() % rowLength;
            for(int i = 0 ; i < count ; i +=rowLength){
                stringBuilder.append(message.substring(i,i+rowLength));
                stringBuilder.append("\n");
            }
            if(remainder != 0){
                stringBuilder.append(message.substring(message.length()-remainder,message.length()));
            }
        }
        return stringBuilder.toString();
    }

}
