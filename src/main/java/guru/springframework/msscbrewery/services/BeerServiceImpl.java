package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                //more fields to be added here
                .build();
    }

    @Override
    public void UpdateBeer(BeerDto beerDto) {
    // todo impl - would add real impl to update beer
    }

    @Override
    public void deleteById(UUID beerId) {
    // todo impl - would add real impl to delete beer
        log.debug("Deleting a beer ....");
    }
}
