package cn.uestc.servlet;

import cn.uestc.pojo.PageInfo;
import cn.uestc.service.PageService;
import cn.uestc.service.impl.LogPageSizeImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/log")
public class LogPageServlet extends HttpServlet {
    private PageService pageService = new LogPageSizeImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page_Size = req.getParameter("pageSize");
        String page_Number = req.getParameter("pageNumber");
        int pageSize = 2;
        int pageNumber = 1;
        if (page_Size != null && !page_Size.trim().equalsIgnoreCase("")) {
            pageSize = Integer.parseInt(page_Size);
        }
        if (page_Number != null &&! page_Number.trim().equalsIgnoreCase("")) {
            pageNumber = Integer.parseInt(page_Number);;
        }
        PageInfo pageInfo = pageService.findPage(pageSize, pageNumber);
        resp.setCharacterEncoding("utf-8");
        req.setAttribute("pageInfo", pageInfo);
        req.getRequestDispatcher("/log.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
