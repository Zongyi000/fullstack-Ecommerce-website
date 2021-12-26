package com.luv2code.ecommerce.entity;   // 这个文件属于develop JPA Entities

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity   //@Entity 是一个类注解，用来注解该类是一个实体类用来进行和数据库中的表建立关联关系
@Table(name="product") // @Table 注解也是一个类注解，该注解可以用来修改表的名字
@Data
public class Product {

    @Id // @Id 类的属性注解，该注解表明该属性字段是一个主键，该属性必须具备，不可缺少
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 该注解由数据库自动生成，主键自增型
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private ProductCategory category;

    @Column(name = "sku")
    private String sku;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "unit_price")
    private BigDecimal unitPrice;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "active")
    private boolean active;

    @Column(name = "units_in_stock")
    private int unitsInStock;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;
}
