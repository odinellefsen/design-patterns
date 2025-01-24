package designpatterns5041.assignment02.loggerfactories;

import designpatterns5041.assignment02.loggers.ConsoleLogger;
import designpatterns5041.assignment02.loggers.Logger;

public class ConsoleLoggerFactory implements LoggerFactory {
    @Override
    public Logger create() {
        return new ConsoleLogger();
    }
} 