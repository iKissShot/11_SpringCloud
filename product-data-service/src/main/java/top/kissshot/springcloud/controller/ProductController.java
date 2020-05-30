package top.kissshot.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.kissshot.springcloud.pojo.Product;
import top.kissshot.springcloud.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService service;

	@RequestMapping("/list")
	public Object proproducts() {
		List<Product> ps = service.list();
		return ps;
	}
}