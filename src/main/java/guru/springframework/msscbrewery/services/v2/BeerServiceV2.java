package guru.springframework.msscbrewery.services.v2;

import guru.springframework.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * Created by Kimoso on 12/11/2021
 */
public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveBeer(BeerDtoV2 beerDtoV2);

    void updateBeer(BeerDtoV2 beerDtoV2);

    void deleteById(UUID beerId);
}
