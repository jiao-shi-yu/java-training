V17
这一版中开始处理用户的注册

这里先补个坑，发现`Content-Type`和`Content-Length`与`entity`有强绑定关系。所以，在`setEntity()`把这两个头加进去即可。
