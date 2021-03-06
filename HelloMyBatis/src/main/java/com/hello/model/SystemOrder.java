package com.hello.model;

public class SystemOrder {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_order.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_order.order_code
     *
     * @mbg.generated
     */
    private String orderCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_order.is_leaf
     *
     * @mbg.generated
     */
    private Boolean isLeaf;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_order.id
     *
     * @return the value of system_order.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_order.id
     *
     * @param id the value for system_order.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_order.order_code
     *
     * @return the value of system_order.order_code
     *
     * @mbg.generated
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_order.order_code
     *
     * @param orderCode the value for system_order.order_code
     *
     * @mbg.generated
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_order.is_leaf
     *
     * @return the value of system_order.is_leaf
     *
     * @mbg.generated
     */
    public Boolean getIsLeaf() {
        return isLeaf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_order.is_leaf
     *
     * @param isLeaf the value for system_order.is_leaf
     *
     * @mbg.generated
     */
    public void setIsLeaf(Boolean isLeaf) {
        this.isLeaf = isLeaf;
    }
}