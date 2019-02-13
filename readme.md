## 毕业设计 博客管理系统

### 仓库创建

### pom文件依赖
- 添加shiro
- 添加百度编辑器
- Apache公共包
- Lucene
- 连接池

### 数据库

- t_blogger博主信息
- t_blog博客表
- t_blogType博客类别
- t_comment评论信息表
- t_link 友情链接表

### 拦截

- 设置静态文件通过
     - webjars
     - static
- 设置

## 文件上传

```properties
spring.servlet.multipart.enabled=true
spring.servlet.multipart.file-size-threshold=0
spring.servlet.multipart.location=
spring.servlet.multipart.max-file-size=1MB
spring.servlet.multipart.max-request-size=10MB
```

整合逆向工程
https://www.cnblogs.com/ningheshutong/p/6376970.html