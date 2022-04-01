package guru.springframework.msscbrewery.mappers;

import guru.springframework.msscbrewery.domain.Customer;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * Created by Kimoso on 4/2/2022
 */
@Mapper
public interface CustomerMapper {
    CustomerDto customerToDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);

}
