package eastflag.auction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

/**
 * Created by eastflag on 2016-09-23.
 */
@Configuration
public class AuctionConfiguration {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPaths("kr.co.auction.apiv1.shoppingservice",
                "kr.co.auction.schema.arche_apisvc",
                "kr.co.auction.schema.arche_code",
                "kr.co.auction.schema.arche_item3",
                "kr.co.auction.schema.arche_itempage3_service",
                "kr.co.auction.schema.arche_sell3_service",
                "kr.co.auction.schema.arche_service",
                "kr.co.auction.schema.iac_buy_api",
                "kr.co.auction.security",
                "kr.co.auction.serviceinterfaces");
        return marshaller;
    }

    @Bean
    public AuctionClient auctionClient(Jaxb2Marshaller marshaller) {
        AuctionClient client = new AuctionClient();
        client.setDefaultUri("http://api.auction.co.kr/APIv1");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
