package com.yang.springboottest.mapper;

import com.yang.springboottest.bean.Bloger;
import com.yang.springboottest.controller.admin.Blog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogMapper {

    Bloger selectBlog(Integer id);
}
