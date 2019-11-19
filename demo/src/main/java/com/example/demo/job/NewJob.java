package com.example.demo.job;

import java.util.Date;  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import org.quartz.JobExecutionContext;  
import org.quartz.JobExecutionException;  
  
public class NewJob implements BaseJob {  
  
    private static Logger logger = LoggerFactory.getLogger(NewJob.class);
     
    public NewJob() {  
          
    }  
     
    public void execute(JobExecutionContext context) throws JobExecutionException {
        logger.info("New Job执行时间 start : " + new Date());
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("New Job执行时间 end : " + new Date());
    }  
}  