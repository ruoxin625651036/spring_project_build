# 使用idea快速构建spring mvc项目 和 spring boot项目

 > 将spring mvc 和 spring boot作为子module来创建，主要是为了比较两者之间的差异
 
 
 * 选择File，添加Module，然后通过spring initializr创建，创建spring-boot的过程可参考网上的这篇博客: http://www.cnblogs.com/winner-0715/p/6666302.html
 * 创建spring mvc，目前并未在idea中找到一键生成的方式，在网上看到的比较常用的方式，是先创建基于web应用的maven项目，然后在该项目基础上添加framework support，便于
   转换为spring mvc应用。(修改web.xml和spring-servlet.xml文件)
 
 
  注：  
   添加spring boot的module时，它并未将根目录下的pom.xml文件设置为超级pom文件，即并未成为父子关系；
     但是添加maven的maven-archetype-webapp时，idea则对根目录下的pom.xml自动进行了设置，转换为了父子关系。
 
 