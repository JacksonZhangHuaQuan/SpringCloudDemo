这是一个个人学习分布式的框架的项目，后期会逐渐的去完善，引用各种技术。

# SpringCloudDemo
简单的分布式SpringCloud项目，运用了SSM框架，Eureka注册中心


项目结构：

  common --------------------------- 项目的公共部分，一般是一些entity等

  consumer ------------------------- 服务消费者，rabbion+restTemplate消费服务方式
  
  config_service ------------------- 配置中心服务端，从git上拿去配置变量
  
  config_client -------------------- 配置中心客户端，获取配置变量

  eureka_service ------------------- 注册中心，服务的注册中心

  feign_consumer ------------------- 和consumer一样，都是服务消费者，但是引用了feign，代码更加优化，推荐使用

  produce -------------------------- 服务生成者，主要是从数据库中获取数据，提供服务
  
  service_zuul --------------------- Zuul的主要功能是路由转发和过滤器
