package com.uames.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.uames.constants.ResponseResult;
import com.uames.service.ArticleCategoryService;
import com.uames.service.ArticleCommentService;
import com.uames.service.ArticleService;
import com.uames.service.ArticleTagService;
import com.uames.service.ExtendPageService;
import com.uames.service.FriendlyLinkService;
import com.uames.service.UserService;

/**
 * BaseController 继承了ResponseResult常量类，
 * BaseController的集合了所以的Service对象，并实现自动注入
 * BaseController包含了Logger记录器
 * @author jim
 */
public class BaseController extends ResponseResult {
    
    //Logger
    protected static Logger LOGGER =  LoggerFactory.getLogger(BaseController.class);
    
    /**
     * The below is common service
     */
  
	//文章service
    @Autowired
    protected ArticleService articleService;
    
    //友情链接service
    @Autowired
    protected FriendlyLinkService friendlyService;
	
    //文章评论service
	@Autowired
	protected ArticleCommentService articleCommentService;
	
	//文章标签service
	@Autowired
	protected ArticleTagService articleTagService;
	
	//导航分类service
    @Autowired
    protected ArticleCategoryService articleCategoryService;
    
	//友情链接Service
	@Autowired
	protected FriendlyLinkService friendlyLinkService;
    
	//用户Service
	@Autowired
	protected UserService userService;
	
	//文章分类Service
	@Autowired
	protected ArticleCategoryService articleCateService;
	
	//文章分类Service
	@Autowired
	protected ExtendPageService extendPageService;
    
}
