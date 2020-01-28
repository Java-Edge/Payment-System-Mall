package com.javaedge.mall.dao;

import com.javaedge.mall.MallApplicationTests;
import com.javaedge.mall.pojo.Category;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author JavaEdge
 */
public class CategoryMapperTest extends MallApplicationTests {

	@Autowired
	private CategoryMapper categoryMapper;

	@Test
	public void findById() {
		Category category = categoryMapper.findById(100001);
		System.out.println(category.toString());
	}

	@Test
	public void queryById() {
		Category category = categoryMapper.queryById(100001);
		System.out.println(category.toString());
	}
}