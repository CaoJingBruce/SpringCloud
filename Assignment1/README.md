# 第一讲
## 1. Spring Boot 2.x学习
    Spring Boot 概述
    利用Spring Boot简化应用程序开发
    Spring Boot中的核心组件
        Spring Boot Starters
            Spring Boot Starter的父POM
        Spring Boot auto-configuration
        启用 Spring Boot auto-configuration
        Spring Boot CLI
        Spring Boot Actuator
    搭建 Spring Boot 开发环境
        利用Maven搭建Spring Boot
        利用Gradle搭建Spring Boot
    开始我们的第一个Spring Boot应用程序
        使用Spring在线界面初始化项目
        使用Spring STS IDE编辑器初始化项目
    实现REST服务
    Spring Boot 2.x中的新特性
    小结
    
## 2. Maven基础
    2.1. Maven介绍
    2.2. 多线程
    2.3. 跳过测试
    2.4. 编译失败后，接着编译
    2.5. 编译到最后再报错
    2.6. 使用 Nexus 本地私服
    2.7. 使用 Aliyun 国内镜像
    2.8. 指定 Repository 目录
    2.9. Maven Properties
    2.10. Maven Sources
    2.11. Maven Proxy
        2.11.1. 命令行设置
        2.11.2. 配置文件
    2.12. Dependency local Jar
    2.13. Install Jar
        2.14. MAVEN_OPTS
        2.15. Error in Eclipse

## 3. Git基础
    3.1. 开始使用Git
    
## 4. Assignment

    Create a parent project with 3 submodules.
    This app will consist of three modules, that will represent:
        1. The core part of our domain.
        2. A web service providing some information from accessing RTC(IBM Rational Team Concert).
        3. A webapp containing user-facing web assets of some sort.
    
    Parent's pom.xml file:
        <modules>
                <module>core</module>
                <module>service</module>
                <module>webapp</module>
        </modules>
        
    Building the Project:
        At least 1 unit test in each module.
        Run "mvn package" successful.
    Deploy the Project:
        There is an area for displaying RTC information in webapp.

    Commit your assignment into github.
