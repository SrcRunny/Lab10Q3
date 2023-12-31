package se331.lab.rest.util;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import se331.lab.rest.entity.AuctionItem;
import se331.lab.rest.entity.Bid;
import se331.lab.rest.entity.*;


import java.util.List;

@Mapper
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);

    AuctionItemDTO getAuctionItemDto(AuctionItem auctionItem);
    List<AuctionItemDTO> getAuctionItemDto(List<AuctionItem>auctionItems);
    BidDTO getBidDTO(Bid bid);
    List<BidDTO> getBidDTO(List<Bid> bids);

}
