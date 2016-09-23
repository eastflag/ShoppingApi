package eastflag.auction;

import kr.co.auction.schema.arche_apisvc.RequestApplicationTicketRequestT;

/**
 * Created by eastflag on 2016-09-23.
 */
public class SecurityService {
    //아래 부분은 맞게 수정한다.
    private String devID = "eastflag ";    // API 커뮤니티 회원 아디이
    private String appID = "javabrain";    // API 어플리케이션 아이디
    private String appPW = "brain98";    // API 어플리케이션 패스워드

    private static String appTicket;

    public String GetApplicationTicket() {
/*        try {
            SecurityServiceSoapProxy securityProxy = new SecurityServiceSoapProxy();
            SecurityServiceSoapStub securityStub = (SecurityServiceSoapStub) securityProxy.getSecurityServiceSoap();

            RequestApplicationTicketRequestT req = new RequestApplicationTicketRequestT();
            req.setAppID(appID);
            req.setDevID(devID);
            req.setAppPassword(appPW);

            appTicket = securityStub.requestApplicationTicket(req);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
        return appTicket;

    }
}
