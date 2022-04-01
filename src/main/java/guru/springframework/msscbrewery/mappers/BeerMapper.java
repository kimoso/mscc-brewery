package guru.springframework.msscbrewery.mappers;

import guru.springframework.msscbrewery.domain.Beer;
import guru.springframework.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by Kimoso on 4/2/2022
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
