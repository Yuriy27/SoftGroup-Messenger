package com.softgroup.common.dao.entities;

import com.softgroup.common.dao.api.BaseEntity;
import com.softgroup.common.dao.entities.types.MessageStatus;
import com.softgroup.common.dao.entities.types.MessageType;

import javax.persistence.*;

/**
 * Created by yuriy27 on 01.05.17.
 */
@Entity
@Table(name = "messages")
public class MessageEntity extends BaseEntity {

    @Column(name = "sender_id")
    private String senderId;

    @Column(name = "conversation_id")
    private String conversationId;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "message_type")
    private MessageType messageType;

    @Column(name = "payload")
    private String payload;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "status")
    private MessageStatus status;

    @Column(name = "create_time")
    private Long createTime;

    @Column(name = "server_recieve_time")
    private Long serverRecieveTime;

    @Column(name = "message_index")
    private Long messageIndex;

}
