package top.kissshot.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import cn.hutool.core.net.NetUtil;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServerApplication {
	public static void main(String[] args) {
		int port = 8030;
		if (!NetUtil.isUsableLocalPort(port)) {
			System.err.println("端口" + port + "已被占用!");
			System.exit(1);
		}
		new SpringApplicationBuilder(ConfigServerApplication.class).properties("server.port=" + port).run(args);
	}
}