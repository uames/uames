package com.uames.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.uames.service.ArticleTagService;
import com.uames.service.BaseService;
import com.uames.vo.Article;
import com.uames.vo.ArticleTag;
import com.uames.vo.RelArticleTag;

@Component
public class ArticleTagServiceImpl extends BaseService 
	implements ArticleTagService {
	
	/**
	 * 获取所有标签
	 */
	public List<ArticleTag> getAllTags() {		
		return articleTagDao.queryAllTags();
	}
	
	/**
	 * 获取文章标签
	 */
	public List<ArticleTag> getArticleTags(Map<String, Object> param) {
		return articleTagDao.queryArticleTags(param);
	}
	
	/**
	 * 更新文章标签
	 */
	public boolean updateArticleTag(ArticleTag tag) {
		
		int result = articleTagDao.updateArticleTag(tag);
		return (result>0);
	}
	
	/**
	 * 保存文章标签
	 */
	
	public boolean saveArticleTag(ArticleTag tag) {
		
		int result = articleTagDao.insertTag(tag);
		return (result>0);
	}

	/**
	 * 添加文章标签
	 */
	
	@Transactional
	public int saveRelArticleTag(Article article, List<Integer> tags) {
		
		int size = 0;
		if (article != null && tags.size() > 0) {
			for (int i = 0; i < tags.size() ; i++) {
				RelArticleTag rel = new RelArticleTag();
				rel.setArticleId(article.getId());
				rel.setTagId(tags.get(i));
				int count = articleTagDao.insertArticleTag(rel);
				size += count;
			}
		}	
		return size;
	}

	
	public boolean deleteTag(ArticleTag tag) throws Exception {
		
		int result = articleTagDao.deleteTag(tag);
		return (result > 0);
	}

	
	public boolean deleteArticleTag(RelArticleTag tags) throws Exception {		
		int result = articleTagDao.deleteArticleTag(tags);
		return (result > 0);
	}
    
    
}
