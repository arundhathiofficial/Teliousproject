package com.telious.Repository;

import com.telious.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
 interface ProductRepository extends JpaRepository<ProductEntity,Long>{


}
