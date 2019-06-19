package examples.android.example.com.yamsaferuitask.models;

import examples.android.example.com.yamsaferuitask.Enum.CardType;

public class BaseCardModel {

   public CardType type;
   public Object value;


    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}



