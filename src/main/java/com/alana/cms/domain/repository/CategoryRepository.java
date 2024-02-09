package com.alana.cms.domain.repository;
/**
 * @author Joshua Alana 09/02/24
 */
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.alana.cms.domain.models.Category;

public interface CategoryRepository extends JpaRepository<Category, String> {

    List<Category> findByName(String name);

    List<Category> findByNameIgnoreCaseStartingWith(String name);

}
