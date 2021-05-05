package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

//Adater design pattern
public class JLoggerManagerAdapter implements LoggerService{

    @Override
    public void logToSystem(String message) {
        JLoggerManager manager=new JLoggerManager();
        manager.log(message);
    }
}
