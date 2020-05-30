package top.kissshot.springboot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import top.kissshot.springboot.pojo.Product;
import top.kissshot.springboot.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService service;

	@RequestMapping("/list")
	public Object list(Model m) {
		List<Product> ps = service.list();
		m.addAttribute("ps", ps);
		return "products";
	}
}
