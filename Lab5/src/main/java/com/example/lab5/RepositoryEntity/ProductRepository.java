package com.example.lab5.RepositoryEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.example.lab5.entity.Product;
import com.example.lab5.lab6.bai3.Report;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	//
	@Query("SELECT o FROM Product o WHERE o.price BETWEEN ?1 AND ?2")
	List<Product> findByPrice(double minPrice, double maxPrice);
	
	//cách 2 List<Product> findByPriceBetween(double minPrice, double maxPrice);
	
	
	
	//
	@Query("SELECT o FROM Product o WHERE o.name LIKE ?1")
	Page<Product> findByKeywords(String keywords, Pageable pageable);
	
	//cách 2 Page<Product> findAllByNameLike(String keywords, Pageable pageable);
	
	
	//
	@Query("SELECT new Report(o.category, sum(o.price), count(o)) "
			+ " FROM Product o "
			+ " GROUP BY o.category"
			+ " ORDER BY sum(o.price) DESC")
			List<Report> getInventoryByCategory();

}
