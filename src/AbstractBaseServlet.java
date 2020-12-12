package org.example.servlet;

import org.example.AppException;
import org.example.model.JSONResponse;
import org.example.util.JSONUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class AbstractBaseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //设置请求体编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应体的编码
        resp.setCharacterEncoding("utf-8");
        //设置响应体的数据类型（浏览器要采取什么方式执行）
        resp.setContentType("application/json");

        //Session会话管理：除登录和注册接口，其他都需要登录后访问
        //req.getServletPath()获取请求服务路径
        //TODO
        JSONResponse json = new JSONResponse();
        try{

        //调用子类重写的方法
            Object data = process(req,resp);
            //子类的process方法执行w完没有抛异常，表示业务执行成功
            json.setSuccess(true);
            json.setData(data);

    }catch(Exception e){
           //异常如何处理？JDBC异常SQLException，JSON处理的异常
            e.printStackTrace();
            //json.setSuccess(false)不用设置，因为new的时候就是
            String code = "UNKNOWN";
            String s = "未知错误";
            if(e instanceof AppException){
                code = ((AppException) e).getCode();
              s = e.getMessage();
            }
            json.setCode(code);
            json.setMessage(s);
        }
        PrintWriter pw = resp.getWriter();
        pw.println(JSONUtil.serialize(json));
        pw.flush();
        pw.close();
    }

    protected abstract  Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception;  {

    }

    }


