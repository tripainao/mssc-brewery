package services;

import java.util.UUID;
import web.model.BeerDto;

public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDto getBeerById(UUID Id) {
		return BeerDto.builder().id(UUID.randomUUID()).
				beerName("kalanpilis").beerStyle("weath").build();
				
	}

}
