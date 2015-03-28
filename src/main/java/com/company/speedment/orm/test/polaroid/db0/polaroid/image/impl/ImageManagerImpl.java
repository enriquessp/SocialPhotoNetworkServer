package com.company.speedment.orm.test.polaroid.db0.polaroid.image.impl;

import com.company.speedment.orm.test.polaroid.db0.polaroid.image.Image;
import com.company.speedment.orm.test.polaroid.db0.polaroid.image.ImageBuilder;
import com.company.speedment.orm.test.polaroid.db0.polaroid.image.ImageManager;
import com.speedment.orm.core.manager.AbstractSqlManager;
import java.lang.RuntimeException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.stream.Stream;
import javax.annotation.Generated;

/**
 * A manager implementation representing an entity (for example, a row) in the Table 'polaroid.db0.polaroid.image'.
 * <p>
 * This Class or Interface has been automatically generated by Speedment.
 * Any changes made to this Class or Interface will be overwritten.
 * 
 * @author Speedment 
 */
@Generated("Speedment")
public class ImageManagerImpl extends AbstractSqlManager<Long, Image, ImageBuilder> implements ImageManager {
    
    public ImageManagerImpl() {
        setSqlEntityMapper(this::defaultReadEntity);
    }
    
    @Override
    public ImageBuilder builder() {
        return new ImageImpl();
    }
    
    @Override
    public ImageBuilder toBuilder(Image prototype) {
        return new ImageImpl(prototype);
    }
    
    @Override
    public Image persist(Image entity) {
        return entity;
    }
    
    @Override
    public Image remove(Image entity) {
        return entity;
    }
    
    protected Image defaultReadEntity(ResultSet resultSet) {
        final ImageBuilder builder = builder();
        try {
            builder.setId(resultSet.getLong("id"));
            builder.setUploader(resultSet.getLong("uploader"));
            builder.setTitle(resultSet.getString("title"));
            builder.setDescription(resultSet.getString("description"));
            builder.setImgData(resultSet.getString("img_data"));
            builder.setUploaded(resultSet.getTimestamp("uploaded"));
        }
        catch (SQLException sqle) {
            throw new RuntimeException(sqle);
        }
        return builder;
    }
}