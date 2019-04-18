package com.soft1721.jianyue.api.controller;

import com.soft1721.jianyue.api.entity.Page;
import com.soft1721.jianyue.api.service.PageService;
import com.soft1721.jianyue.api.util.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/api/page")
public class PageController {
    @Resource
    private PageService pageService;

    @GetMapping(value = "/list")
    public ResponseResult getAll(@RequestParam("pageNO") int pageNO, @RequestParam("pageSize") int pageSize) {
        List<Page> list = pageService.selectAll(pageNO, pageSize);
        return ResponseResult.success(list);
    }
}
