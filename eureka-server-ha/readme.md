## 1.项目打包
> mvn clean package -DskipTests=true
## 2.启动 peer1
> java -jar target/eureka-server-ha-0.0.1-SNAPSHOT.jar  --spring.profiles.active=peer1
## 3.启动 peer2
> java -jar target/eureka-server-ha-0.0.1-SNAPSHOT.jar  --spring.profiles.active=peer2
## 4.启动 peer3
> java -jar target/eureka-server-ha-0.0.1-SNAPSHOT.jar  --spring.profiles.active=peer3
## 5.启动浏览器 
> 打开"http://peer1:8761/","http://peer2:8762/"，"http://peer3:8763/"
> 输入登录账号（用户名:admin,密码:fangming）

