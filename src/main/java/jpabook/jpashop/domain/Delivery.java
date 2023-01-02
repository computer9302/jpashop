package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Delivery {
    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    private Order order;

    @Embedded
    private  Address address;

    @Enumerated(EnumType.STRING)
    private DeleveryStatus status; // READY, COMP

}
