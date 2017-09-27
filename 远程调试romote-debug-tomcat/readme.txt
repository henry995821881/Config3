1.把编译好的项目tomcat-debug.war放到webapp/ROOT下解压，
  启动tomcat 使用命令 catalina.bat jpda start  (保证防火墙8000端口开启)


2.eclipse 导入项目tomcat-debug -->debug按钮-->debug configurations-->新建romote java application
3.设置name,project,host,port （默认端口8000）然后启动即可

