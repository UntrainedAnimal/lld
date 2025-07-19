package org.example.design_patterns.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
public class Composite implements Component{
    private final String name;
    List<Component> components;
    {
        components = new ArrayList<>();
    }


    @Override
    public void showPrice() {
        for (Component c:components){
            c.showPrice();
        }
    }

    public void addComponent(Component subComponent){
        components.add(subComponent);
    }
}
