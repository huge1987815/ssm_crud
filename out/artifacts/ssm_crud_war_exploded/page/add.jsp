<%--
  Created by IntelliJ IDEA.
  User: 82386
  Date: 2019/5/27
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Title</title>
	<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
	<link rel="stylesheet" type="text/css" href="${path}/resource/css/css.css"/>
	<script type="text/javascript" src="${path}/resource/jquery/jquery-3.2.1.js"></script>
	<script type="text/javascript" src="${path}/resource/My97DatePicker/WdatePicker.js"></script>
	<script type="text/javascript" src="${path}/resource/js/add.js"></script>
</head>
<body>
   <h1>添加员工信息</h1>   
   <hr>
   <form>
      <table>
	      <tr>
			  <td>姓名</td>
	          <td><input type="text" name="ename" id="ename"/></td>
	      </tr>
	      <tr>
	        <td>性别</td>
	          <td>
	          	<input type="radio" name="sex" value="男" checked="checked"/>男
	          	<input type="radio" name="sex" value="女"/>女
	          </td>
	      </tr>
	      <tr>
			  <td>出生日期</td>
	          <td><input type="text" name="birthdate" id="birthdate" onclick="WdatePicker()"/></td>
	      </tr>
		  <tr>
			  <td>爱好</td>
			  <td>
				  <input type="checkbox" name="hobby" value="看电影"/>上网
				  <input type="checkbox" name="hobby" value="跑步"/>跑步
				  <input type="checkbox" name="hobby" value="看书"/>看书
			  </td>
		  </tr>
	      <tr>
	        <td>部门名称</td>
	        <td>
	          <select name="did" id="did">
	             <option>------请选择-----</option>
	          </select>
	        </td>
	      </tr>
	      <tr>        
	        <td colspan="2"><input type="button" value="添加"/></td>
	      </tr>
	   </table>
   </form>   
</body>
</html>