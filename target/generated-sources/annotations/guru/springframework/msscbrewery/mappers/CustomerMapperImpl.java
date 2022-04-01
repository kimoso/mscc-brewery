package guru.springframework.msscbrewery.mappers;

import guru.springframework.msscbrewery.domain.Customer;
import guru.springframework.msscbrewery.domain.Customer.CustomerBuilder;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import guru.springframework.msscbrewery.web.model.CustomerDto.CustomerDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-02T00:42:04+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Amazon.com Inc.)"
)
@Component
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDto customerToDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDtoBuilder customerDto = CustomerDto.builder();

        customerDto.id( customer.getId() );
        customerDto.customerName( customer.getCustomerName() );

        return customerDto.build();
    }

    @Override
    public Customer customerDtoToCustomer(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        CustomerBuilder customer = Customer.builder();

        customer.id( customerDto.getId() );
        customer.customerName( customerDto.getCustomerName() );

        return customer.build();
    }
}
