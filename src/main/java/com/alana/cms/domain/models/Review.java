package com.alana.cms.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

/**
 * @author Joshua Alana 09/02/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Review {
    String userId;
    String status;
}
