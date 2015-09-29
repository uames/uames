package com.uames.service;

import com.uames.dto.CommentsDto;
import com.uames.dto.Page;
import com.uames.dto.PageResult;
import com.uames.vo.ArticleComment;

/**
 * Article comment Service
 * @author jim
 * @version 1.0
 */
public interface ArticleCommentService {
	
	/**
	 * 添加评论
	 * @param comment
	 * @return boolean
	 */
	public boolean addComment(ArticleComment comment);
	
	/**
	 * 删除评论
	 * @param comment
	 * @return boolean
	 */	
	public boolean deleteComment(ArticleComment comment);
    
	/**
	 * 检索文章相应的评论列表
	 * @param articleId
	 * @return PageResultDto
	 */
	public PageResult<CommentsDto> getArticleComment(Integer articleId,
			Page page);

    
    /**
     * 统计某文章的评论数量
     * @param articleId
     * @return int
     */
    public int countOfArticleComments(Integer articleId);
    
    /***
     * 发送评论通知
     * @param comment
     * @param readUrl
     * @throws Exception
     */
    public void notifyByEmail(ArticleComment comment, String readUrl) 
			throws Exception;
}
