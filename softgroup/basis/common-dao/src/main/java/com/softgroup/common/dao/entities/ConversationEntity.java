package com.softgroup.common.dao.entities;

import com.softgroup.common.dao.api.BaseEntity;
import com.softgroup.common.dao.entities.types.ConversationType;

import javax.persistence.*;

/**
 * Created by yuriy27 on 01.05.17.
 */
@Entity
@Table(name = "conversations")
public class ConversationEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "name")
    private String logoImageUri;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "name")
    private ConversationType type;

    @Column(name = "name")
    private Long lastMessageIndex;

}
