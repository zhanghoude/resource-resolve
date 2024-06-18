<p align="center" >
    <img src="https://cdn-static.mgcc.com.cn/static/asfgadsgasga.webp" width="150">
    <h3 align="center">resource-resolve</h3>
    <p align="center">
        resource-resolve是一个用来解析抖音、小红书等平台内容链接将视频和图片的链接提取出来，现已支持小红书、抖音、tiktok、ins等平台.
    </p>
<p>

## Prepare
- 1、使用Java 17
- 2、使用时需先下载ChromeDriver，并配置到Constants.java中；
- 3、test中有测试的例子，可以直接运行test中的例子。
- 4、如需抓取其他平台，请先添加对应的解析策略，然后编写链接平台判断的Handler。

## Features
- 1、使用ChromeDrive + Selenium实现自动化抓取，支持动态修改任务；
- 2、使用策略模式 + 优化的责任链模式来进行更方便的管理解析；

## 现支持解析的平台
- [ ] ins
- [ ] dy
- [ ] xhs
- [ ] tiktok
- [ ] 快手

## Contributing
Contributions are welcome! Open a pull request to fix a bug, or open an [Issue](https://github.com/zhanghoude/resource-resolve/issues/) to discuss a new feature or change.

欢迎参与项目贡献！比如提交PR修复一个bug，或者新建 [Issue](https://github.com/zhanghoude/resource-resolve/issues/) 讨论新特性或者变更。


## Copyright and License

产品开源免费，并且将持续提供免费的社区技术支持。
