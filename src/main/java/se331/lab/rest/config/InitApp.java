package se331.lab.rest.config;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.lab.rest.entity.AuctionItem;
import se331.lab.rest.entity.Bid;
import se331.lab.rest.repository.AuctionRepository;
import se331.lab.rest.repository.BidRepository;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    final AuctionRepository auctionRepository;
    final BidRepository bidRepository;

    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        AuctionItem i1, i2, i3, i4, i5;
        i1 = auctionRepository.save(AuctionItem.builder()
                .description("EXCALIBUR")
                .type("Sword")
                .build()
        );

        i2 = auctionRepository.save(AuctionItem.builder()
                .description("Pepo")
                .type("Snack")
                .build()
        );
        i3 = auctionRepository.save(AuctionItem.builder()
                .description("GammyBid")
                .type("human")
                .build()
        );
        i4 = auctionRepository.save(AuctionItem.builder()
                .description("RachaWanonIce")
                .type("Animal")
                .build()
        );
        i5 = auctionRepository.save(AuctionItem.builder()
                .description("Vespa")
                .type("Vehicle")
                .build()
        );
        Bid b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
        b1 = bidRepository.save(Bid.builder()
                .amount(100)
                .datetime(LocalDateTime.now())
                .build()
        );
        b2 = bidRepository.save(Bid.builder()
                .amount(200)
                .datetime(LocalDateTime.now())
                .build()
        );
        b3 = bidRepository.save(Bid.builder()
                .amount(300)
                .datetime(LocalDateTime.now())
                .build()
        );
        b4 = bidRepository.save(Bid.builder()
                .amount(400)
                .datetime(LocalDateTime.now())
                .build()
        );
        b5 = bidRepository.save(Bid.builder()
                .amount(500)
                .datetime(LocalDateTime.now())
                .build()
        );
        b6 = bidRepository.save(Bid.builder()
                .amount(600)
                .datetime(LocalDateTime.now())
                .build()
        );
        b7 = bidRepository.save(Bid.builder()
                .amount(700)
                .datetime(LocalDateTime.now())
                .build()
        );
        b8 = bidRepository.save(Bid.builder()
                .amount(800)
                .datetime(LocalDateTime.now())
                .build()
        );
        b9 = bidRepository.save(Bid.builder()
                .amount(900)
                .datetime(LocalDateTime.now())
                .build()
        );
        b10 = bidRepository.save(Bid.builder()
                .amount(1000)
                .datetime(LocalDateTime.now())
                .build()
        );
        b11 = bidRepository.save(Bid.builder()
                .amount(1100)
                .datetime(LocalDateTime.now())
                .build()
        );
        b12 = bidRepository.save(Bid.builder()
                .amount(1200)
                .datetime(LocalDateTime.now())
                .build()
        );
        b13 = bidRepository.save(Bid.builder()
                .amount(1300)
                .datetime(LocalDateTime.now())
                .build()
        );
        b14 = bidRepository.save(Bid.builder()
                .amount(1400)
                .datetime(LocalDateTime.now())
                .build()
        );
        b15 = bidRepository.save(Bid.builder()
                .amount(1500)
                .datetime(LocalDateTime.now())
                .build()
        );
        b1.setItem(i1);
        b2.setItem(i1);
        b3.setItem(i1);
        i1.setSuccessfulbid(b3);

        b4.setItem(i2);
        b5.setItem(i2);
        b6.setItem(i2);
        i2.setSuccessfulbid(b6);

        b7.setItem(i3);
        b8.setItem(i3);
        b9.setItem(i3);
        i3.setSuccessfulbid(b9);

        b10.setItem(i4);
        b11.setItem(i4);
        b12.setItem(i4);
        i4.setSuccessfulbid(b12);

        b13.setItem(i5);
        b14.setItem(i5);
        b15.setItem(i5);
        i5.setSuccessfulbid(b15);


    }
}
