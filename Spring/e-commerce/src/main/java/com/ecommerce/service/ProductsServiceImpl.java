package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.dao.ProductsDao;
import com.ecommerce.entity.Products;
@Service
public class ProductsServiceImpl implements  ProductsService{
	
	@Autowired
	private ProductsDao productsDao;

	@Override
	public Products getProduct(String productId) {
		// TODO Auto-generated method stub
		return productsDao.getById(productId);
	}

	@Override
	public Products addProducts(Products product) {
		// TODO Auto-generated method stub
		productsDao.save(product);
		return product;
	}

}