package se331.lab.rest.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.lab.rest.entity.AuctionItem;
import se331.lab.rest.repository.AuctionRepository;

@Repository
@RequiredArgsConstructor
@Profile("db")
public class AuctionDaoImpl implements AuctionDao{
    final AuctionRepository auctionRepository;
    @Override
    public Integer getAuctionItemSize(){
        return Math.toIntExact(auctionRepository.count());
    }

    @Override
    public Page<AuctionItem> getAuctionItem(Integer pageSize, Integer page) {
        return null;
    }

    @Override
    public Page<AuctionItem> getAuctionItems(Integer pageSize, Integer page){
        return auctionRepository.findAll(PageRequest.of(page - 1, pageSize));
    }


    @Override
    public AuctionItem getAuctionItem(Long id) {
        return auctionRepository.findById(id).orElse(null);
    }
    @Override
    public AuctionItem save(AuctionItem auctionItem) {
        return auctionRepository.save(auctionItem);
    }

    @Override
    public Page<AuctionItem> getAuctionItems(String name, Pageable page) {
        return null;
    }

    @Override
    public Page<AuctionItem> getAuctionItem(String title, Pageable page){
        return auctionRepository.findByDescriptionIgnoreCaseContainingOrTypeIgnoreCaseContaining(title,title,page);
    }
}
