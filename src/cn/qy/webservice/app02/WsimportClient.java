package cn.qy.webservice.app02;



//调用本地的Webservice服务的代理（由wsimport生成）
public class WsimportClient {
    public static void main(String[] args){
        PhoneServiceService phoneServiceService = new PhoneServiceService();
        PhoneService phoneService = phoneServiceService.getPhoneServicePort();
        Phone phone = phoneService.getPhoneInformation("sss");
        System.out.println(phone.getBrand()+ " " + phone.getOs()+ " "+ phone.getPrice());
    }
}
