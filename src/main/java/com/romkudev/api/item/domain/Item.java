package com.romkudev.api.item.domain;

import com.romkudev.api.order.domain.Order;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Entity
@Data
@Table(name = "items")
public class Item {
    @Id
    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "item_brand")
    private String itemBrand;

    @Column(name = "model_no")
    private String modelNo;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_color")
    private String itemColor;

    @Column(name = "release_date")
    private String releaseDate;

    @Column(name = "sold_out")
    private Boolean soldOut;

    @OneToMany(mappedBy = "item")
    private List<Order> orders = new ArrayList<>();

    @Builder
    public Item(String itemBrand, String itemName, String itemColor) {
        this.itemBrand = itemBrand;
        this.itemName = itemName;
        this.itemColor = itemColor;
    }

    @Override
    public String toString() {
        return String.format("아이템 스펙 : %s, %s, %s ", itemBrand, itemName, itemColor);
    }
}
