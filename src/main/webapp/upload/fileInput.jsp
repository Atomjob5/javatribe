<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>文件上传下载</title>  
</head>  
<body>  
    <form action="http://localhost:8080/javatribe/file/upload" method="post" enctype="multipart/form-data">  
        选择文件:<input type="file" name="file" width="120px">  
        <input type="submit" value="上传">  
    </form>
    <hr>  
    <form action="http://localhost:8080/javatribe/file/down" method="get"> 
    	<input type="hidden" name="fileName" value="front-end" />  
        <input type="submit" value="前端作业下载" />  
    </form>  
    <form action="http://localhost:8080/javatribe/file/down" method="get"> 
   	    <input type="hidden" name="fileName" value="back-end" />  
        <input type="submit" value="后端作业下载">  
    </form>  
    <form action="http://localhost:8080/javatribe/file/down" method="get">  
  	    <input type="hidden" name="fileName" value="design" /> 
        <input type="submit" value="设计作业下载">  
    </form>  
    <form action="http:///localhost:8080/javatribe/file/down" method="get"> 
        <input type="hidden" name="fileName" value="python" />  
        <input type="submit" value="python作业下载">  
    </form>  
    <form action="http://localhost:8080/javatribe/file/down" method="get">  
        <input type="hidden" name="fileName" value="algorithm" /> 
        <input type="submit" value="算法作业下载">  
    </form>
    <form action="http://localhost:8080/javatribe/file/down" method="get">
    	<input type="hidden" name="fileName" value="product" />  
        <input type="submit" value="产品作业下载">  
    </form>
</body>
</html>