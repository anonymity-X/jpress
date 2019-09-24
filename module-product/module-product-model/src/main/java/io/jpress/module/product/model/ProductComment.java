package io.jpress.module.product.model;

import io.jboot.db.annotation.Table;
import io.jpress.module.product.model.base.BaseProductComment;

/**
 * Generated by JPress.
 */
@Table(tableName = "product_comment", primaryKey = "id")
public class ProductComment extends BaseProductComment<ProductComment> {

    private static final long serialVersionUID = 1L;

    public static final String STATUS_NORMAL = "normal"; //正常
    public static final String STATUS_UNAUDITED = "unaudited"; //待审核
    public static final String STATUS_TRASH = "trash"; //垃圾箱

}
