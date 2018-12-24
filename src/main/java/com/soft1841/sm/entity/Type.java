package com.soft1841.sm.entity;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * 类别实体类
 */
public class Type {
    //及JavaFX属性绑定的形式，定义和数据表字段id和type_name对应的属性，注意命名规范
    private final SimpleLongProperty id = new SimpleLongProperty();
    private final SimpleStringProperty typeName = new SimpleStringProperty("");

}
