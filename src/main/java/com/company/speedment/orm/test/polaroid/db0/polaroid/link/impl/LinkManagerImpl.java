package com.company.speedment.orm.test.polaroid.db0.polaroid.link.impl;

import com.company.speedment.orm.test.polaroid.db0.polaroid.link.Link;
import com.company.speedment.orm.test.polaroid.db0.polaroid.link.LinkBuilder;
import com.company.speedment.orm.test.polaroid.db0.polaroid.link.LinkManager;
import com.speedment.orm.core.manager.AbstractSqlManager;
import java.lang.RuntimeException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * A manager implementation representing an entity (for example, a row) in the Table 'polaroid.db0.polaroid.link'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public class LinkManagerImpl extends AbstractSqlManager<java.util.List<?>, Link, LinkBuilder> implements LinkManager {
    
    public LinkManagerImpl() {
        setSqlEntityMapper(this::defaultReadEntity);
    }
    
    @Override
    public LinkBuilder builder() {
        return new LinkImpl();
    }
    
    @Override
    public LinkBuilder toBuilder(Link prototype) {
        return new LinkImpl(prototype);
    }
    
    @Override
    public Link persist(Link entity) {
        return entity;
    }
    
    @Override
    public Link remove(Link entity) {
        return entity;
    }
    
    protected Link defaultReadEntity(ResultSet resultSet) {
        final LinkBuilder builder = builder();
        try {
            builder.setFollower(resultSet.getLong("follower"));
            builder.setFollows(resultSet.getString("follows"));
        }
        catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
        return builder;
    }
}