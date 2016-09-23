package eastflag.auction;

import kr.co.auction.schema.arche_apisvc.RequestApplicationTicketRequestT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

/**
 * Created by eastflag on 2016-09-23.
 */
public class AuctionClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(AuctionClient.class);

    //아래 부분은 맞게 수정한다.
    private String devID = "eastflag ";    // API 커뮤니티 회원 아디이
    private String appID = "javabrain";    // API 어플리케이션 아이디
    private String appPW = "brain98";    // API 어플리케이션 패스워드

    public String GetApplicationTicket() {
        String appTicket = null;
        try {

            RequestApplicationTicketRequestT req = new RequestApplicationTicketRequestT();
            req.setAppID(appID);
            req.setDevID(devID);
            req.setAppPassword(appPW);

            appTicket = (String) getWebServiceTemplate().marshalSendAndReceive("https://api.auction.co.kr/APIv1/SecurityService.asmx", req,
                    new SoapActionCallback("http://ws.cdyne.com/WeatherWS/GetCityForecastByZIP"));

            System.out.println(appTicket);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return appTicket;
    }

}
