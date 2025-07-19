package org.example.design_patterns.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Leaf implements Component {
    private String name;
    private Double price;


    @Override
    public void showPrice() {
        System.out.println(this.price);
    }
}
