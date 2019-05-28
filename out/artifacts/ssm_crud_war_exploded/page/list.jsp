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
    <!--设置一个变量-->
    <c:set var="path" value="${pageContext.request.contextPath}" scope="page"/>
    <!--引入css样式-->
    <link rel="stylesheet" type="text/css" href="${path}/resource/css/css.css"/>
    <!--引入jquery库-->
    <script type="text/javascript" src="${path}/resource/jquery/jquery-3.2.1.js"></script>
    <script type="text/javascript" src="${path}/resource/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript" src="${path}/resource/js/list.js"></script>
<body>
    <h1>员工信息</h1>
    姓名:<input type="text" name="ename" id="ename" value="${ename}"/>
    出生日期:<input type="text" name="mindate" id="mindate" value="${mindate}" onclick="WdatePicker()"/>--
            <input type="text" name="maxdate" id="maxdate" value="${maxdate}" onclick="WdatePicker()"/>
    <input type="button" value="查询"/>
    <hr>
    <table>
        <tr>
            <th colspan="8">
                <input type="button" value="全选"/>
                <input type="button" value="全不选"/>
                <input type="button" value="反选"/>
                <input type="button" value="添加"/>
                <input type="button" value="批量删除"/>
            </th>
        </tr>
        <tr>
            <th><input type="checkbox" name="checkall"/>全选/全不选</th>
            <th>员工编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>出生日期</th>
            <th>爱好</th>
            <th>部门名称</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${page.list}" var="e">
            <tr>
                <td><input type="checkbox" value="${e.eid}" name="eid"/></td>
                <td>${e.eid}</td>
                <td>${e.ename}</td>
                <td>${e.sex}</td>
                <td>${e.birthdate}</td>
                <td>${e.hobby}</td>
                <td>${e.dept.dname}</td>
                <td>
                    <input type="button" value="修改"/>
                    <input type="hidden" value="${e.eid}"/>
                    <input type="button" value="删除">
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="8">
                第${page.pageNum}页/共${page.lastPage}页,记录[${page.total}]条
                <c:if test="${page.isFirstPage==true}"><!--是第一页时，首页和上一页是静态的-->
                    <input type="button" value="首页"/>
                    <input type="button" value="上一页"/>
                </c:if>
                <c:if test="${page.isFirstPage!=true}"><!--不是第一页时，首页和上一页是动态的-->
                    <a href="${path}/listemp.do?pagenum=${page.firstPage}"><input type="button" value="首页"/></a>
                    <a href="${path}/listemp.do?pagenum=${page.prePage}"><input type="button" value="上一页"/></a>
                </c:if>
                <c:if test="${page.isLastPage==true}"><!--是第尾页时，尾页和下一页是静态的-->
                    <input type="button" value="下一页"/>
                    <input type="button" value="尾页"/>
                </c:if>
                <c:if test="${page.isLastPage!=true}"><!--是第尾页时，尾页和下一页是动态的-->
                    <a href="${path}/listemp.do?pagenum=${page.nextPage}"><input type="button" value="下一页"/></a>
                    <a href="${path}/listemp.do?pagenum=${page.lastPage}"><input type="button" value="尾页"/></a>
                </c:if>
            </td>
        </tr>
    </table>
</body>
</html>
