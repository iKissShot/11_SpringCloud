package top.kissshot.springboot.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import top.kissshot.springboot.pojo.Product;

@FeignClient(value = "PRODUCT-DATA-SERVICE")
public interface ProductClientFeign {

	@GetMapping("/product/list")
	public List<Product> list();

}