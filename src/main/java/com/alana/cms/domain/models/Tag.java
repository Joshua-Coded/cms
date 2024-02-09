package com.alana.cms.domain.models;

import lombok.Data;

import javax.persistence.Embeddable;

/**
 * @author Joshua Alana 9/02/24
 */
@Data
@Embeddable
public class Tag {
    String value;
}
