package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by kimoso david on 2021-12-11
 */
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("David Kazi")
                .build();
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                //more fields to the added
                .build();
    }

    @Override
    public void updateCustomer(CustomerDto customerDto) {
        // todo impl - would add real impl to update customer
    }

    @Override
    public void deleteById(UUID customerId) {
        // todo impl - would add real impl to delete customer
        log.debug("Deleting a customer ....");
    }
}
