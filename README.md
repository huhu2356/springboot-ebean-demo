# demo 小结

**eclipse + MySQL5.7.19 + Spring Boot + Ebean开发完成对单个实体（Customer）的CRUD操作。**

## 时间安排

1. 9/12 学习了解Spring Boot，Ebean
2. 9/13 demo初始化且完成Customer的list查询
3. 9/14 完成Customer剩余的CRUD操作，编写README.md

## 学习参考资料 

- [spring boot官网例子](https://projects.spring.io/spring-boot/#quick-start)
- [springboot(一)：入门篇](http://www.ityouknow.com/springboot/2016/01/06/springboot(%E4%B8%80)-%E5%85%A5%E9%97%A8%E7%AF%87.html)
- [Spring Boot set up with Eclipse and Create Sample Project](https://www.youtube.com/watch?v=nOCbLRUdePs&index=1&list=PLhd_vL3a3i7ooy1uGc_mz5C4s9Y1Pt7WZ)
- [spring boot ebean example](https://github.com/ebean-orm-examples/example-springboot)

## 遇到的坑：

1. `EBean: java.lang.IllegalStateException: Bean class Customer is not enhanced?`

eclipse未安装enhancement plugin，其实官网有[提示](https://www.youtube.com/watch?v=_DWxNj-_orA&feature=youtu.be),且jar包版本最好与官网提供的例子相同。

## 其他

准备学习尝试下是否可以结合Vue.js......


