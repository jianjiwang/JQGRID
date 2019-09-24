package com.baizhi.action;

import com.baizhi.entity.Department;
import com.baizhi.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/department")
public class DepartmentAction {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/selectAll")
    public void showAll(HttpServletResponse response) throws Exception {
        List<Department> departments = departmentService.selectAll();
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        StringBuilder sb = new StringBuilder();
        sb.append("<select>");
        for (Department department : departments) {
            sb.append("<option value=" + department.getId() + ">" + department.getDepartmentname() + "</option>");
        }
        sb.append("</select>");
        out.print(sb.toString());
        out.close();
    }
}
