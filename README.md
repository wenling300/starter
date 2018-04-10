# starter
#### 目录说明
* dao: 数据库访问相关，采用了内存数据库：h2，数据库链接参数参见文件: application.properties
* main：应用程序启动入口
* web：http接口，html页面

# jquery参考资料
* http://www.w3school.com.cn/jquery/jquery_ajax_get_post.asp

# Git参考资料
* https://www.liaoxuefeng.com/wiki/0013739516305929606dd18361248578c67b8067c8c017b000

# DemoInfoController类说明
通过两个http接口: findAll，save 查询DB数据和存入数据。该示例参考博客链接 http://412887952-qq-com.iteye.com/blog/2322756
1. http://127.0.0.1:8080/findAll 此时没有数据；
2. http://127.0.0.1:8080/save 保存测试数据；
3. http://127.0.0.1:8080/findAll 会看到save进入的数据；
4. 重新启动程序，再访问 http://127.0.0.1:8080/findAll 此时没有数据，说明了数据只保存在内存中，重启之后就释放了之前存入的数据。
5. http://localhost:8080/index.html 实现了表单数据通过ajax提交，数据保存到db中，再访问 http://127.0.0.1:8080/findAll 可以看到刚存入的数据

# 作业
参考示例: https://blog.csdn.net/u013871100/article/details/68925050 新增一个表，实现增删查改
