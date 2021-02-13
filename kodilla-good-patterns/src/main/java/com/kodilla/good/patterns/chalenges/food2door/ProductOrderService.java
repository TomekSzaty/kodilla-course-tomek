package com.kodilla.good.patterns.chalenges.food2door;

public class ProductOrderService {
    private InformationService informationService;
    private BoughtService boughtService;
    private BoughtRepository boughtRepository;

    public ProductOrderService(InformationService informationService, BoughtService boughtService, BoughtRepository boughtRepository) {
        this.informationService = informationService;
        this.boughtService = boughtService;
        this.boughtRepository = boughtRepository;
    }
    public BoughtDto process(final BoughtRequest boughtRequest) {
        boolean isBought = boughtService.bought(boughtRequest.getUser(), boughtRequest.getBoughtTime(), boughtRequest.getOrder());
        if (isBought) {
            informationService.inform(boughtRequest.getUser(), boughtRequest.getOrder());
            boughtRepository.createBought(boughtRequest.getUser(), boughtRequest.getBoughtTime());
            return new BoughtDto(boughtRequest.getUser(), true);
        }else {
            return  new BoughtDto(boughtRequest.getUser(), false);
        }
    }
}
