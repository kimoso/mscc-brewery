package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;
import guru.springframework.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
@Slf4j
@Service
public class BeerServiceImplV2 implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat").beerStyle(BeerStyleEnum.ALE)
                .build();
    }

    public BeerDtoV2 saveBeer(BeerDtoV2 beerDtoV2) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                //more fields to be added here
                .build();
    }

    @Override
    public void updateBeer(BeerDtoV2 beerDtoV2) {
    // todo impl - would add real impl to update beer
    }

    @Override
    public void deleteById(UUID beerId) {
    // todo impl - would add real impl to delete beer
        log.debug("Deleting a beer ....");
    }
}
