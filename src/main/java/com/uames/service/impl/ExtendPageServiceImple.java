package com.uames.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.uames.service.BaseService;
import com.uames.service.ExtendPageService;
import com.uames.vo.ExtendPage;

@Component
public class ExtendPageServiceImple extends BaseService  implements ExtendPageService {

	
	
	public ExtendPage getPage(Integer pageId) {
		ExtendPage page = new ExtendPage();
		page.setId(pageId);
		return extendPageDao.selectPage(page);
	}

	
	public List<ExtendPage> getAllPages() {
		return extendPageDao.selectAllPages();
	}

	
	public boolean updatePageInfo(ExtendPage page) {
		if (page.getDisplay() == null) {
			page.setDisplay(1);
		}
		int result = extendPageDao.updatePageInfo(page);
		return result>0;
	}

	
	public boolean addPage(ExtendPage page) {
		int result = extendPageDao.insertPage(page);
		return result>0;
	}

	
	public boolean deletePage(Integer pageId) {
		ExtendPage page = new ExtendPage();
		page.setId(pageId);
		int result = extendPageDao.deletePage(page);
		return result>0;
	}

}
