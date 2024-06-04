package com.luca.core.product.mapper;

import com.luca.core.product.persistence.ProductEntity;
import com.luca.product.protobuf.ProductProto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-04T10:04:23+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.3 (Microsoft)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductProto.Product entityToApi(ProductEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ProductProto.Product.Builder product = ProductProto.Product.newBuilder();

        product.setProductId( entity.getProductId() );
        product.setName( entity.getName() );
        product.setWeight( entity.getWeight() );

        return product.build();
    }

    @Override
    public ProductEntity apiToEntity(ProductProto.Product api) {
        if ( api == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setProductId( api.getProductId() );
        productEntity.setName( api.getName() );
        productEntity.setWeight( api.getWeight() );

        return productEntity;
    }
}
