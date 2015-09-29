package com.uames.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.uames.dao.ArticleCategoryDao;
import com.uames.dao.ArticleCommentDao;
import com.uames.dao.ArticleDao;
import com.uames.dao.ArticleTagDao;
import com.uames.dao.ExtendPageDao;
import com.uames.dao.FriendlyLinkDao;
import com.uames.dao.UserDao;

/**
 * 
 * 基础的Service
 * @author jim
 */
public class BaseService {
	
	@Autowired
	protected ArticleCategoryDao categoryDao;
	
	@Autowired
	protected ArticleCommentDao articleCommentDao;
	
    @Autowired
    protected ArticleDao articleDao;
    
	@Autowired
	protected ArticleTagDao articleTagDao;
	
	@Autowired
	protected ExtendPageDao extendPageDao;
	
	@Autowired
	protected FriendlyLinkDao friendlyLinkDao;
	
	@Autowired
	protected UserDao userDao;

}
