package com.revature.data;

import com.revature.model.WishList;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListRepository extends JpaRepository<WishList, Integer> {
	
	List<WishList> findAllByUserIdOrderByCreatedDateDesc(Integer userId);

}
