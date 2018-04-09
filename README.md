# starter
#### 目录说明
* dao: 数据库访问相关，采用了内存数据库：h2
* main：应用程序启动入口
* web：http接口，html页面

# jquery参考资料
* http://www.w3school.com.cn/jquery/jquery_ajax_get_post.asp

#### DemoInfoController类说明
通过两个http接口: findAll，save 查询DB数据和存入数据
1. http://127.0.0.1:8080/findAll 此时没有数据；
2. http://127.0.0.1:8080/save 保存测试数据；
3. http://127.0.0.1:8080/findAll 会看到save进入的数据；
4. 重新启动程序，再访问 http://127.0.0.1:8080/findAll 此时没有数据，说明了数据只保存在内存中，重启之后就释放了之前存入的数据。
5. http://localhost:8080/index.html 实现了表单数据通过ajax提交，数据保存到db中，再访问http://127.0.0.1:8080/findAll可以看到刚存入的数据