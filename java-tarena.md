这个文件专门用来记录达内Java就业班的学习笔记。捡着重要的记。



## 01 Fundamental——Java语言基础

### day01 Java语言介绍和开发环境搭建

#### 一、Java语言特性(了解即可)

1. **面向对象**： 类、对象、接口、封装、继承、多态。
2. **平台无关性**：一次编写，到处运行。不同平台上有不同的JVM。
3. **简单性**：语法简单。没有指针。有垃圾回收。学起来简单，用起来简单。
4. **解释执行**：源代码编译成字节码，然后解释器对字节码进行解释，最后再执行。
5. **多线程**：Java 是支持多个线程同时执行的，并且提供了多个线程之间的同步机制。
6. **分布式**：可以把一个软件根据功能拆分到不同的服务器上，然后通过网络连接把这些功能集合起来。Java 支持各种层次的网络连接，常见的 API 比如说 Socket。
7. **健壮性**：Java 的强类型、异常处理和垃圾回收机制，保证了 Java 的健壮性。
8. **高性能**：Java 不断进行性能优化升级，运行速度还是比较快的。
9. **安全性**：Java 提供了很多的安全防范机制，尤其是针对网络安全这一块。



#### 二、开发环境介绍与搭建

##### 开发环境相关术语介绍

###### JVM、JRE与JDK 

- **JVM**：**J**ava **V**irtual **M**achine， Java 虚拟机，作用是加载和运行字节码文件。
- **JRE**：**J**ava **R**untime **E**nvironment，Java 运行时环境，JRE = JVM虚拟机 + 系统类库，**运行** Java 程序的最小单元。
- **JDK**：**J**ava **D**evelopment **K**it，Java 开发工具箱， JDK = JRE + 编译运行等工具，**开发** Java 程序的最小单元。

###### Java编译运行的过程

1. 编译期：javac 把`.java`源代码文件编译成`.class`字节码文件。
2. 运行期：JVM加载并运行字节码文件。

###### IDE（集成开发环境）

（Integrated Development Environment)，把开发所需要用的的各种工具，都给你集中到一个软件里了。Java常用的IDE有eclipse和idea等。

###### 基本的代码组织形式

- **Project**：项目
- **package**：包
- **class**：类

##### 安装JDK和IDEA

不赘述了，都会。

##### 第一行代码：hello world

1. 新建项目 **Fundamental01**
2. 新建包 **day01**
3. 新建类 **HelloWorld.java** 代码如下：

```java
package day01;

public class HelloWorld {
//    主方法，程序的入口。程序的执行，从main开始
    public static void main(String[] args) {
//        输出hello world
        System.out.println("hello, world");
//        严格区分大小写
//        所有符号必须是英文的
//        每句话必须以分号结尾
    }
}
```

> 说明： - main 方法为程序的主入口，从main 开始，从 main 结束。 - 一条 Java 语句要以分号结束。 - System.out.println() 向控制台换行输出语句。 - 字符串表示文字信息，用`""`围起来。

##### 注释

注释是解释性文本，编译器编译时会自动忽略。

- 单行注释：`// balabala`
- 多行注释：

```java
/* 一行
 * 两行
 */
```

- 文档注释：

```java
/**
 * 这个类演示了文档注释
 * @author yuyu
 * @version 1.1
 */
```



### 







