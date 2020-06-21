package kr.ac.hansung.cse.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.Product;

//카테고리로 조회하기 위한 method
public interface ProductRepository extends CrudRepository<Product, Integer>{
	List<Product> findByCategory(String category);
}