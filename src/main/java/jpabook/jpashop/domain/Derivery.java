package jpabook.jpashop.domain;

import javax.persistence.*;

public class Derivery {
    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    @Embedded
    private  Address address;

    @Enumerated(EnumType.STRING)
    private DeleveryStatus status; // READY, COMP

}
