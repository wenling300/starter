# starter
#### 目录说明
* dao: 数据库访问相关，采用了内存数据库：h2
* main：应用程序启动入口
* web：http接口，html页面

#### 程序说明
采用h2作为数据库，DemoInfoController类通过两个http接口: findAll，save 查询数据和存入数据
1. http://127.0.0.1:8080/findAll 此时没有数据；
2. http://127.0.0.1:8080/save 保存测试数据；
3. http://127.0.0.1:8080/findAll 会看到save进入的数据；
4. 重新启动App.java，在访问：
5. http://127.0.0.1:8080/findAll 此时没有数据，说明了数据只保存在内存中，重启之后就释放了之前存入的数据。