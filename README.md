# starter
#### 目录说明
  * dao: 数据库访问相关，采用了内存数据库：h2
  * main：应用程序启动入口
  * web：http接口，html页面
    程序启动后依次访问：
    http://127.0.0.1:8080/findAll 此时没有数据；
    http://127.0.0.1:8080/save 保存测试数据；
    http://127.0.0.1:8080/findAll 会看到save进入的数据；
    重新启动App.java，在访问：
    http://127.0.0.1:8080/findAll 此时没有数据，说明了数据只保存在内存中，重启之后就释放了之前存入的数据。