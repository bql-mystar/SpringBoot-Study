parent:
    所有的SpringBoot项目要继承的项目，定义了若干个坐标版本号(依赖管理，而非依赖)，以达到减少依赖冲突的目的
    spring-boot-starter-parent各版本间存在着诸多坐标版本不同

starter:
    SpringBoot中常间的项目名称，定义了当前项目使用的所有依赖坐标，以达到减少依赖配置的目的

实际开发:
    使用任意坐标时，仅书写GAV中的G和A，V由SpringBoot提供，除非SpringBoot未提供对应版本V
    如发生坐标错误，再指定Version(要小心版本冲突)

引导类：
    SpringBoot的引导类是Boot工程的执行入口，运行main方法就可以启动项目
    SpringBoot工程运行后初始化Spring容器，扫描引导类所在包及其子包加载Bean

内置服务器:
    内嵌tomcat服务器是SpringBoot辅助功能之一
    内嵌tomcat工作原理是将tomcat服务器作为对象运行，并将该对象交给Spring容器管理
    变更内嵌服务器思想是去除现有服务器，添加全新的服务器

    tomcat(默认)：apache出品，粉丝多，应用面广，负载了若干较重的组件
    jetty：更轻量级，负载性能远不及tomcat
    undertow：负载性能勉强跑赢tomcat


基础配置：
    SpringBoot默认配置文件application.properties
    SpringBoot导入对应starter后，提供对应的配置属性
    书写SpringBoot配置采用关键字+提示形式书写
    SpringBoot提供了3种配置文件的格式：
        properties(传统格式/默认格式)
        yml(主流格式)
        yaml

    SpringBoot配置文件加载顺序
        properties > yml > yaml
        不同配置文件中相同配置按照加载优先级相互覆盖，不同配置文件中不同配置全部保留

    yaml语法规则：
        大小写敏感
        属性层级关系使用多行描述，每行解为使用冒号结束
        使用缩进表示层级关系，同层级左侧对齐，只允许使用空格(不允许使用Tab键)
        属性值前面添加空格(属性名与属性值之间使用冒号+空格作为分隔)
        # 表示注释
            核心规则： 数据前面要加空格与冒号隔开

    yaml数据读取：
        使用@Value配合SpEL读取单个数据
        如果数据存在多级层，依次书写层级名称即可
            使用@Value读取单个数据，属性名引用方式：${一级属性名.二级属性名...}

        在配置文件中可以使用${属性名}方式引用属性值
        如果属性中出现特殊字符，可以使用双引号包裹起来作为字符解析

        使用Environment对象封装全部配置信息
        使用@Autowired自动装配数据到Environment对象中

