# java training

这个仓库用来存放达内学习Java的代码。好像是要弥补遗憾。
我曾经学过代码，但是没有成功。多年以后，当我再次敲起键盘，这次或许会有不同？
这次仅仅是一次尝试，毕竟行业挺卷的，实在不行写完webserver就先放下吧。
对，至少先写完webserver, 后面可以继续学的呀。慢慢学，欲速则不达。

## 从什么地方开始呢？

1. 复习以前写的网页小项目
2. 把 pong 用 html css javascript 复刻出来
3. 整理 java 笔记
4. 学习黑马前端
5. 学习黑马 Java

### 准备工作：重新熟悉开发工具和环境

#### 首先配置一下本地的 git

终端输入命令`git config --list`,看了一下没有问题。

#### 把这个仓库克隆到本地

```
cd Github
git clone https://github.com/jiao-shi-yu/try-Again.git
```

#### 新建 web-project 文件，并使用 git 初始化

```
mkdir web-projects
cd web-projects
git init
mkdir marquee
cd marquee
touch index.html
```

##### 然后就是写代码环节，这里用**VS Code**编辑

```html
<!DOCTYPE html>
<html>
  <head>
    <title>跑马灯动效</title>
  </head>
  <body></body>
</html>
```

之前，我的 VS code 已经安装了实时预览的插件。所以这里直接`command + L`接`command + O`，在浏览器中观看，标签页正常显示了标题。

##### 简单回顾一下，之前写的代码

发现：是用 CSS keyframes 写的动画，来实现一个跑马灯的效果。

##### 好啦，开始复刻跑马灯项目

那么先在 HTML 文档**body**里写一个`<a><span>音乐节</span></a>`.**head**里链接样式文件`<link rel="stylesheet" href="main.css" />`。

###### 添加样式

首先，为了更好的跑马灯效果，把页面背景颜色，调成黑色。字体颜色调成白色。

```css
html,
body {
  background-color: #000;
  color: #fff;
}
```

然后，把它定义为一个按钮的类。让它显示在屏幕中间，它的文本也是居中的。

```html
<a href="#" class="button"><span>音乐节</span></a>
```

全局选择器，`box-sizing: border-box;`，所有的盒子模型的内边距和外边距都是包含在宽度里面的。

```css
* {
  box-sizing: border-box;
}
```

###### 确定`<a>`的样式

前面给`<a> `元素加了一个`href`属性，导致它变成蓝色文本下划线的样式了。所以这里给他还原成白字无底。

```css
.button {
  color: #fff;
  text-decoration: none;
}
```

其余的参看注释，不一一解释了。

```CSS
.button {
  /* 字体相关 */

  color: #fff;
  text-decoration: none;
  text-align: center;
  /* 布局相关 */

  /* 外边距: 上下0，左右自动 */
  margin: 0 auto;
  /* 给它一个两百像素的宽 */
  width: 200px;
  /*  */
  display: block;
  /* 位置相对 */
  position: relative;
  /* 距离上边50个单位 */
  top: 50vh;

  /* 背景颜色 */
  background-image: linear-gradient(
    115deg,
    #4fcf70,
    #fad648,
    #a767e5,
    #12bcfe,
    #44ce7b
  );
  /* 圆角更好看 */
  border-radius: 6px;
}
```

###### 这才发现，它其实是这样的：`<a/>`元素有一个彩色渐变的背景，内含的`<span>`会挡在他前面，这样看起来好像有一个彩色渐变的边框。然后通过平移这个彩色渐变背景，来实现跑马灯效果。

> 给一个元素中设置 overflow:hidden，那么该元素的内容若超出了给定的宽度和高度属性，那么超出的部分将会被隐藏，不占位。

###### 设置`<span>`的样式

```css
.button span {
  /* 最为关键一条：span 改为block, 否则下面的 margin padding 不生效*/
  display: block;

  /* 要要设置外边距 因前面border-box, 会与a元素重合 */
  margin: 3px;
  padding: 12px 0;

  /* 也来个圆角 */
  border-radius: 3px;

  /* 比较关键一条：背景设置为黑色 */
  background: #000;
  /* 字体相关 */
  padding: 12px;
}
```

###### 定义动画

```css
/* 定义一个关键帧动画, background-position 属性*/
@keyframes play {
  0% {
    background-position: 00px;
  }
  25% {
    background-position: -150px;
  }
  50% {
    background-position: -300px;
  }
  75% {
    background-position: -150px;
  }
  100% {
    background-position: 0px;
  }
}
```

###### 鼠标悬停时触发动画

```css
/* 当鼠标悬停在.button类元素上时,开启动画 */
.button:hover {
  animation: play 2s ease-in infinite;
}
```

写完啦,可以可以,不错不错!

###### 提交到本地仓库,并pull到远程仓库

```
git add ./
git status
git commit -m "跑马灯写完咯,休息休息~"
git log

```

