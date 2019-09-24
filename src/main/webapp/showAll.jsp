<%@  page pageEncoding="UTF-8" contentType="text/html;UTF-8" isELIgnored="false" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <!--引入BootStrap的相关css样式-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/boot/css/bootstrap.css"/>
    <!--引入JQGRID与BootStrap整合的主体css样式-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/boot-jqgrid/css/trirand/ui.jqgrid-bootstrap.css"/>
    <!--引入Jquery的js文件-->
    <script type="application/javascript" src="${pageContext.request.contextPath}/boot/js/jquery-3.3.1.min.js"></script>
    <!--引入BOOTStrap的相关js文件-->
    <script type="application/javascript" src="${pageContext.request.contextPath}/boot/js/bootstrap.js"></script>
    <!--引入JQGRID与BootStrap整合的国际化js文件-->
    <script type="application/javascript"
            src="${pageContext.request.contextPath}/boot-jqgrid/js/trirand/i18n/grid.locale-cn.js"></script>
    <!--引入JQGRID与BootStrap整合的全局js文件-->
    <script type="application/javascript"
            src="${pageContext.request.contextPath}/boot-jqgrid/js/trirand/jquery.jqGrid.min.js"></script>
    <script type="application/javascript">
        $(function () {
            $("#list").jqGrid({
                styleUI: "Bootstrap",
                url: "${pageContext.request.contextPath}/user/showAll.do",
                autowidth: true,
                datatype: "json",
                pager: "#pager",
                rowNum: 3,
                rowList: [3, 6, 9, 12],
                viewrecords: true,
                editurl: "${pageContext.request.contextPath}/user/edit.do",//增删改URl
                colNames: ["用户ID", "用户名", "密码", "年龄", "部门"],
                colModel: [
                    {name: "id"},
                    {name: "username", editable: true},
                    {name: "password", editable: true},
                    {name: "age", editable: true},
                    {
                        name: "department.id", editable: true, edittype: "select",
                        editoptions: {dataUrl: "${pageContext.request.contextPath}/department/selectAll.do"},
                        //单元格值    整个JQGRID对象  该行对象
                        formatter: function (cellvalue, options, rowObject) {
                            //返回部门名称
                            return rowObject.department.departmentname;
                        }
                    }
                ]
            }).jqGrid("navGrid", "#pager", {edit: true}); //开启JQGRID的增删改
        })
    </script>
</head>
<body>


<!--准备数据表格-->
<table id="list"></table>

<div id="pager"></div>


</body>
</html>