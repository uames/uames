package com.uames.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.uames.service.BaseService;
import com.uames.service.FriendlyLinkService;
import com.uames.vo.FriendlyLink;

@Component
public class FriendlyLinkServiceImpl extends BaseService
	implements FriendlyLinkService {

	/**
	 * 获取友情链接
	 */
	
	public List<FriendlyLink> getFriendlyLinks() {		
		return friendlyLinkDao.getFriendlyLinks();
	}

	/**
	 * 添加友情链接
	 */
	
	public boolean addFriendlyLink(FriendlyLink friendlyLink) {     
        int result = friendlyLinkDao.addFriendlyLink(friendlyLink);
		return (result > 0);
	}

	/**
	 * 更新友情链接
	 */
	
	public boolean updateFriendLink(FriendlyLink friendlyLink) {
        int result = friendlyLinkDao.updateFriendLink(friendlyLink);
        return (result > 0);
	}

	/**
	 * 删除友情链接
	 */
	
	public boolean deleteFriendLink(FriendlyLink friendlyLink) {
        int result = friendlyLinkDao.deleteFriendLink(friendlyLink);
        return (result > 0);
	}
    
}
