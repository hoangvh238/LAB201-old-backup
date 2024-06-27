package model.Enum;

public enum Gender {
      female(1),male(2);
      private int value;
      Gender(int value) {
            this.setValue(value);
      }

      public int getValue() {
            return value;
      }

      public void setValue(int value) {
            this.value = value;
      }
}

