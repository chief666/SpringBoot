package com.soft1721.jianyue.api.service.impl;

import com.soft1721.jianyue.api.entity.Page;
import com.soft1721.jianyue.api.mapper.PageMapper;
import com.soft1721.jianyue.api.service.PageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class PageServiceImpl implements PageService {
    @Resource
    private PageMapper pageMapper;

    @Override
    public List<Page> selectAll(int pageNO, int pageSize) {
        int offSet=(pageNO-1)*pageSize;
        return pageMapper.selectAll(offSet, pageSize);
    }
}
