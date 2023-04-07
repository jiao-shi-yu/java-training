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



### day02 变量和基本数据类型及类型转化

#### 一、变量

**变量**是用来存储数据的。

##### 变量的声明

```java
int a; // 声明了一个整型类型的变量，名为 a
```

##### 变量的初始化

初始化，就是第一次赋值。

```java
int a = 1; // 声明了一个整型变量，并初始化为1
```

##### 变量的使用

对变量的使用就是对它所存的那个数的使用。

```java
int a = 5;
int b = a + 10; // 把 a 的值取出来，加上5，赋值给 b.
System.out.println(b); // 把 b 的值输出到控制台
```

使用变量时，要注意数据类型必须匹配。

```java
int a = 3.14; // 编译错误，数据类型不匹配。
```

变量在使用之前，必须先声明和初始化。

```java
System.out.println(m); // 编译错误，变量未声明

int n;
System.out.println(n); // 编译错误，变量未初始化
```

```java
// 3)使用：使用的是账户里面的钱
int g = 5;
int h = g + 10; //取出g的值5, 把它加上10，然后把结果赋给h
System.out.println(h); // 输出变量h的值
System.out.println("h"); //输出字符串h
g = g + 10; // g在本身基础上，增加10
System.out.println(g);

//        System.out.println(i); // 编译错误，cannot resolve symbol 'i',无法解析符号
int i;
//        System.out.println(i); // variable 'i' might have not been initialized,变量i可能还未被初始化

```



##### 变量的命名规则

**硬规则**：

- 只能包含字母、数字、`_`和`$`，且不能以数字开头（数字开头会被看成字面量）。
- 严格区分大小写。
- 不能使用关键字及Java保留字。

**建议**：

- 不建议使用中文命名变量，虽然是可行的
- 变量名要表述清楚变量存放的是什么。
- 推荐使用驼峰命名法

##### 介绍两种命名法

- **驼峰命名法**：第一个单词的首字母小写，之后的单词首字母大写。一般用于命名**变量**。如`score`,`myScore`,`myJavaScore`等。
- **帕斯卡命名法**：每个单词的首字母大写。一般用于命名**类**。如`Car`,`BigCar`,`BlueBigCar`等。

```java
// 4)命名：
int a1, a_5$, _3c, $y;
//        int 1a; //1看成字面量

int 年龄; //不建议 Non-ASCII characters
int nianLing; //不建议，既不专业，又不直观
int age; // 建议"英文的见名知意"
int score, myScore, myJavaScore; // 小驼峰命名法
```



#### 二、Java语言中的基本数据类型

Java 中有 8 中基本数据类型，分别是：**byte、short、int、long, float、double, boolean, char**。

其中 **byte short int long float double** 是数字类型。

- **byte short int long** 代表的是整数
- **float double** 表示浮点数，也就是小数。

> 所有变量/数据——都会存储在内存中，内存是有大小的。
>
> 变量到底占用多大的内存，是由它的数据类型所决定的。
>
> ```
> int a = 5;  //a在内存中占4个字节
> int b = 100000000; //b在内存中也占4个字节
> ```



> 1G = 1024M(兆) 	1M=1024KB(千字节)	1KB = 1024B(字节) 	1B=8Bit(位)



###### int 类型

**int**：整型，**4** 个字节，-21亿到21亿

- 整数字面量默认为`int`类型，但不能超出范围，如超出范围，会发生编译错误
- int 数据类型无法表示小数，所以 5/2 = 2。两个整数相除，结果还是整数，**小数位无条件舍弃**（不会四舍五入）
- 整数运算时，若超出范围，会发生溢出（溢出不会报错，但还是要避免的）。溢出实际上从最大值转圈，转到了最大值。

```java
public static void main(String[] args) {
    // 1) int: 整型，4个字节，-21亿到21亿左右
    int a = 250;
//        int b = 100000000000; // 字面量默认是int类型，但100000000000超出了int所能表示的范围。
    System.out.println(5/2); // int 数据无法表示小数，所以 5/2 = 2
    System.out.println(2/5); // 同样 2/5 = 0
    System.out.println(5.0/2); //5.0是double类型的字面量

    int c = 2147483647; // int的最大值
    c = c + 1; //发生溢出
    System.out.println(c); // -2147483648


}
```



###### long 类型

**long**：长整型，8个字节，可表示整数的范围很大。

- 长整型直接量需要在数字后加`L`；直接写整数，是int的字面量，而10_000_000_000太大了。*integer number too large.*
- 不同数据类型计算，结算结果的类型，以大的为准。
- 整数运算时若有可能发生溢出，建议在第一个数字后加`L`.

```java
public static void main(String[] args) {
    // 2) long:长整型，8个字节，可表示整数的范围很大
//        long a = 10_000_000_000; // 直接写整数，是int的字面量，而10_000_000_000太大了。integer number too large.
    // 长整型直接量需要在数字后加`L`
    long b = 10_000_000_000L;
    // 不同数据类型计算，结算结果的类型，以大的为准。
    long c = 100_000_000 * 2 * 10L; // 注意到c的数据类型为long, c的数值为20亿
    System.out.println(c);

    long d = 1_000_000_000*3*10L; // 10亿*3*10,结果为三百亿，但10亿*3的时候就已经发生了溢出。
    System.out.println(d);
    long e = 1_000_000_000L*3*10; // 如果在第一个因数就标明L, 则在long的范围内计算，不会发生溢出。
    System.out.println(e);


}
```



###### float double 浮点类型

本质：**企图用密集的有间隔的点代表连续不断的实心的线**。

**double**:浮点型,8个字节，可以表示小数，表示数的范围很广，比**float**类型(4字节)更精确。

- **浮点型直接量**默认为 **double 类型**，float 字面量是在数字后加`f`.
- **浮点型的舍入误差**：double 以及 float型数据参与运算时，有可能会发生舍入误差。（精确场合不能使用）

```java
public static void main(String[] args) {
    // 3)double:浮点型,8个字节，可以表示小数，表示数的范围很广，比float更精确。
    // 浮点型直接量默认为 double 类型
    double a = 3.25;
    float b = 3.25f;
    // 浮点型的舍入误差
    double c = 3.0, d = 2.9;
    System.out.println(c-d); //0.10000000000000009

    c = 6.0;
    d = 4.9;
    System.out.println(c-d);
}
```



###### boolean 类型

**boolean**：用来标明真假，占 1 个字节。

- **只能赋值为 `true` 或 `false`**

###### char 类型

**char**：字符，2 个字节。

- 采用 Unicode 字符集编码，每个字符都有一个对应的码。
- 表现形式是字符 **char**，本质上是码 **int**（0 到 65535）
- **字符类型字面量，用单引号标记**。单引号里面(双引号不行)，只能有**一个**字符(0个字符，多个字符都不行)。
- 特殊字符需要用`\`转义
- **ASCII** 码（**'a'-97, 'A'-65, '0'-48**)

##### Unicode 编码

- **Unicode**：万国码、统一码、通用码，是世界级通用的定长(16bit)字符集。
- Java中的`char`采用的是 Unicode 字符集中最常用的一组编码，共 **65535** 个。

```java
public static void main(String[] args) {
    //4)boolean: 布尔型，1个字节
    boolean a = true;
    boolean b = false;
//        boolean c = 0; //布尔类型变量，只能存储true或false

    //5)char:字符型，2个字节
    char c1 = '女';
    char c2 = 'f';
    char c3 = '6';
    char c4 = '*';

    // 几个错误示例
//        char c5 = 女;   //字符字面量必须放在单引号中
//        char c6 = "女"; //双引号也不行
//        char c7 = '';   //必须有字符
//        char c8 = '女性'; //必须只有一个字面量

    char c9 = '\\';
    System.out.println(c9);

    char c10 = 65;
    System.out.println(c10); // 输出时会依据变量的数据类型来输出。
}
```



#### 三、类型间的转换

##### 两种类型转换方式

- **隐式自动**类型转换：小类型自动转换为大类型。

- **显式强制**类型转换：大类型强制转换到小类型，可能会发生溢出和精度丢失的问题。

  - ```java
     // 类型间的转换
     int a = 5;
     long b = a;  //自动类型转换
     int c = (int) b; //强制类型转换
	  
     long d = 25;  //自动类型转化
     double e = 25; //自动类型转化
     System.out.println(d);
     System.out.println(e);
    ```
  - ```java
     // 范围大的类型强转范围小的类型，有可能发生溢出
     long f = 10_000_000_000L;
     int g = (int)f;
     System.out.println(g); //1410065408
    
     // 精度高的类型强转精度小的类型，有可能精度丢失
     double h = 25.987878745847583753985738538843457348573485345;
     int i = (int)h;
     System.out.println(i); //25
     float j = (float)h;
     System.out.println(j); //25.987879
    ```



##### 两点规则

1.  **可表示范围内**，直接量可以直接赋值给**byte**,**short**, **int**, **long**, **char**。
2. **byte, short, char** 型数据参与运算时，一律**先转换为 int类型**，之后再做运算。

```java
public static void main(String[] args) {
    // 可表示范围内，直接量可以直接赋值给byte,short, int, long, char
    byte b1 = 5;

    // byte, short, char型数据参与运算时，一律先转换为int类型，之后再做运算.
    byte b2 = 6;
//        byte b3 = b1 + b2; //会报错，因为右边计算的结果是int类型。需强转。
//        byte b3 = (byte)b1 + (byte)b2; //这也错，需要用小括号，改变运算优先级。
    byte b3 = (byte) (b1 + b2);
}

  // 以下都是先转为int,然后再参与计算
    System.out.println(2+2);
    System.out.println(2+'2'); // '2' => char类型的字面量，对应int值为50
    System.out.println('2'+'2'); // 50 + 50 => 100

}
```

