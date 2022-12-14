
package com.pavel.vaadin.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "street",
        "suite",
        "city",
        "zipcode",
        "geo"
})
@Generated("jsonschema2pojo")
@Data
public class Address {

    @JsonProperty("street")
    private String street;

    @JsonProperty("suite")
    private String suite;

    @JsonProperty("city")
    private String city;

    @JsonProperty("zipcode")
    private String zipcode;

    @JsonProperty("geo")
    private Geo geo;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
