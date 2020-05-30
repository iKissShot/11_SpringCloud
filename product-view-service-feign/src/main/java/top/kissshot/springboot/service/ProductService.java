package top.kissshot.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.kissshot.springboot.client.ProductClientFeign;
import top.kissshot.springboot.pojo.Product;

@Service
public class ProductService {
	@Autowired
	ProductClientFeign clientFeign;

	public List<Product> list() {
		return clientFeign.list();
	}
}