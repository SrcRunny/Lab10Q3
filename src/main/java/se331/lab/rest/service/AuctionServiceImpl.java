package se331.lab.rest.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import se331.lab.rest.dao.AuctionDao;
import se331.lab.rest.dao.BidDao;
import se331.lab.rest.entity.AuctionItem;
import se331.lab.rest.entity.Bid;

@Service
@RequiredArgsConstructor
public class AuctionServiceImpl implements AuctionService{
    final AuctionDao auctionDao;

    @Override
    public Integer getAuctionItemSize(){

        return auctionDao.getAuctionItemSize();
    }

    @Override
    public Page<AuctionItem> getAuctionItems(Integer pageSize, Integer page){
        return auctionDao.getAuctionItems(pageSize, page);
    }

    @Override
    public AuctionItem getAuctionItem(Long id){
        return auctionDao.getAuctionItem(id);
    }

    @Override
    public AuctionItem save(AuctionItem auctionItem) {
        return null;
    }

    @Override
    public Page<AuctionItem> getAuctionItems(String title, Pageable pageable){
        return auctionDao.getAuctionItems(title,pageable);
    }

}
