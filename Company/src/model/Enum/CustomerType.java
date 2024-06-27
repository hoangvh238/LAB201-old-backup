package model.Enum;

public enum CustomerType {
     news(1),member(2), vip(3);
     int value;

     CustomerType(int value) {
          this.value = value;
     }

     public int getValue() {
          return value;
     }

     public void setValue(int value) {
          this.value = value;
     }
}
