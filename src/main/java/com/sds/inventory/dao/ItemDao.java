package com.sds.inventory.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sds.inventory.entity.Item;

@Repository
public interface ItemDao extends JpaRepository<Item, Long>{

}
