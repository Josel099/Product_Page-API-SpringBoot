package com.livares.product.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.livares.product.Dto.ProductDTO;
import com.livares.product.model.UserProductCart;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProductCartRepositery extends JpaRepository<UserProductCart,Integer>{



    /**=================================================================
     * Queries the database to find the ID of the cart item associated with the given user ID and product ID.
     * @param userId The ID of the user
     * @param productId The ID of the product
     * @return The ID of the cart item if found, otherwise null
    ====================================================================*/
    @Query(value = "SELECT Id FROM UserProductCart " +
            " WHERE user.Id = :userId AND product.Id = :productId")
    Integer findByUserIdAndProductId(@Param("userId") int userId, @Param("productId") int productId);


}
