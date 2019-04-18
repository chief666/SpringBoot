package com.soft1721.jianyue.api.service;

import com.soft1721.jianyue.api.entity.Page;

import java.util.List;

public interface PageService {
    List<Page> selectAll(int pageNO, int pageSize);
}
