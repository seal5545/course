package com.course;

@SpringBootApplication
@EnableEurekaSever
public class EurekaApplication {
    private static final Logger LOG = LoggerFactory.getLogger(EurekaApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(EurekaApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功！！");
        LOG.info("Eureka地址: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }
}
