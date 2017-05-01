package com.softgroup.common.dao.entities;

import com.softgroup.common.dao.api.BaseEntity;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.List;

/**
 * Created by yuriy27 on 01.05.17.
 */
@Entity
@Table(name = "conversation_details")
public class ConversationDetailsEntity extends BaseEntity {

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ProfileEntity> members;

}
