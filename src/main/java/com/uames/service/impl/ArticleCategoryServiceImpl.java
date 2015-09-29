package com.uames.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.uames.dto.ArticleCategoryDto;
import com.uames.service.ArticleCategoryService;
import com.uames.service.BaseService;
import com.uames.vo.ArticleCategory;
@Component
public class ArticleCategoryServiceImpl extends BaseService 
	implements ArticleCategoryService {

	/**
	 * 获取所有的文章分类
	 */
	public List<ArticleCategory> getAllArtiCategorys() {		
		return categoryDao.selectArticleCategorys();
	}
	
	/**
	 * 带文章统计的分类列表
	 */
	public List<ArticleCategoryDto> getArtCatesAndCount() {
		return categoryDao.selectArtCatesAndCount();
	}
	
	/**
	 * 添加分类
	 */
	public boolean addCategory(ArticleCategory category) {
		int result = categoryDao.insertCategory(category);
		return result>0;
	}

	/**
	 * 删除分类
	 */
	public boolean deleteCategory(ArticleCategory category) {
		int result = categoryDao.deleteCategory(category);
		return result>0;
	}

	/**
	 * 更新分类
	 */
	public boolean updateCategory(ArticleCategory category) {
		int result = categoryDao.updateCategory(category);
		return result>0;
	}
}
