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

### 文件上传

```properties
spring.servlet.multipart.enabled=true
spring.servlet.multipart.file-size-threshold=0
spring.servlet.multipart.location=
spring.servlet.multipart.max-file-size=1MB
spring.servlet.multipart.max-request-size=10MB
```
### 资料银引入
1. bootstrap

## 博主登录功能

### 登录验证
1. login 页面
2. bloggerBean
3. mapper文件可以吧resultMap先写起来映射到哪一个bean
4. 构建bloggerMapper.xml
5. md5加密，通过CryptographyUtil加盐加密
6. 在realm里面存入用户信息
8. 通过login注册认证

### 静态页面

1. 引入ootstrap
2. index.html 博客主页
3. 引入天气预报和地图（直接用现有组件）
4. 先写出静态页面效果，链接后端以后再做数据替换

### 初始化数据

1. 设置初始化组件InnitCompnent 继承监听器
    - 配置是spring监听器
    - 测试监听器直接启动spring
    - 组件的注解用component好理解一点
2. 把博主信息和其他公共信息放在application中


_tip：通过页面分析后台需要的东西_

### 主页请求

1. IndexController 处理主页请求
2. 抽取主页公共界面
    - 菜单页面
    - 页头
    - 页脚
    
4. 分页
    - 总页数 = 总记录数 / 每页记录数
    - 入参：当前页
    - 输出：当前页的记录数
    - sql limit start end
    - start：（当前页 -1） * 每页记录数， end：start+每页记录数
    - 如果原生封装的话分页代码拼装后返回前台

6. 缩略图
    
    通过jsoup
    
7. Lucene
    - 创建一个博客都要加入索引
    
    




 
easyicon
整合逆向工程
https://www.cnblogs.com/ningheshutong/p/6376970.html