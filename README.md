这是一个个人学习分布式的框架的项目，后期会逐渐的去完善，引用各种技术。

# SpringCloudDemo
简单的分布式SpringCloud项目，运用了SSM框架，Eureka注册中心


项目结构：

  cache-client --------------------- 缓存，封装的redis;是redis的配置和对一些常用方法的封装

  common --------------------------- 项目的公共部分，一般是一些entity等

  consumer ------------------------- 服务消费者，rabbion+restTemplate消费服务方式
  
  config_service ------------------- 配置中心服务端，从git上拿去配置变量
  
  config_client -------------------- 配置中心客户端，获取配置变量

  eureka_service ------------------- 注册中心，服务的注册中心

  feign_consumer ------------------- 和consumer一样，都是服务消费者，但是引用了feign，代码更加优化，推荐使用

  produce -------------------------- 服务生成者，主要是从数据库中获取数据，提供服务
  
  service_zuul --------------------- Zuul的主要功能是路由转发和过滤器


Spring cloud学习之路（一，创建项目-父模块）https://blog.csdn.net/Zhang_Jackson/article/details/103288516

Spring cloud学习之路（二，引入服务注册中心Eureka） https://blog.csdn.net/Zhang_Jackson/article/details/103288918

Spring cloud学习之路（三，服务提供者 ）https://blog.csdn.net/Zhang_Jackson/article/details/103289720

Spring cloud学习之路（四，服务消费者Feign ）https://blog.csdn.net/Zhang_Jackson/article/details/103292365

Spring cloud学习之路（五，断路器 Hystrix）https://blog.csdn.net/Zhang_Jackson/article/details/103293354

Spring cloud学习之路（六，路由网关 ZUUL）https://blog.csdn.net/Zhang_Jackson/article/details/103294338

Spring cloud学习之路（七，分布式配置中心 Spring Cloud Config）https://blog.csdn.net/Zhang_Jackson/article/details/103305424

Spring cloud学习之路（八，高可用的分布式配置中心Spring Cloud Config）https://blog.csdn.net/Zhang_Jackson/article/details/103307244

Spring cloud学习之路（九，Redis的使用） https://blog.csdn.net/Zhang_Jackson/article/details/103309627

Spring cloud学习之路（十，工程中引入Redis作为缓存）https://blog.csdn.net/Zhang_Jackson/article/details/103311819
