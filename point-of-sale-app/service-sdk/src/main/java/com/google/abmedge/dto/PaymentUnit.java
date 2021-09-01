package com.google.abmedge.dto;

import java.util.UUID;

public class PaymentUnit {

  private UUID itemId;
  private String name;
  private long quantity;
  private Number totalCost;

  public PaymentUnit() {}

  public PaymentUnit(UUID itemId, String name, long quantity, Number totalCost) {
    this.itemId = itemId;
    this.name = name;
    this.quantity = quantity;
    this.totalCost = totalCost;
  }

  public UUID getItemId() {
    return itemId;
  }

  public void setItemId(UUID itemId) {
    this.itemId = itemId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getQuantity() {
    return quantity;
  }

  public void setQuantity(long quantity) {
    this.quantity = quantity;
  }

  public Number getTotalCost() {
    return totalCost;
  }

  public void setTotalCost(Number totalCost) {
    this.totalCost = totalCost;
  }
}
