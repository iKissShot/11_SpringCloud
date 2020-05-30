package top.kissshot.springcloud.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import top.kissshot.springcloud.pojo.Product;

@Component
public class ProductClientRibbon {
	@Autowired
	RestTemplate restTemplate;

	public List<Product> list() {
		return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/product/list", List.class);
	}
}