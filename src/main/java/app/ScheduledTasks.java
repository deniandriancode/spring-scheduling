package app;

import java.text.*;
import java.util.*;

import org.slf4j.*;
import org.springframework.scheduling.annotation.*;
import org.springframework.stereotype.*;

@Component
public class ScheduledTasks {

    private final static Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
    private final static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        logger.info("The time is now {}", dateFormat.format(new Date()));
    }

}
