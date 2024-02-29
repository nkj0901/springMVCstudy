package hello.itemservice.domain.item;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.ScriptAssert;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
//@ScriptAssert(lang = "javascript", script = "_this.price * _this.quantity >= 10000", message = "총합이 만원 넘게 입력해주세요")
public class Item {

//    @NotNull(groups = Updatecheck.class)
    private Long id;

//    @NotBlank(groups = Updatecheck.class)
    private String itemName;

//    @NotNull(groups = {SaveCheck.class, Updatecheck.class})
//    @Range(min = 1000, max = 1000000)
    private Integer price;

//    @NotNull(groups = {SaveCheck.class, Updatecheck.class})
//    @Max(value = 9999, groups = SaveCheck.class)
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
