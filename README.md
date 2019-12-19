# 说明 
一个Android加固示例项目，旨在了解加壳脱壳的细节

## 加固的原理
#### 解壳数据位于解壳程序文件尾部
加壳程序工作流程：
	1、加密源程序APK文件为解壳数据
	2、把解壳数据写入解壳程序Dex文件末尾，并在文件尾部添加解壳数据的大小。
	3、修改解壳程序DEX头中checksum、signature 和file_size头信息。
	4、修改源程序AndroidMainfest.xml文件并覆盖解壳程序AndroidMainfest.xml文件。

解壳DEX程序工作流程：
	1、读取DEX文件末尾数据获取借壳数据长度。
	2、从DEX文件读取解壳数据，解密解壳数据。以文件形式保存解密数据到a.APK文件
	3、通过DexClassLoader动态加载a.apk。

未完结！

# 参考
- 项目参考[AndroidShell](https://github.com/longtaoge/AndroidShell),在此项目中进行了完善。

