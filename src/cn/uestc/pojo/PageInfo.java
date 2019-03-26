package cn.uestc.pojo;

import java.util.List;

/**
 * 对分页记录的封装，以后写分页可以参照如此写法将数据进行封装，方便前端显示操作
 */
public class PageInfo {
    //一页多少记录
    private Integer pageSize;
    //第几页
    private Integer pageNumber;
    //所有记录可以分多少页
    private Long total;
    //分页查询得到的记录
    private List<?> peopleList;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<?> peopleList) {
        this.peopleList = peopleList;
    }
}
