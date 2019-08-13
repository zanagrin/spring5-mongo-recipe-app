package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Created by jt on 6/21/17.
 */
@Getter
@Setter
@NoArgsConstructor
public class IngredientCommand {
    private String Id;
    private String RecipeId;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureCommand uom;
}
