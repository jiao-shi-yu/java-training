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





### day03 运算符和表达式、分支结构

#### 一、运算符

##### 1. 算术运算符

算术运算符有两类，一类是**加减乘除、取余**，一类是**自增减运算符**。运算结果是数值。

###### + - * / %：

加减乘除很熟悉了。**%**:取模/取余，取计算结果的余数。

###### ++和--

自身增加或减少1，可以用在变量前，或变量后。

单独增减时，前置后置没有区别。被引用时：

- **前置**：先自增减，返回增减后的值

- **后置**：先返回原来的值，后自增减

```java
 /*
1. 算术运算符：+, -, *, /, %
 1)%:取模/取余，取计算结果的余数
 */
System.out.println(5%2); // 商2余1
System.out.println(8%2); // 商4余0 ——整除
System.out.println(2%5); // 商0余2


/*
 2)自增减运算符
 */
int a = 5, b = 5;
int c = a++; // c = 5, a = a + 1;
int d = ++b; // ++b , b = 6; d = b = 6;

System.out.println(a); //6
System.out.println(b); //6
System.out.println(c); //5
System.out.println(d); //6

```



##### 2. 关系运算符

关系运算符，进行大小相等关系的判断，有`>`  `<`   `=`   `!=`  `>=`  `<=`，返回布尔值`true`或`false`。

```java
 /*
 3)关系运算符
 */
  int a = 5, b = 10, c = 5;
  boolean b1 = a > b;
  System.out.println(b1);         // false
  System.out.println(a % 2 == 0); // false
  System.out.println(c++==5);     // true

```



##### 3. 逻辑运算符

逻辑运算符，进行**或且非**的逻辑运算，返回布尔值`true`或`false`。

###### 与 `&&`

两边都为 `true`，结果为 `true`. 只要有一个`false`，则结果为`false`.

###### 或 `||`

有一个为 `true`，结果为 `true`.只要有一个`true`，则结果为`true`.

###### 非 `！`

`true` 变成`false`，`false`变成`true`.

```java
/*
 3)逻辑运算符
 */
int a = 5, b = 10, c = 5;

// && 且 有false则false
boolean b1 = b >= a && b < c; // true && false => false
System.out.println(b1);         //
System.out.println(b <= c && b > a); // false && true => false
System.out.println(a == b && c > b); // false && false => false
System.out.println(a != c && a < b); // true && true => true

// || 或 有true则true
System.out.println(1<2 || 2<3); // true || true => true
System.out.println(1<2 || 3>2); // true || false => true
System.out.println(1>2 || 2<3); // false || true => true
System.out.println(1>2 || 2>3); // false || false => false


// ! 非 true变false, false变true
System.out.println("----!-----");
System.out.println(!true);  // false
System.out.println(!false); // true
```



###### 逻辑运算符的短路特性

与 `&&`运算，前边一个条件判断为`false`,后面条件不需判断，则发生短路运算，后边语句不会执行。

或 `||`运算，前面一个条件判断为`true`，后面条件不需判断，语句也不会执行。

```java
 /*
 逻辑运算符的短路特性
 */
System.out.println("逻辑运算符的短路特性:");
int j = 0 , k = 0;
boolean b2 = j > k && j++ > k;
System.out.println("j:"+j); // j:0, 前一个语句 j > k 为false, 后面 j++>k 未执行
System.out.println("k:"+k); // k:0
System.out.println(b2);
System.out.println();
boolean b3 = j == k && j++ > k; // 0==0 -> true; 0>0 -> false; true && false -> false;
System.out.println("j:"+j); // j:1, 前一个条件为true, 后面语句j++>k才执行了
System.out.println("k:"+k);
System.out.println(b3);  // false 有趣
System.out.println();

int m = 0, n = 0;
boolean l = m == n || m++ == n; // 0==0, true; m++ 不会执行
System.out.println("m:"+m); //m:0
System.out.println("n:"+n); //n:0

boolean l2 = m > n || m++ == n; // 0>0, false; m++ == n, 会执行, m++ 的值为0, 后m的值自增为1, n为0.
// 0 == 0, true; false || true , 结果为 true.
```



##### 4. 赋值运算符

###### 简单赋值运算符

​	`=` ：把右边的值赋给左边。

###### 复合赋值运算符

​	复合赋值运算符，把**算术运算**和**赋值**这两个操作复合起来的运算符。 像`a = a + 10;`这种先进行**算术运算**，再将**运算结果赋值给自身**的语句，就可以简写为：`a += 10;`。复合赋值运算符有`+=` `-=` `*=` `/=` `%=` 等。原理都是一样的。

```java
/*
4)赋值运算符
*/

// 复合赋值运算符 a += 10; 相当于 a = a + 10;
int a = 5;
a += 10;
System.out.println(a); //15
a *= 2;
System.out.println(a); //30
```

需要注意的是，复合赋值运算符**自带强转功能**。

```java
short s = 5; // 整数字面量可以直接给 short 赋值
s += 10;     // 复合赋值运算符，自带强转。
//s = s + 10;  // short 进行计算时，先转成int,再参与计算。 计算结果是int型，而s是short型。
s = (short)(s + 10);
```

所以`a += 10;`相当于`a = (目标类型) (a + 10);`,附带强转的功能。



##### 5. 字符串连接符

`+`除了用来做**加法运算**，还可以用来**拼接字符串**的。

```java
int age = 18;
System.out.println("age="+age);
System.out.println("我今年"+age+"岁了");

String name = "Ming";
System.out.println("Hello!My name is "+name+" and I'm " + age + " years old.");
        
```

```
age=18
我今年18岁了
Hello!My name is Ming and I'm 18 years old.
```

字符串的同化作用：字符串对`+`说：听我的！你是我的拼接符！

```java
// 字符串的同化作用
System.out.println(20+20+""+30); //4030
System.out.println(""+10+20+30); //102030
System.out.println(10+20+30+""); //60
```





##### 6. 三目运算符

格式： `条件` ? `条件为true时的值` : `条件为false时的取值`

示例：

```java
int num1 = 8, num2 = 5;
int max = num1 > num2 ? num1 : num2;
System.out.println(max); //8
```



#### 二、分支结构

> 三大控制流：顺序分支循环。

###### 程序流程结构

- 顺序结构：从上到下，逐行执行每个语句。
- 分支结构：根据条件，执行相应语句。
- 循环结构：循环执行，某条语句。

###### if结构

**语法**：

```java
if (boolean) {
  code blocks…… 基于条件执行的语句
}
```

**执行过程**：

判断括号内表达式的值。

- 若为`true`,则执行语句块。

- 若为`false`,则结束if结构。

**代码示例**：

 ```java
         // 偶数的判断
         int num = 6;
         if (num % 2 == 0) {
             System.out.println(num+"是偶数");
         }
         System.out.println("over");
 
         // 满500打8折纸
         double price = 500;
         if (price >= 500) {
             price *= 0.8;
         }
         System.out.println("最终结算金额为：" + price);
 ```

###### if-else结构

**语法**：

```java
if (boolean) {
  // 条件为true，则执行这里的语句块
} else {
  // 条件为false，则执行这里的语句块
}
```

**执行过程**：

判断括号内表达式的值。

- 若为`true`,则执行if后的语句块。

- 若为`false`,则执行else后的语句块。

**代码示例**：

```java
int num = 9;
if (num % 2 == 0) {
    System.out.println(num+"是偶数");
} else {
    System.out.println(num+"是奇数");
}
System.out.println("over");
```







### day04 分支结构(续)、循环结构

#### 一、Scanner的使用

**Scanner**是Java提供的一个工具，可以接受用户输入的数据。



#### 二、分支结构(续)





#### 三、循环结构

##### while 循环

- 语法：

```
T 循环变量;
while (循环条件) {
    循环体
    更新循环变量;
}
```

- 执行过程：
  1. 先判断是否满足循环条件
  2. 是，则执行循环体
  3. 更新循环变量
  4. 再次判断条件
- 示例：

```
public class WhileDemo {
    public static void main(String[] args) {
        /**
         * 输出 10 次“行动是成功的阶梯”
         */
        int times = 0;          // 1. 循环变量的初始化
        while (times < 10) {    // 2. 循环条件
            System.out.println("行动是成功的阶梯"+(++times));
            //times ++;             // 3. 循环变量的改变
        }
        System.out.println("Over");

        /**
         * 在控制台输出 9x9 乘法表
         */
        int a = 1, b;
        while (a <= 9) {
            b = 1;
            while (b <= a) {
                System.out.print(b + " * " + a + " = " + a*b + "\t");
                b ++;
            }
            System.out.println();
            a++;    
        }
    }
}
```

### do-while 循环

- 语法：

```
T 循环变量;
do {
    循环体
    更新循环变量;
} while (循环条件);
```

- 执行过程：
  1. 先执行循环体
  2. 更新循环变量
  3. 然后判断条件
  4. 如果条件成立，则再次执行循环体
- 示例：

### For Loop

for循环

### Enhanced For Loop

增强型 for 循环，是 JDK 5 退出的，通常用于遍历集合或数组。

```
package day05;

public class EnhancedForLoopDemo {
    public static void main(String[] args) {
        String[] array = {"Three", "Two", "One", "Ready~", "Go!"};
        for (String str : array) {
            System.out.println(str);
        }
    }
}
/**Output:
Three
Two
One
Ready~
Go!
*/
```

## 循环结束的情况有两种

- 循环条件为假
- 碰到 break 语句

## 生成随机数

`Math.random()`生成[0, 1)的一个随机数。

## 死循环：循环条件永远不为 false，将会一直执行下去的循环。会导致内存溢出，一定要避免。





# 数组

- 数组是一种引用数据类型
- 相同类型元素的集合

## 声明数组

`int[] arr = new int[10];` // 声明整形数组 arr, 包含 10 个元素，每个元素都是 int 类型。用 0 来填充。

## 初始化数组

初始化数组中的元素。

```
int[] arr = new int[3];
int[] arr2 = {1, 4, 7};
int[] arr3 = new int[]{1, 4, 7};

int[] arr4;
// arr4 = {1, 4, 7}; // 编译错误，大括号这种，只能是在声明的同时，初始化。
// 可以写成这样
arr4 = new int[]{1, 4, 7};
```

## 使用数组

- 通过`数组名.length`获取数组长度（元素的个数）。

```
int[] arr = new int[3];
System.out.println(arr.length);
```

- 通过索引来访问数组中的元素。

```
int[] arr = new int[3];
arr[0] = 100; // 把 100 赋值给数组中的第一个元素
arr[3] = 400; // 数组下标越界异常
```

## 遍历数组

```
int[] arr = new int[10];
for (int i = 0; i < arr.length; i++) {
    arr[i] = 100; // 给每个元素都赋值为 100.
}
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]); // 输出数组中的每个元素
}
```





# 数组的复制

## System.arraycopy

- 直接存内存复制，相较于使用 for 循环遍历寻址复制，要快很多。
- 线程不安全
- 浅复制 System.arraycopy()的 API

```
public native static void arraycopy(
    Ojbect src,  //源数组
    int srcPos,  //源数组的起始位置
    Object dest, //目标数组
    int destPos, //目标数组的起始位置
    int length   //复制长度
)
```

- 该方法使用了 native 关键字，说明调用的是其他语言写的底层函数。

## Arrays.copyof

```
public static <T, U> T[] copyof(U[] original, int newLength, Class<? extends T[]> newType) {
    @SuppressWarnings("unchecked")
    T[] copy =((Object)newType == (Object)Object[].class)?(T[]) new Object[newLength]:(T[])Array.newInstance(newType.getComponentType(), newLength);
    System.arraycopy(original, 0, copy, 0, Math.min(original.length, newLength));
    return copy;
}
```

- `original`: 原数组
- `newLength`: 新数组长度
- `newType`: 要返回的副本的类型
- 实际上也是调用`System.arraycopy`;
- 发生的事情是这样的：
  - 首先它有一个三目运算表达式，根据新数组与原数组的类型是否相同，分别新建了一个相应类型的数组。新数组的类型是指定的类型，长度是指定的 newLength , 用相应类型的默认值填充。
  - 然后调用 System.arraycopy 从原数组和新数组的第 0 个位置，开始复制。
  - 长度 `Math.min(original.length, newLength)`
    - 如果指定的新长度比较大，那就只复制原数组的长度的元素，后面的元素已经用默认值填充了。这样就实现了一个数组的扩容。
    - 如果指定的新长度比较小，那就复制指定长度，把这个新数组给复制满就行。相当于对原数组进行了一个缩容。

## System.arraycopy()更灵活，功能强大。Arrays.copyof()在数组扩容缩容的时候，使用起来比较方便。

# 数组的排序

Arrays 类有一个`sort()`静态方法，是用来对数组元素进行排序的。

- 把需要排序的数组，作为参数，传入方法就行。
- 还可以通过指定 fromIndex 和 toIndex，实现对数组的一部分元素进行排序。
- 默认是由小到大排序，你可以自定义一个`Comparator`对象作为参数传进去。
- sort()方法是`public static void`修饰的，也就是说没有返回值，是对原数组进行的修改。

# 方法

又叫函数，可重用的代码块。

- 封装一段特定的业务逻辑。
- 方法尽可能独立，一个方法只干一件事。
- 方法可以别反复调用多次。
- 减少代码冗余，有利于代码维护，有利于团队协作。

## 方法的五要素

```
修饰符 返回值类型 方法名(参数列表) {
    方法体
}
```

## 方法的调用

根据有无返回值：

1. 无返回值：`方法名(有参传参)`
2. 有返回值：`变量类型 变量名 = 方法名(有参传参)`

## return 关键字

两种形式：

1. ```
   return 值;
   ```

    

   \- 用在有返回值的方法中

   - 结束方法的执行
   - 返回值

2. ```
   return;
   ```

    

   \- 用在无返回值的方法中

   - 结束方法的执行

