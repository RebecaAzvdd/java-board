--liquibase formatted sql
--changeset rebeca:202403209012
--comment: blocks table create

CREATE TABLE BLOCKS(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(225) NOT NULL,
    blocked_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    block_reason VARCHAR(225) NOT NULL,
    unblocked_at TIMESTAMP NULL,
    unblock_reason VARCHAR(225),
    card_id BIGINT NOT NULL,
    CONSTRAINT cards__blocks_fK foreign key (card_id) references CARDS(id) ON DELETE CASCADE
) ENGINE=InnoDB;

--rollback DROP TABLE BLOCKS