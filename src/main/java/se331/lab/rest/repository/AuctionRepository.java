package se331.lab.rest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import se331.lab.rest.entity.AuctionItem;

import java.util.List;

public interface AuctionRepository extends JpaRepository <AuctionItem ,Long>{

    List<AuctionItem> findAll();

    Page<AuctionItem> findByDescriptionIgnoreCaseContainingOrTypeIgnoreCaseContaining(String description,String type, Pageable pageRequest);

}
