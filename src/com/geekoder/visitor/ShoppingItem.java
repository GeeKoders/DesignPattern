package com.geekoder.visitor;

public interface ShoppingItem {
	public double accept(ShoppingCartVisitor visitor);
}
