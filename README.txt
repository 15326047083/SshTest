作者：雷园（引用语XRom）
时间：2018-5-8 15:49:00
项目架构：Spring + SpringMVC + Hibernate +maven

说明:
    pom.xml是引用现成的配置，完全可用，配置环境，jdk1.8，tomcat9.0，JUnit5.0
注意事项：
    1、数据库配置文件地址：/src/main/resources/jdbc.properties
    2、由于web.xml配置中，配置SpringMVC时DispatcherServlet拦截了所有的请求，也就是说我们访问静态资源的请求也被
        拦截了（比如说一个页面加载一个js资源）。我在spring-mvc.xml配置有静态资源映射，访问静态资源更方便了
    3、主键生成策略在实体类中，使用long或int（自动增长）
