package edu.insightr.gildedrose;

import java.util.Date;

public class Sulfuras extends Item{

    public Sulfuras() {
        super();
    }

    public Sulfuras(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public Sulfuras(String name, int sellIn, int quality , Date creationDate) {
        super(name, sellIn, quality, creationDate);
    }

    @Override
    public void accept(IVisitor v){
        v.visit(this);

    }
}
