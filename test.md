
### 目录结构
```
    主项目  
        ├── build               // 编译文件  
        ├── libs                // 依赖库  
        ├── src                                // 开发  
        │   ├── main                          // 主要代码  
        │   │   ├── assets                    // 文件(字体)  
        │   │   ├── java                      // 源码  
        │   │   │   ├── app                   // APP相关(欢迎引导页)  
        │   │   │   ├── city                  // 城市选择  
        │   │   │   ├── login                 // 登录  
        │   │   │   └── main                  // 主要业务代码  
        │   │   │       ├── index             // 首页模块  
        │   │   │       ├── doctorhelp        // 医助模块  
        │   │   │       ├── consultation      // 聊天模块  
        │   │   │       ├── shop              // 力荐模块  
        │   │   │       └── mine              // 我的模块  
        │   │   └── res                       // 资源文件  
        │   └── AndroidManifest.xml           // 清单文件  
        ├── build.gradle                      // gradle配置依赖基础库  
        ├── readme.md                         // 说明文件  
        ├── .gitignore                        // 忽略文件  
        └── setting.gradle                    // gradle设置文件  

    Mslib基础库  
        └── src                     // 开发  
            └── main               // 主要代码  
                ├── app            // 基类  
                ├── base           // 源码  
                ├── cache          // 缓存  
                ├── chart          // 图表  
                ├── net            // 网络  
                ├── user           // 用户  
                ├── utils          // 工具  
                └── view           // 自定义视图  
============================目录结构====================================
```
