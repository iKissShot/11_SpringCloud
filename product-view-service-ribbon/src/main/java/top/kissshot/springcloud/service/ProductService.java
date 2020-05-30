package top.kissshot.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.kissshot.springcloud.client.ProductClientRibbon;
import top.kissshot.springcloud.pojo.Product;

@Service
public class ProductService {
	@Autowired
	ProductClientRibbon clientRibbon;

	public List<Product> list() {
		return clientRibbon.list();
	}
}