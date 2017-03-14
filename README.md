[TOC]
# dubbo-demo
## 总结
1. 运行顺序
先启动demo-provider中的Application, 后启动demo-consumer中的Application。
2. 启动demo-provider中如若遇到端口占用问题,执行以下操作：<br>
`ss -tnlp | grep 20880  #得到pid`<br>
`Kill -9 pid  #杀死该进程`
3. 接口
demo-provider和demo-consumer相同的地方是service层有一套一模一样的接口，但是接口实现类只在demo-provider中，并且同一个接口可以有不同的实现。
4. 打jar包
demo-provider可能需要打成jar包执行在多个机器上面，打包过程有2步：配置pom -> 在IDEA执行package命令 。具体步骤在~/chen-linux/notes/dubbo整合zookeeper的使用.docx中。
5. Dubbo、zookeeper关系调用

6. 访问dubbo-admin
先从github上面把dubbo项目克隆到本地，项目地址如下：https://github.com/alibaba/dubbo.git
执行11条的命令

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;最后，在浏览器输入localhost:8080，输入用户名：root， 密码：root
<br>便可进入