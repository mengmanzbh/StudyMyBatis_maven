package cn.eaglefire.mybatis.util;

/**
 * Created by zhenghy on 2015/8/6.
 */
public class Pagination {

    private int offset;

    private int rows;

    private String column;

    private PaginationOrder order;

    /**
     *
     */
    public Pagination(){}

    /**
     *
     * @param offset
     * @param rows
     */
    public Pagination(int offset, int rows){
        this.offset = offset;
        this.rows = rows;
    }

    /**
     *
     * @param offset
     * @param rows
     * @param column
     * @param order
     */
    public Pagination(int offset, int rows, String column, PaginationOrder order){
        this(offset, rows);
        this.column = column;
        this.order = order;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public PaginationOrder getOrder() {
        return order;
    }

    public void setOrder(PaginationOrder order) {
        this.order = order;
    }
}
