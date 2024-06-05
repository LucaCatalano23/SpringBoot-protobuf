package com.luca.core.product.mapper;

import com.luca.core.product.persistence.ProductEntity;
import com.luca.core.product.web.dto.Product;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-06-05T11:07:32+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 21.0.3 (Microsoft)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product entityToApi(ProductEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Product product = new Product();

        product.setProductId( entity.getProductId() );
        product.setName( entity.getName() );
        product.setWeight( entity.getWeight() );

        return product;
    }

    @Override
    public ProductEntity apiToEntity(Product api) {
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
