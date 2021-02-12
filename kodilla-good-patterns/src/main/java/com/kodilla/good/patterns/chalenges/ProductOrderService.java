package com.kodilla.good.patterns.chalenges;

public class ProductOrderService {

    private InformationService informationService;
    private ToBuyService toBuyService;
    private ToBuyRepository toBuyRepository;

    public ProductOrderService(InformationService informationService,
                               ToBuyService toBuyService,
                               ToBuyRepository toBuyRepository) {
        this.informationService = informationService;
        this.toBuyService = toBuyService;
        this.toBuyRepository = toBuyRepository;
    }
    public ToBuyIt process(final ToBuyRequest toBuyRequest) {
        boolean isBought = toBuyService.bought(toBuyRequest.getUser(),
                toBuyRequest.getBoughtTime());
        if (isBought) {
            informationService.inform(toBuyRequest.getUser());
            toBuyRepository.createBought((toBuyRequest.getUser()),
            toBuyRequest.getBoughtTime());
            return new ToBuyIt(toBuyRequest.getUser(),true);
        }else {
            return new ToBuyIt(toBuyRequest.getUser(),true);
        }
    }
}
