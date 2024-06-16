package animais;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
// Parttenr Builder

@Data //Fornece os get, set e toString
@AllArgsConstructor //
@NoArgsConstructor
@Builder // constroi objetos de maneira mais flexivel
public class Animal {

    private String nome;
    private String dono;
    private String raca;
}
