package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.util.UUID;
/**
 * Created by kimoso david on 2021-12-11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

    @Null
    private UUID id;

    @NotBlank(message = "Customer name cannot be null")
    @Size(min=3, max = 100, message = "Customer name should be of size between 3 and 100")
    private  String customerName;
}
