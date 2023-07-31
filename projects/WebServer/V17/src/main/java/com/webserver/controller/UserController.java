package com.webserver.controller;

import com.webserver.http.HttpServletRequest;
import com.webserver.http.HttpServletResponse;
import com.webserver.vo.User;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;

/**
 * 处理与用户相关的业务
 */
public class UserController {
    // 所有的用户信息都保存在这个路径下
    private static File userDir;

    static {
        userDir = new File("./users");
        if (!userDir.exists()) {
            userDir.mkdirs();
        }
    }


    /**
     * 处理业务：用户注册
     */
    public void reg(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("开始处理用户注册的业务");

        // 获取用户在注册页面上，提交过来的信息
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String nickname = request.getParameter("nickname");
        String ageString = request.getParameter("age");


        // A.对用户提交的信息进行必要的验证

        // 1. 信息格式是否正确
        if (username == null || password == null || nickname == null
                || ageString == null || !ageString.matches("[0-9]+")) {
            File file = new File("./webapps/myweb/reg_info_error.html");
            response.setEntity(file);
            return;
        }


        // 创建一个File，表示要存储的用户对象
        File userFile = new File(userDir, username + ".obj");

        // 2. 用户是否已经存在
        //       如果用户已经存在，则返回用户已经存在的页面
        if (userFile.exists()) {
            File file = new File("./webapps/myweb/reg_have_user.html");
            response.setEntity(file);
            return;
        }

        int age = Integer.parseInt(ageString);

        // B.将用户信息保存
        // 用当前的信息，创建一个User对象，将该对象序列化到文件中。格式：用户名.obj
        User user = new User(username, password, nickname, age);
        // 使用对象输出流序列化
        try(
                ObjectOutputStream oos = new ObjectOutputStream(
                        Files.newOutputStream(userFile.toPath())
                )
        ) {
            oos.writeObject(user);
            System.out.println("写出完毕");

        }catch (IOException e) {
            e.printStackTrace();
        }

        // 设置响应页面
        File file = new File("./webapps/myweb/reg_success.html");
        response.setEntity(file);

    }
}
