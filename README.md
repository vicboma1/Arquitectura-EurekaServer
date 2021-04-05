# Arquitectura-EurekaServer

Arrancamos eureka
```
 mvn run 
 
INFO 17208 --- [           main] es.vicboma.boot.ApplicationEurekaServer  : No active profile set, falling back to default profiles: default
WARN 17208 --- [           main] o.s.boot.actuate.endpoint.EndpointId     : Endpoint ID 'service-registry' contains invalid characters, please migrate to a valid format.
INFO 17208 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=039e5fbc-996b-30f0-83b1-2034e5dc6c92
INFO 17208 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration' of type [org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebinderAutoConfiguration$$EnhancerBySpringCGLIB$$d4245eb4] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
INFO 17208 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8761 (http)
INFO 17208 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
INFO 17208 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.26]
INFO 17208 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
INFO 17208 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 2031 ms
WARN 17208 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
INFO 17208 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
INFO 17208 --- [           main] c.netflix.config.DynamicPropertyFactory  : DynamicPropertyFactory is initialized with configuration sources: com.netflix.config.ConcurrentCompositeConfiguration@1229a2b7
INFO 17208 --- [           main] c.s.j.s.i.a.WebApplicationImpl           : Initiating Jersey application, version 'Jersey: 1.19.1 03/11/2016 02:08 PM'
INFO 17208 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON encoding codec LegacyJacksonJson
INFO 17208 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON decoding codec LegacyJacksonJson
INFO 17208 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML encoding codec XStreamXml
INFO 17208 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML decoding codec XStreamXml
WARN 17208 --- [           main] c.n.c.sources.URLConfigurationSource     : No URLs will be polled as dynamic configuration sources.
INFO 17208 --- [           main] c.n.c.sources.URLConfigurationSource     : To enable URLs as dynamic configuration sources, define System property archaius.configurationSource.additionalUrls or make config.properties available on classpath.
INFO 17208 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
INFO 17208 --- [           main] o.s.c.n.eureka.InstanceInfoFactory       : Setting initial instance status as: STARTING
INFO 17208 --- [           main] com.netflix.discovery.DiscoveryClient    : Initializing Eureka in region us-east-1
INFO 17208 --- [           main] com.netflix.discovery.DiscoveryClient    : Client configured to neither register nor query for data.
INFO 17208 --- [           main] com.netflix.discovery.DiscoveryClient    : Discovery Client initialized at timestamp 1617657597006 with initial instances count: 0
INFO 17208 --- [           main] c.n.eureka.DefaultEurekaServerContext    : Initializing ...
INFO 17208 --- [           main] c.n.eureka.cluster.PeerEurekaNodes       : Adding new peer nodes [http://localhost:8761/eureka/]
INFO 17208 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON encoding codec LegacyJacksonJson
INFO 17208 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using JSON decoding codec LegacyJacksonJson
INFO 17208 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML encoding codec XStreamXml
INFO 17208 --- [           main] c.n.d.provider.DiscoveryJerseyProvider   : Using XML decoding codec XStreamXml
INFO 17208 --- [           main] c.n.eureka.cluster.PeerEurekaNodes       : Replica node URL:  http://localhost:8761/eureka/
INFO 17208 --- [           main] c.n.e.registry.AbstractInstanceRegistry  : Finished initializing remote region registries. All known remote regions: []
INFO 17208 --- [           main] c.n.eureka.DefaultEurekaServerContext    : Initialized
INFO 17208 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoint(s) beneath base path '/actuator'
INFO 17208 --- [           main] o.s.c.n.e.s.EurekaServiceRegistry        : Registering application EUREKA-REMOTE-SERVER with eureka with status UP
INFO 17208 --- [      Thread-31] o.s.c.n.e.server.EurekaServerBootstrap   : Setting the eureka configuration..
INFO 17208 --- [      Thread-31] o.s.c.n.e.server.EurekaServerBootstrap   : Eureka data center value eureka.datacenter is not set, defaulting to default
INFO 17208 --- [      Thread-31] o.s.c.n.e.server.EurekaServerBootstrap   : Eureka environment value eureka.environment is not set, defaulting to test
INFO 17208 --- [      Thread-31] o.s.c.n.e.server.EurekaServerBootstrap   : isAws returned false
INFO 17208 --- [      Thread-31] o.s.c.n.e.server.EurekaServerBootstrap   : Initialized server context
INFO 17208 --- [      Thread-31] c.n.e.r.PeerAwareInstanceRegistryImpl    : Got 1 instances from neighboring DS node
INFO 17208 --- [      Thread-31] c.n.e.r.PeerAwareInstanceRegistryImpl    : Renew threshold is: 1
INFO 17208 --- [      Thread-31] c.n.e.r.PeerAwareInstanceRegistryImpl    : Changing status to UP
INFO 17208 --- [      Thread-31] e.s.EurekaServerInitializerConfiguration : Started Eureka Server
INFO 17208 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8761 (http) with context path ''
INFO 17208 --- [           main] .s.c.n.e.s.EurekaAutoServiceRegistration : Updating port to 8761
INFO 17208 --- [           main] es.vicboma.boot.ApplicationEurekaServer  : Started ApplicationEurekaServer in 18.755 seconds (JVM running for 21.45)
INFO 17208 --- [5)-192.168.1.46] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
INFO 17208 --- [5)-192.168.1.46] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
INFO 17208 --- [5)-192.168.1.46] o.s.web.servlet.DispatcherServlet        : Completed initialization in 21 ms
```

Web
```
http://localhost:8761
```

|[](https://github.com/vicboma1/Arquitectura-EurekaServer/blob/main/assets/Sin%20t%C3%ADtulo.png)
