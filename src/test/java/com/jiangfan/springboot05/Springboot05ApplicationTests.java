package com.jiangfan.springboot05;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot05ApplicationTests {
    Logger logger = LoggerFactory.getLogger(this.getClass()); //获取日志记录器

    @Test
    public void contextLoads() {
        //日志级别由低到高  trace<debug<info<warn<error
        logger.trace("trace----日志跟踪轨迹");
        logger.debug("debug----日志调试信息");
        logger.info("info----答应常用日志");  //默认是info级别，所以只会输出info以上的级别日志
        logger.warn("warn-----这是警告信息");
        logger.error("error-----这是错误异常信息");
    }

}
