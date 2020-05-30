package top.kissshot.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import top.kissshot.springcloud.pojo.Product;

public interface ProductService {
	List<Product> list();
}